package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import pages.Login;
import runner.RunCucumberTest;


public class LoginSteps extends RunCucumberTest {

    Login login = new Login(driver);
    @Dado("^que estou no site do github$")
    public void que_estou_no_site_do_github(){
        login.acessarAplicacao("https://github.com/login");
    }

    @Quando("^preencho meu email$")
    public void preencho_meu_email(){
        login.preencherEmail("suportedsmix@gmail.com");
    }

    @Quando("^a senha$")
    public void a_senha(){
        login.preencherSenha("Suporte12345");
    }

    @Quando("^clico no botao$")
    public void clico_no_botao(){
        login.acaoDeClick();
    }

    @Então("^devo ser redirecionado para a tela de dashboard do github$")
    public void devo_ser_redirecionado_para_a_tela_de_dashboard_do_github(){
        System.out.println("redirecionado");

    }
    @Dado("^que estou logado$")
    public void que_estou_logado(){
        login.paginaDePerfilLogado();
    }

    @Quando("^quero realizar uma busca$")
    public void quero_realizar_uma_busca(){
        login.preencherCampoDePesquisa("Douglas Figueiredo");
    }

    @Quando("^eu preencher o campo de busca$")
    public void eu_preencher_o_campo_de_busca(){
        login.acaoDeClickNaBarraPesquisa();
    }

    @Entao("^o resultado da minha pesquisa deve aparecer$")
    public void o_resultado_da_minha_pesquisa_deve_aparecer() {
        System.out.println("redirecionado");

    }

    @Dado("^que eu tenho o resultado da pesquisa$")
    public void que_eu_tenho_o_resultado_da_pesquisa()  {
        System.out.println("link da pesquisa");
    }

    @Quando("^clicar no link obtido$")
    public void clicar_no_link_obtido() {
        driver.findElement(By.cssSelector(".f4 > a")).click();
    }

    @Quando("^clicar para acessar o perfil da busca$")
    public void clicar_para_acessar_o_perfil_da_busca()  {

        driver.findElement(By.className("author")).click();
    }

    @Então("^tenho acesso ao perfil pesquisado$")
    public void tenho_acesso_ao_perfil_pesquisado() {
        System.out.println("busca feita");
    }

    @Dado("^que eu quero acessar os repositorios da pesquisa realizada$")
    public void que_eu_quero_acessar_os_repositorios_da_pesquisa_realizada(){
        System.out.println("perfil acessado");
    }

    @Quando("^clicar em repositorios$")
    public void clicar_em_repositorios() {

        driver.findElement(By.cssSelector(".Layout-main > .UnderlineNav > .UnderlineNav-body > a:nth-child(2)")).click();

    }

    @Quando("^no projeto escolhido$")
    public void no_projeto_escolhido() throws InterruptedException {
        driver.findElement(By.cssSelector("#user-repositories-list > ul > li > div > div > h3 > a")).click();
        login.aguardarElementoAparecer();
    }

    @Entao("^devo ter acesso ao repositorio escolhido$")
    public void devo_ter_acesso_ao_repositorio_escolhido() {
        System.out.println("repositorio acessado");

    }

    @Dado("^que eu quero efetuar o logout da minha conta$")
    public void que_eu_quero_efetuar_o_logout_da_minha_conta()  {
        System.out.println("efetuando logout");
    }

    @Quando("^eu clicar no perfil$")
    public void eu_clicar_no_perfil()  {
        driver.findElement(By.className("avatar-small")).click();

    }

    @Quando("^clicar em sign out$")
    public void clicar_em_sign_out()  {
        driver.findElement(By.className("dropdown-signout")).click();
    }

    @Então("^devo ter realizado o logout da minha conta$")
    public void devo_ter_realizado_o_logout_da_minha_conta()  {
        System.out.println("logout realiazado");
    }

}


