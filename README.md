# WhatsApp Facilitator

Aplicação Spring Boot para gerenciar notas de usuários com persistência no MongoDB.

## Configuração
- Crie um arquivo `.env` na raiz contendo:
  - `MONGODB_HOST` (ex.: `localhost` quando a aplicação roda fora do Docker; use `mongodb` ou `financial-mongodb` se rodar dentro do compose)
  - `MONGODB_PORT` (ex.: `27017`)
  - `MONGODB_DATABASE` (ex.: `admin`, onde está a coleção `notes`)
  - `MONGODB_USERNAME` / `MONGODB_PASSWORD`
  - `MONGODB_AUTH_DB` (ex.: `admin`, onde o usuário foi criado)
- `SERVER_PORT` é opcional (padrão `8080`) e útil se a porta estiver ocupada.
- A conexão usa `spring.mongodb.*` com as credenciais acima (inclui `authentication-database`). Ajuste host/banco/authSource conforme o usuário/banco em uso.

## Rodando
- `./mvnw spring-boot:run`
- Para trocar a porta: `SERVER_PORT=8090 ./mvnw spring-boot:run`

## Swagger UI
- Após iniciar, acesse `http://localhost:8080/swagger-ui.html` para explorar a API.
