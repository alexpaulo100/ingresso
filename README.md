## 🎟️ Projeto Ingresso - Cinema

Este é um projeto com objetivo de estudo, desenvolvido em Java para gerenciar tipos de ingressos de cinema, com cálculo do valor real baseado em regras de meia entrada e ingresso família, além de suporte para exibição dublada ou legendada.
---
---
[![Java CI](https://github.com/alexpaulo100/ingresso/actions/workflows/maven.yml/badge.svg)](https://github.com/alexpaulo100/ingresso/actions/workflows/maven.yml)
---
---

## 🚀 Tecnologias Utilizadas

- Java 21
- Maven
- JUnit 5 para testes automatizados
- Git / GitHub para versionamento e CI/CD
- GitHub Actions para integração contínua

---

## 📁 Estrutura do Projeto



---

## 🚀 Tecnologias Utilizadas

- Java 21
- Maven
- JUnit 5 para testes automatizados
- Git / GitHub para versionamento e CI/CD
- GitHub Actions para integração contínua

---

## 📁 Estrutura do Projeto

```declarative
ingresso/
├── pom.xml
├── src/
│ ├── main/
│ │ └── java/
│ │ └── br/com/ingresso/
│ │ ├── Ingresso.java
│ │ ├── IngressoFamilia.java
│ │ ├── Main.java
│ │ ├── MeiaEntrada.java
│ │ └── TipoExibicao.java
│ └── test/
│ └── java/
│ └── br/com/ingresso/
│ └── IngressoTest.java
└── target/
```

---

## 🎯 Funcionalidades

- Modelagem de ingressos com valor base, nome do filme e tipo de exibição (dublado/legendado)
- Tipos especiais de ingressos:
    - Meia entrada (50% do valor)
    - Ingresso família (valor multiplicado pelo número de pessoas, com desconto de 5% para mais de 3 pessoas)
- Validação de dados e cálculo correto do valor real
- Testes unitários com JUnit 5 para garantir a qualidade do código

---

## 🧪 Testes Automatizados

- Cobertura de casos para meia entrada e ingresso família, com e sem desconto
- Validação de valores e regras de negócio

Para rodar os testes localmente, use:

```declarative
mvn clean test
```

## 🤖 Integração Contínua (CI/CD)

- Este projeto está configurado com GitHub Actions para rodar testes automaticamente em cada push ou pull request para a branch main.

### 👨‍💻 Como Executar

- Clone o repositório

- Compile o projeto com Maven:
```declarative
mvn clean install
```



- Execute a classe principal Main para testar o funcionamento básico.

### 📝 Autor

**Alex Silva**  
Desenvolvedor Backend  
 

