# ApiOptabroker

## Descrição
ApiOptabroker é um projeto Java para implementar uma API utilizando o framework Spring Boot. A API é destinada para gerenciamento de usuários do sistema Optabroker.

## Configuração do Projeto
Certifique-se de ter as seguintes ferramentas instaladas antes de executar o projeto:
- JDK 8 ou superior
- Maven
- IDE Java (recomendado: IntelliJ IDEA, Eclipse)

## Como Executar o Projeto

1. Clone o repositório para sua máquina local:

```
git clone https://github.com/seu-usuario/ApiOptabroker.git
```

2. Abra o projeto em sua IDE Java.

3. Certifique-se de que todas as dependências foram baixadas e atualizadas através do Maven.

4. Localize a classe `ApiOptabrokerApplication` no pacote `com.optabroker.apioptabroker` e execute o método `main`.

5. A aplicação será iniciada e estará disponível para acessar a API através do endereço `http://localhost:8080/`.

## Endpoints da API

### 1. Criar um Usuário

**Endpoint:** `/users`
**Método:** POST
**Descrição:** Cria um novo usuário no sistema.

**Parâmetros:**
- `name` (String) - Nome do usuário.
- `email` (String) - E-mail do usuário.
- `password` (String) - Senha do usuário.

**Exemplo de Requisição:**
```
POST http://localhost:8080/users
{
  "name": "João Silva",
  "email": "joao.silva@example.com",
  "password": "senha123"
}
```

### 2. Obter Detalhes do Usuário

**Endpoint:** `/users/{id}`
**Método:** GET
**Descrição:** Obtém os detalhes de um usuário específico pelo ID.

**Parâmetros:**
- `id` (Long) - ID do usuário.

**Exemplo de Requisição:**
```
GET http://localhost:8080/users/1
```

**Exemplo de Resposta:**
```
{
  "id": 1,
  "name": "João Silva",
  "email": "joao.silva@example.com"
}
```

### 3. Listar Todos os Usuários

**Endpoint:** `/users`
**Método:** GET
**Descrição:** Obtém a lista de todos os usuários cadastrados no sistema.

**Exemplo de Requisição:**
```
GET http://localhost:8080/users
```

**Exemplo de Resposta:**
```
[
  {
    "id": 1,
    "name": "João Silva",
    "email": "joao.silva@example.com"
  },
  {
    "id": 2,
    "name": "Maria Souza",
    "email": "maria.souza@example.com"
  }
]
```

## Contribuição
Se você quiser contribuir para este projeto, fique à vontade para abrir uma issue ou enviar um pull request. Sua contribuição será muito bem-vinda!

## Licença
Este projeto é licenciado sob a [MIT License](https://opensource.org/licenses/MIT). Veja o arquivo LICENSE para mais detalhes.