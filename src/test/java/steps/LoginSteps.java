package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.Login;
import runner.RunCucumberTest;

public class LoginSteps extends RunCucumberTest {

    Login login = new Login();
    @Dado("^que acesso o site do github$")
    public void que_acesso_o_site_do_github() {
        login.acessarTelaDeLogin();
    }

    @Dado("^visualizo o campo email$")
    public void visualizo_o_campo_email() {
        login.visualizarCampoEmail();
    }

    @Dado("^preencho meu email valido$")
    public void preencho_meu_email_valido()  {
        login.preencherCampoDeEmail("suportedsmix@gmail.com");
    }

    @Dado("^a senha valida$")
    public void a_senha_valida() {
        login.preencherCampoDeSenha("Suporte12345");
    }

    @Quando("^clico no botao$")
    public void clico_no_botao() {
        login.clicarEmSignIn();
    }

    @Então("^sou redirecionado para tela de usuario$")
    public void sou_redirecionado_para_tela_de_usuario() {
        login.acessarTelaDeUsuario();
    }
}
