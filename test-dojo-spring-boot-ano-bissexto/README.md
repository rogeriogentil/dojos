# Testing Dojo - Ano Bissexto (Spring Boot)

Este é um projeto Maven baseado no Spring Boot. Para executá-lo, basta rodar o comando `./mvnw spring-boot:run` e, 
posteriormente, acessar a URL http://localhost:8080/anos?ano=2020. Para executar os testes de unidade, basta rodar
o comando `./mvnw test`.

## Desafio

Para este projeto, o desafio é criar casos de teste de unidade que exercitem o método `isBissexto(int ano)` da classe
`dojo.domino.Ano`. 

OBS: já existe uma classe de teste (`AnoTest`).

### Requisitos

O código de `Ano#isBissexto` foi criado seguindo os seguintes requisitos:

1. Todo ano divisível por 400 É bissexto (assim, por exemplo, 2000 foi realmente um ano bissexto)
2. Todo ano divisível por 100 mas não por 400 NÃO É bissexto (portanto, por exemplo, 1700, 1800 e 1900 não foram anos
bissextos, NEM 2100 será)
3. Todo ano divisível por 4 mas não por 100 É bissexto (ou seja, 2008, 2012, 2016) 
4. Todo ano não divisível por 4 NÃO É bissexto (ou seja 2017, 2018, 2019)

Esses requisitos servem de guia para a criação dos testes.

# Referências

- Origem do desafio: https://codingdojo.org/kata/LeapYears/
- Spring Boot: https://spring.io/projects/spring-boot
- JUnit: https://junit.org/junit5/