package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Login {

    WebDriver driver ;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao(String url){
        driver.get(url);

    }

    public void preencherEmail(String email){
        driver.findElement(By.id("login_field")).sendKeys(email);
    }

    public void preencherSenha(String senha){
        driver.findElement(By.id("password")).sendKeys(senha);

    }

    public void acaoDeClick(){
        driver.findElement(By.cssSelector(".js-sign-in-button")).click();

    }

    public void acaoDeClickNaBarraPesquisa(){
        driver.findElement(By.cssSelector("#jump-to-suggestion-search-global > a > div > .js-jump-to-badge-search-text-global")).click();

    }

    public void paginaDePerfilLogado (){
        driver.get("https://github.com/");

    }

    public void preencherCampoDePesquisa (String nome){
        driver.findElement(By.cssSelector(".js-site-search-focus")).sendKeys(nome);

    }


}

