# Sistema de gerenciamento de pessoas em API REST com Spring Boot
Aplicação desenvolvida durante o bootcamp realizado pela *Digital Innovation One*
## Objetivo ✔️
- Criar uma API REST
- Operações básicas do CRUD: cadastro, leitura, atualização e remoção
- Padrão MVC
- Tratamento de exceções
- Tratamento de requisições Http
- Desenvolvimento de testes unitários
- Implantação do sistema na nuvem através do Heroku
---
## Tecnologias usadas 👨🏿‍💻
- Spring Boot
- MapStruct
- Postman
- Lombok
- Heroku
- Maven
- H2
---
## Afazeres pós bootcamp 💡
- [ ] Implementar testes unitários para as outras operações da camadas de serviço
- [ ] Implementar testes unitários para os end points
---
## Baixe e execute na sua máquina 
### Passo a passo 
```
# Pelo terminal, clone o repositório
$ git clone https://github.com/wpmello/personapi

# Verifique se possui o maven instalado na sua máquina
$ mvn -v

# No diretório do projeto, digite o seguinte comando
$ mvn spring-boot:run 
```
---
## Chegou a hora de testar a aplicação
```
# Após rodar o programa, digite no browser:
$ localhost:8080/api/v1/people

# Acesse o banco de dados H2 digitando:
$ localhost:8080/h2-console

##### NOTAS #####

# Ao acessar localhost:8080/api/v1/people, se aparecer as chaves -> [] <- você já estará com a api funcionando

# A URL do banco de dados H2 será informada na inicialização da aplicação. Atente-se ao console!
```
---
### Algumas recomendações:
Você pode usar o [Postman](https://www.postman.com/downloads/) para testar as funcionalidades da api.

Acesse a plataforma [Digital Innovation One](https://digitalinnovation.one/) para realizar projetos como este.