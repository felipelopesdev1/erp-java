# ERP Java

Projeto de ERP desenvolvido em Java com foco em aprendizado de Programação Orientada a Objetos, modelagem de sistemas e boas práticas de desenvolvimento.

## Objetivo

O objetivo deste projeto é evoluir gradualmente um sistema ERP, aplicando conceitos utilizados no mercado de desenvolvimento de software, desde a modelagem das entidades até a construção de uma aplicação completa.

## Tecnologias Utilizadas

* Java
* Maven
* Git
* GitHub
* IntelliJ IDEA

## Funcionalidades Implementadas

### Usuários

* Cadastro de usuários
* Validação de nome
* Validação de e-mail
* Validação de senha
* Controle de status (ativo/inativo)
* Controle de cargos através de Enum

### Cargos Disponíveis

* ADMINISTRADOR
* GERENTE
* VENDEDOR
* FINANCEIRO
* ESTOQUISTA

## Estrutura Atual

```text
src
└── main
    └── java
        └── br.com.erp
            ├── Main.java
            └── model
                ├── Usuario.java
                └── Cargo.java
```

## Roadmap

### Modelagem

* [ ] Classe Pessoa
* [ ] Herança entre Pessoa e Usuario
* [ ] Classe Cliente
* [ ] Classe Compra
* [ ] Classe Produto

### Regras de Negócio

* [ ] Relacionamento Cliente x Compras
* [ ] Controle de Estoque
* [ ] Controle Financeiro

### Persistência

* [ ] Banco de Dados PostgreSQL
* [ ] JDBC
* [ ] JPA/Hibernate

### Backend

* [ ] Spring Boot
* [ ] API REST
* [ ] Autenticação e Autorização

### Deploy

* [ ] Hospedagem em nuvem
* [ ] Ambiente de Produção

## Autor

Felipe Lopes

Projeto desenvolvido para estudo, prática e evolução profissional na área de Desenvolvimento de Software.
