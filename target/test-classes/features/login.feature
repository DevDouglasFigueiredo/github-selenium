# language: pt

Funcionalidade: Tela de login

  Como usuario do site Github
  Quero me autenticar
  Para visualizar meus repositórios e realizar pesquisas

  Cenário: Validar credenciais de login
    Dado que estou no site do github
    Quando preencho meu email
    E a senha
    E clico no botao
    Então devo ser redirecionado para a tela de dashboard do github

  Cenário: Realizar uma busca no campo de pesquisa
    Dado que estou logado
    E quero realizar uma busca
    Quando eu preencher o campo de busca
    Então o resultado da minha pesquisa deve aparecer

  Cenário: Acessar o perfil da pesquisa
    Dado que eu tenho o resultado da pesquisa
    Quando clicar no link obtido
    E clicar para acessar o perfil da busca
    Então tenho acesso ao perfil pesquisado

  Cenário: Acessando link do Repositorio
    Dado que eu quero acessar os repositorios da pesquisa realizada
    Quando clicar em repositorios
    E no projeto escolhido
    Entao devo ter acesso ao repositorio escolhido


