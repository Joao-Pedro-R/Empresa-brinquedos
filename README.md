# Empresa-brinquedos (Checkpoint 3 para a matéria de Java Advanced)

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

![image](https://github.com/user-attachments/assets/350fa4f6-d51b-4b59-9f35-1e8d8d7cf8cd)

#### 🔍 GET /brinquedos/{id}
Consulta um brinquedo específico pelo ID.

![image](https://github.com/user-attachments/assets/cc73174e-83d9-4efe-bb68-bd8446e3738b)

### ➕ POST /brinquedos
Insere um brinquedo no banco de dados
Exemplo de JSON:

```json{
  "nome": "Carrinho HotWheels",
  "tipo": "Veículo",
  "classificacao": "3+",
  "tamanho": "Pequeno",
  "preco": 59.90
}
```

![image](https://github.com/user-attachments/assets/d168480f-f9df-43e4-ba78-f668cd4ccb4e)


### ✏️ PUT /brinquedos/{id}
Modifica um brinquedo especificado por id no banco de dados
Exemplo de JSON:

```json{
  "nome": "Carrinho HotWheels",
  "tipo": "Veículo",
  "classificacao": "6+",
  "tamanho": "Pequeno",
  "preco": 69.90
}
```

![image](https://github.com/user-attachments/assets/697aa551-fc4f-4065-8dfe-d6106f610ae2)

### 🗑️ DELETE /brinquedos/{id}
Remove um brinquedo do banco de dados pelo ID.

![image](https://github.com/user-attachments/assets/32e61514-b11d-4ecb-ba47-c1e6c5a51030)

