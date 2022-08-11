package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunBase;
import runner.RunCucumberTest;
import support.Utils;


public class Login extends RunCucumberTest {


    public void acessarTelaDeLogin (){
        getDriver(Browser.CHROME);
        getDriver().get("https://github.com/login");
    }

    public void visualizarCampoEmail (){
        Utils.esperarElementoEstarPresente(By.id("login_field"), 20 );
    }

    public void preencherCampoDeEmail(String email){
        getDriver().findElement(By.id("login_field")).sendKeys(email);
    }

    public void preencherCampoDeSenha(String senha){
        getDriver().findElement(By.id("password")).sendKeys(senha);
    }

    public void clicarEmSignIn(){
        getDriver().findElement(By.cssSelector(".js-sign-in-button")).click();
    }

    public void acessarTelaDeUsuario (){
        Utils.esperarElementoEstarPresente(By.id("feed-original"), 20);
    }

}
