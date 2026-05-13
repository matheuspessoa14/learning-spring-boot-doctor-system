# 📘 Projeto Web I

Este repositório contém o desenvolvimento do meu projeto da disciplina de Programação Web I, no curso de Análise e Desenvolvimento de Sistemas (ADS). O projeto está sendo desenvolvido de forma incremental ao longo das aulas, acompanhando os conteúdos apresentados em sala.

---

## 🚀 Objetivo

Construir uma aplicação web aplicando os conceitos aprendidos em sala de aula, utilizando o framework Spring Boot.

---

## 🛠️ Tecnologias

- Java
- Spring Boot
- Thymeleaf
- HTML
- CSS

---

## 📌 Status

🚧 Em desenvolvimento

---

## 📚 Conteúdo de Estudo - Spring Web

Este projeto também serve como base para anotações e prática dos principais conceitos do Spring Boot utilizados durante o desenvolvimento.

---

### 1. Anotações do Spring Web

`@RequestMapping("/medicos")`  
Define o endpoint base da classe (ex: `/medicos`).

`@RestController`  
Indica que a classe é um controller REST (combina `@Controller` + `@ResponseBody`).

`@GetMapping`  
Define que o método responde a requisições HTTP GET (leitura de dados).

`@PostMapping`  
Define que o método recebe dados via HTTP POST (criação).

`@PutMapping`  
Usado para atualização de dados via HTTP PUT.

`@DeleteMapping`  
Usado para remoção de dados via HTTP DELETE.

`@RequestBody`  
Indica que os dados serão recebidos no corpo da requisição (JSON via Insomnia/Postman).

`@Autowired`  
Usado para injeção de dependência. O Spring gerencia e fornece automaticamente a instância da classe.

`@Transactional`  
Garante que uma operação no banco de dados seja executada como uma transação (commit ou rollback automático).

---

### 2. Relacionamento entre tabelas no Spring Boot

`@OneToOne`  
Um para um (ex: uma consulta está ligada a um único médico).

`@OneToMany`  
Um para muitos (ex: um médico possui várias consultas).

`@ManyToOne`  
Muitos para um (ex: várias consultas pertencem a um paciente ou médico).

`@ManyToMany`  
Muitos para muitos (ex: muitos pacientes podem se relacionar com muitos médicos).

---

### 3. Conceitos de Banco de Dados

**Chave Primária (PK)**  
Identifica de forma única um registro em uma tabela.

**Chave Estrangeira (FK)**  
Campo que referencia a chave primária de outra tabela, criando um relacionamento.

---

### ⚠️ Observação

- O lado "dono" da relação geralmente é definido com `@JoinColumn`, ou seja, o lado que contém a chave estrangeira (FK).

---

## 👨‍💻 Autor

Matheus Pessoa Telles  
4º Período de Análise e Desenvolvimento de Sistemas (ADS)

---

## 📄 Licença

Este projeto foi desenvolvido para fins acadêmicos e educacionais.
