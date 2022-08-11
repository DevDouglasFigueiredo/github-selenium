# language: pt

@busca
Funcionalidade: Busca

  Como usuario do site Github
  Quero realizar uma pesquisa
  Para ter dados da minha busca.

  @buscaSucesso
  Cenário: Realizar uma busca no campo de pesquisa
    Dado que acesso o site do github
    E visualizo o campo email
    E preencho meu email valido
    E a senha valida
    E clico no botao
    E sou redirecionado para tela de usuario
    E verifico o campo de busca
    Quando preencho o campo de busca
    E clico no botão pesquisa
    Então o resultado da minha pesquisa é apresentado em tela

  @acessandoPesquisa
  Cenário: Acessando dado da Pesquisa
    Dado que acesso o site do github
    E visualizo o campo email
    E preencho meu email valido
    E a senha valida
    E clico no botao
    E sou redirecionado para tela de usuario
    E verifico o campo de busca
    Quando preencho o campo de busca
    E clico no botão pesquisa
    E o resultado da minha pesquisa é apresentado em tela
    Então clico na pesquisa que retornou em tela
    E consigo acesso ao dado da pesquisa selecionada