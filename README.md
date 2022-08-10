# Teste Automatizado com Selenium + Java

Verificando as credenciais de um novo usúario na plataforma do Github, começando na tela de login, validando
email e senha, e navegando ate um repositório escolhido

## 🚀 Começando

Essas instruções permitirão que você obtenha uma cópia do projeto em operação na sua máquina local para fins de desenvolvimento e teste.


### 📋 Pré-requisitos

De que coisas você precisa para instalar o software e como instalá-lo?

```
Java
1.8 Oracle Open JDK version 1.8.0_202
corretto-1.8 Amazon Corretto version 1.8.0_342
Selenium
ChromeDriver
IDE de sua preferencia ( como sugestão eu indico a IntelliJ)
```

### 🔧 Instalação

Após ter baixado os pré-requistos, instale todos os arquivos!<br>
<br>
Coloque o arquivo **ChromeDriver.exe** na pasta raiz do projeto <br>
<br>
Configure sua estrutura de projeto para que o **corretto-1.8** esteja ativo no SDK
<img src="src/picture/SDK.png" alt="img do painel">

## ⚙️ Executando os testes

A automação dos testes, inicia na tela de login do github com e-mail e senha previamente colocados
no código no arquivo: <br>
Email | LoginStep.java na linha 23 <br>
Senha | LoginStep.java na linha 28 <br>

<img src="src/picture/login.png" alt="img de login do github">


Após login validado, a automação percorrerá no campo de busca, realizando uma pesquisa previamente
colocada no código também no arquivo: <br>
LoginStep.java na linha 48

<img src="src/picture/input.png" alt="img do campo de busca preenchido">


E Clicando no link do resultado da busca, indo para o perfil selecionado.

<img src="src/picture/link.png" alt="img do link do resultado da pesquisa">

<img src="src/picture/profile.png" alt="img do perfil do resultado da pesquisa">

E Acessando os repósitorios do perfil

<img src="src/picture/repositories.png" alt="img do perfil do resultado da pesquisa">

E acessando o repósitorio selecionado

<img src="src/picture/repo-acessado.png" alt="img do perfil do resultado da pesquisa">

E efetuando o sign out

<img src="src/picture/perfil.png" alt="img do perfil do resultado da pesquisa">

<img src="src/picture/logout.png" alt="img do perfil do resultado da pesquisa">



## 🛠️ Construído com

* [Selenium](https://www.selenium.dev/) - O framework web usado
* [Maven](https://maven.apache.org/) - Gerente de Dependência
* [Java](https://www.oracle.com/java/technologies/downloads/#jdk18-windows) Linguagem de Programação






