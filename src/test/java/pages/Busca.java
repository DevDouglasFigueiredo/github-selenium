package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class Busca extends RunCucumberTest {


    public void visualizarCampoDePesquisa(){
        Utils.esperarElementoEstarPresente(By.className("js-site-search-focus"), 20);
    }

    public void preencherCampoDeBusca(String nome){
        getDriver().findElement(By.cssSelector(".js-site-search-focus")).sendKeys(nome);
    }

    public void clicarParaPesquisar (){
        getDriver().findElement(By.cssSelector("#jump-to-suggestion-search-global > a > div > .js-jump-to-badge-search-text-global")).click();
    }

    public void visualizarResultadoDaPesquisa (){
        Utils.esperarElementoEstarPresente(By.className("repo-list-item"), 20);
    }

    public void clicoNoResultadoDaPesquisa(){
        getDriver().findElement(By.cssSelector(".f4 > a")).click();
    }

    public void acessoAoDadoDaPesquisa(){
        Utils.esperarElementoEstarPresente(By.id("repository-container-header"), 20);
    }

}
