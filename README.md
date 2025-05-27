# Todolist API

<img src="images/1.jpg" alt="To do List." width="200" height="140"/>

Uma API simples para gerenciamento de tarefas desenvolvida com **Spring Boot**, com foco no aprendizado e prática de operações CRUD, organização por camadas, utilização de **DTOs** para segurança e boas práticas, e documentação automática com **Swagger**.

## Funcionalidades

- ✅ Criar, listar, buscar, atualizar e excluir tarefas  
- ✅ Definição de prioridade e status das tarefas  
- ✅ Uso de DTOs para separar os dados recebidos e retornados ao cliente  
- ✅ Documentação da API com Swagger para facilitar testes e integração  

## 📚 Documentação (Swagger)

A documentação está disponível em:

**[http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)**

Através dessa interface, é possível visualizar e testar todos os endpoints da API.

## 🛠️ Tecnologias utilizadas

- **Java 17** — linguagem principal da aplicação  
- **Spring Boot** — framework para criação de APIs REST com agilidade  
- **Spring Web** — módulo para expor controladores HTTP  
- **Spring Data JPA** — abstração para acesso ao banco de dados com base em repositórios  
- **H2 Database** — banco de dados em memória para testes e desenvolvimento
- **Spring Boot DevTools**: Ferramenta que facilita o desenvolvimento, com reinício automático da aplicação e suporte a live reload.
- **Swagger/OpenAPI** — geração de documentação e interface visual para testes  

## 🚀 Como executar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/LeoAlves02/todolist-api.git
   ```

2. Navegue até o diretório:
   ```bash
   cd todolist-api
   ```

3. Rode o projeto no IntelliJ ou outra IDE de sua preferência, ou use:
   ```bash
   ./mvnw spring-boot:run
   ```

4. Acesse a documentação:
   [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## 📦 Organização do projeto

- `model`: contém a entidade `Tarefa`, que representa o domínio da aplicação  
- `dto`: contém os DTOs responsáveis por entrada (Request) e saída (Response) de dados  
- `controller`: expõe os endpoints da API  
- `service`: implementa a lógica de negócio  
- `repository`: interface com o banco de dados usando Spring Data JPA  

---

**Desenvolvido por Leonardo Alves.**  
