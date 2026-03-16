package com.bsys.portifoliohenrique.infra.minio;

import com.bsys.portifoliohenrique.domain.portifolio.dto.ChangeImgDTO;
import io.minio.*;
import io.minio.errors.*;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

@Slf4j
@Service
@RequiredArgsConstructor
public class MinioService {

    private final MinioProperties props;
    private MinioClient client;

    @PostConstruct
    void init() throws Exception {

        client = MinioClient.builder()
                .endpoint(props.getUrl())
                .credentials(props.getAccessKey(), props.getSecretKey())
                .build();

        boolean exists = client.bucketExists(BucketExistsArgs.builder()
                .bucket(props.getBucket()).build());

        if (!exists) {

            client.makeBucket(MakeBucketArgs.builder()
                    .bucket(props.getBucket()).build());
            log.info("Bucket '{}' criado com sucesso", props.getBucket());

            String policy = """
                {
                  "Version": "2012-10-17",
                  "Statement": [
                    {
                      "Effect": "Allow",
                      "Principal": {"AWS": ["*"]},
                      "Action": ["s3:GetObject"],
                      "Resource": ["arn:aws:s3:::%s/*"]
                    }
                  ]
                }
                """.formatted(props.getBucket());

            client.setBucketPolicy(
                    SetBucketPolicyArgs.builder()
                            .bucket(props.getBucket())
                            .config(policy)
                            .build()
            );

            log.info("Bucket '{}' configurado como público", props.getBucket());

        }
    }

    public void uploadImg(String id, ChangeImgDTO dto) {

        try {
            String filePath = String.format("%s/%s/%s",
                    id,
                    dto.getSection(),
                    dto.getName());

            client.putObject(
                    PutObjectArgs.builder()
                            .bucket(props.getBucket())
                            .object(filePath)
                            .stream(dto.getFile().getInputStream(),
                                    dto.getFile().getSize(),
                                    -1)
                            .contentType(dto.getFile().getContentType())
                            .build()
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
