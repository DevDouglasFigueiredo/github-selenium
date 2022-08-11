# language: pt

@logout
Funcionalidade: Tela de login

  Como usuario do site Github
  Quero me autenticar
  Para ter acesso a minha conta de usuario

  @logoutSucesso
  Cenário: Efetuando logout
    Dado que acesso o site do github
    E visualizo o campo email
    E preencho meu email valido
    E a senha valida
    E clico no botao
    E sou redirecionado para tela de usuario
    Quando clico no botão para logout
    Entao sou direcionado para tela principal do site sem usuário logado