package steps;

import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import pages.Logout;
import runner.RunCucumberTest;

public class LogoutSteps extends RunCucumberTest {

    Logout logout = new Logout ();

    @Quando("^clico no botão para logout$")
    public void clico_no_botão_para_logout() {
        logout.clicarEmPerfil();
        logout.clicarEmSignOut();
    }

    @Entao("^sou direcionado para tela principal do site sem usuário logado$")
    public void sou_direcionado_para_tela_principal_do_site_sem_usuário_logado() {
        logout.visualizarTelaInicialGithub();
    }

}

