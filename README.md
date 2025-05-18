# Empresa-brinquedos
Checkpoint 3 para a matéria de Java Advanced
------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

## 🧸 Sistema de Cadastro de Brinquedos
Projeto desenvolvido em Java com Spring Boot para gerenciar um catálogo de brinquedos de uma empresa voltada para crianças de até 14 anos.

## 📚 Descrição
O sistema permite o Cadastro, Consulta, Atualização e Exclusão (CRUD) de brinquedos no banco de dados Oracle via API REST. As operações são feitas por meio do Postman e armazenadas na tabela TDS_TB_Brinquedos.

## 👨‍💻 Integrantes do Grupo
| Nome           | RM        |
|----------------|-----------|
| Daniel Akiyama | RM 558263 |
| Danilo Correia | RM 557540 |
| João Pedro R   | RM 558199 |

## 🛠️ Tecnologias Utilizadas
-Java 17

-Spring Boot 3.x

-Maven

-Spring Web

-Spring Data JPA

-Hibernate

-Validation Beans

-Oracle SQL Developer

-Postman

-IDE: IntelliJ IDEA / Eclipse


![image](https://github.com/user-attachments/assets/6153c93f-1771-4686-9da9-76859253c48f)

## 📂 Endpoints da API

### 🔍 GET /brinquedos
Lista todos os brinquedos cadastrados.

#### 🔍 GET /brinquedos/{id}
Consulta um brinquedo específico pelo ID.

### ➕ POST /brinquedos
Exemplo de JSON:

```json{
  "nome": "Carrinho Turbo",
  "tipo": "Veículo",
  "classificacao": "3+",
  "tamanho": "Médio",
  "preco": 59.90
}

### ✏️ PUT /brinquedos/{id}
Exemplo de JSON:

{
  "nome": "Carrinho Turbo 2.0",
  "tipo": "Veículo",
  "classificacao": "3+",
  "tamanho": "Grande",
  "preco": 79.90
}

### 🗑️ DELETE /brinquedos/{id}
Remove um brinquedo do banco de dados pelo ID.
