# Bem vindo ao projeto Rueiros do Bem!

**Video ensinando a configurar o ambiente de desenvolvimento com Eclipse, WindFly e MySQL**

[![](http://img.youtube.com/vi/2AY8JrgfDgU/0.jpg)](http://www.youtube.com/watch?v=2AY8JrgfDgU "Preparação de Ambiente de Desenvolvimento: Java Web com JPA + Eclipse + WildFly + MySQL")

obs: Recomendamos instalar as mesmas versões que utilizamos nesse projeto.
* Java 11
* [MySQL 8.0.21](https://dev.mysql.com/downloads/connector/j/)
* [WildFly 20.0.1 ](https://www.wildfly.org/downloads/)
* [Eclipse IDE for Enterprise Java Developers ](https://www.eclipse.org/downloads/packages/release/2020-06/r/eclipse-ide-enterprise-java-developers)
* Maven 3.6.3

---

## Métodos do CRUD Pessoa (Usuário/Doador)

#### Pra adicionar uma pessoa 
POST em http://127.0.0.1:8080/rdb/pessoa
```json
  {
    "email": " jose@rdb.com",
    "endereço": "AV Brasilia 123",
    "nome": "Jose",
    "senha": " 123",
    "telefone": "11987654321"
  }
```
---

#### Pra listar todas as pessoas 
GET em http://127.0.0.1:8080/rdb/pessoa

---

#### Pra pesquisar por id uma pessoa 
GET em http://127.0.0.1:8080/rdb/pessoa/{id}

Exemplo: http://127.0.0.1:8080/rdb/pessoa/1
Retorno será:
```json
  {
    "email": " jose@rdb.com",
    "endereço": "AV Brasilia 123",
    "nome": "Jose",
    "senha": " 123",
    "telefone": "11987654321"
  }
```

---
#### Pra deletar uma pessoa 
DELETE em http://127.0.0.1:8080/rdb/pessoa/{id}

---
#### Pra atualizar uma pessoa 
PUT em http://127.0.0.1:8080/rdb/pessoa/{id}
informações do body pra atualizar:
```json
  {
    "email": " jose@rdb.com",
    "endereço": "AV Brasilia 123",
    "nome": "Jose",
    "senha": " 123",
    "telefone": "11987654321"
  }
```
---
