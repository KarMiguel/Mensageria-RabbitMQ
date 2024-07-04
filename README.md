# RabbitMQ Spring Boot Application

## Descrição

Este é um projeto de aprendizado mensageria com RabbitMQ que demonstra a integração do Spring Boot com RabbitMQ para o envio e recebimento de mensagens. A aplicação é configurada para ser executada em contêineres Docker.

## Funcionalidades

- Envio de mensagens para uma exchange RabbitMQ.
- Recebimento de mensagens de uma fila RabbitMQ.
- Exposição de uma API REST para interagir com o sistema de mensageria.
- Documentação da API utilizando Swagger UI.
- Usando container docker

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot 3.3.1**
- **RabbitMQ**
- **Docker**
- **Swagger UI**
- **Lombok**

## Requisitos

- **Docker** e **Docker Compose** instalados.
- **Java 21** instalado.

## Como Executar

### Usando Docker

1. **Clone o repositório:**

    ```bash
    git clone https://github.com/seu-usuario/rabbitmq-spring-boot.git
    cd rabbitmq-spring-boot
    ```

2. **Compile o projeto:**

    ```bash
    mvn clean package -DskipTests
    ```

3. **Construa e inicie os contêineres:**

    ```bash
    docker-compose up --build
    ```

4. **Acesse a aplicação:**

    - A API estará disponível em `http://localhost:8080`
    - O RabbitMQ Management estará disponível em `http://localhost:15672` (usuário: guest, senha: guest)

### Endpoints da API

- **Swagger UI:** `http://localhost:8080/swagger-ui.html`

## Configurações

As configurações do RabbitMQ são definidas no arquivo `application.yml`:

```yaml
spring:
  rabbitmq:
    host: ${SPRING_RABBITMQ_HOST}
    port: ${SPRING_RABBITMQ_PORT}
    username: ${SPRING_RABBITMQ_USERNAME}
    password: ${SPRING_RABBITMQ_PASSWORD}
    exchange:
      name: myExchange
      type: direct
    listener:
      simple:
        default-requeue-rejected: false

server:
  port: 8080

logging:
  level:
    org.springframework: INFO
    com.example.rabbitmq: DEBUG

