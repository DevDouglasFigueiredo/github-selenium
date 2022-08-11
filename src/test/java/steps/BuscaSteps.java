package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.Busca;
import runner.RunCucumberTest;

public class BuscaSteps extends RunCucumberTest {

    Busca busca = new Busca();

    @Dado("^verifico o campo de busca$")
    public void verifico_o_campo_de_busca() {
        busca.visualizarCampoDePesquisa();
    }

    @Quando("^preencho o campo de busca$")
    public void preencho_o_campo_de_busca() {
        busca.preencherCampoDeBusca("Douglas Figueiredo");
    }

    @Quando("^clico no botão pesquisa$")
    public void clico_no_botão_pesquisa() {
        busca.clicarParaPesquisar();
    }

    @Então("^o resultado da minha pesquisa é apresentado em tela$")
    public void o_resultado_da_minha_pesquisa_é_apresentado_em_tela() {
        busca.visualizarResultadoDaPesquisa();
    }

    @Então("^clico na pesquisa que retornou em tela$")
    public void clico_na_pesquisa_que_retornou_em_tela() {
        busca.clicoNoResultadoDaPesquisa();
    }

    @Então("^consigo acesso ao dado da pesquisa selecionada$")
    public void consigo_acesso_ao_dado_da_pesquisa_selecionada() {
        busca.acessoAoDadoDaPesquisa();
    }


}
