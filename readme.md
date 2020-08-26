# Bem vindo ao projeto Rueiros do Bem!

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