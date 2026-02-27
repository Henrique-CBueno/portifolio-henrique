package com.bsys.portifoliohenrique.domain.entity;

import com.bsys.portifoliohenrique.domain.dto.ProjectsResponseDTO;

import java.util.List;

public class ProjectsConstant {

    public static ProjectsResponseDTO PROJECTS = new ProjectsResponseDTO (List.of(

            new Project(
                    1L,
                    "FlashIdeas",
                    "Desenvolvi uma plataforma SaaS que transforma arquivos PDF em flashcards de estudo utilizando LLMs para análise, extração inteligente de conteúdo e geração automática dos cartões. Implementei autenticação robusta com JWT e two-factor authentication (2FA) via OTP para reforçar a segurança dos usuários. Para lidar com operações pesadas, como processamento de PDFs e geração de flashcards por IA, utilizei workers em background, garantindo uma experiência fluida e sem bloqueios na interface.",
                    "/projectsImages/flashideas.png",
                    List.of(
                            new Project.Tech(1L, "/icons/react.svg", "React.js"),
                            new Project.Tech(2L, "/icons/fastapi.svg", "FastAPI"),
                            new Project.Tech(3L, "/icons/postgresql.svg", "PostgreSQL"),
                            new Project.Tech(4L, "/icons/docker.svg", "Docker"),
                            new Project.Tech(5L, "/icons/redis.svg", "Redis"),
                            new Project.Tech(6L, "/icons/Agno.svg", "Agno")
                    ),
                    new Project.Link(
                            List.of("teste.com", "teste2.com"),
                            "https://flashideas.ai"
                    )
            ),

            new Project(
                    2L,
                    "Sistema Hoteleiro",
                    "Plataforma de gestão hoteleira com Liferay no core, portlets React no frontend e módulos OSGi em Java para reservas e operações. Complementada por dois microserviços Python com IA e RAG: um atendente virtual 24/7 (estado persistente em Redis) e um agente complexo que monta itinerários completos e personalizados após a reserva.",
                    "/projectsImages/hotel.png",
                    List.of(
                            new Project.Tech(8L, "/icons/react.svg", "React.js"),
                            new Project.Tech(9L, "/icons/java.svg", "Java"),
                            new Project.Tech(10L, "/icons/postgresql.svg", "PostgreSQL"),
                            new Project.Tech(11L, "/icons/python.svg", "Python"),
                            new Project.Tech(12L, "/icons/liferay.svg", "Liferay"),
                            new Project.Tech(13L, "/icons/redis.svg", "Redis"),
                            new Project.Tech(14L, "/icons/Agno.svg", "Agno")
                    ),
                    new Project.Link(
                            List.of("teste.com"),
                            "https://flashideas.ai"
                    )
            ),

            new Project(
                    8L,
                    "Analisador de saques com visão computacional",
                    "Projeto de IA que utiliza OpenCV para analisar saques, para visualização/correção de biomecânica.",
                    "/projectsImages/serve_analizer.png",
                    List.of(
                            new Project.Tech(26L, "/icons/python.svg", "Python"),
                            new Project.Tech(27L, "/icons/opencv.svg", "OpenCV")
                    ),
                    null
            ),

            new Project(
                    3L,
                    "LP Petshop",
                    "Landing Page responsiva para um petshop, focada em captação de leads e agendamento de serviços, com redirect direto ao WhatsApp.",
                    "/projectsImages/petsfriend.png",
                    List.of(
                            new Project.Tech(16L, "/icons/nextjs.svg", "Next.js"),
                            new Project.Tech(17L, "/icons/tailwind.svg", "Tailwind CSS")
                    ),
                    null
            ),

            new Project(
                    4L,
                    "LP Dentista",
                    "Website institucional e landing page para uma clínica odontológica, com foco em SEO local e agendamentos.",
                    "/projectsImages/dentist.png",
                    List.of(
                            new Project.Tech(20L, "/icons/react.svg", "Next"),
                            new Project.Tech(21L, "/icons/tailwind.svg", "Tailwind CSS"),
                            new Project.Tech(22L, "/icons/typescript.svg", "TypeScript")
                    ),
                    null
            ),

            new Project(
                    5L,
                    "EffluaSports",
                    "LP de E-commerce de artigos esportivos, com catálogo de produtos.",
                    "/projectsImages/efflua.png",
                    List.of(
                            new Project.Tech(18L, "/icons/nextjs.svg", "Next.js"),
                            new Project.Tech(19L, "/icons/tailwind.svg", "Tailwind CSS")
                    ),
                    null
            ),

            new Project(
                    7L,
                    "Agente criador de Newsletters IA",
                    "Agente de IA autônomo que pesquisa tópicos, escreve artigos de notícias e os envia automaticamente para os emails selecionados, podendo ser disparado periodicamente.",
                    "/projectsImages/newsletter.png",
                    List.of(
                            new Project.Tech(28L, "/icons/python.svg", "Python"),
                            new Project.Tech(29L, "/icons/Agno.svg", "Agno"),
                            new Project.Tech(30L, "/icons/openai.svg", "OpenAI API")
                    ),
                    null
            ),

            new Project(
                    6L,
                    "Desafio Front - Sea Tecnologia",
                    "Implementação de um desafio de front-end, consumindo uma API REST para exibir e filtrar dados complexos.",
                    "/projectsImages/desafio.png",
                    List.of(
                            new Project.Tech(23L, "/icons/react.svg", "React.js"),
                            new Project.Tech(25L, "/icons/tailwind.svg", "Tailwind CSS")
                    ),
                    null
            )
    ));
}
