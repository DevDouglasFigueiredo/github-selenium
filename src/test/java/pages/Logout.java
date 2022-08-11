package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import runner.RunCucumberTest;
import support.Utils;

public class Logout extends RunCucumberTest {


    public void clicarEmPerfil(){
        getDriver().findElement(By.className("avatar-small")).click();
    }

    public void clicarEmSignOut(){
        Utils.esperarElementoEstarPresente(By.className("dropdown-signout"),20);
        getDriver().findElement(By.className("dropdown-signout")).click();
    }

    public void visualizarTelaInicialGithub(){
        Utils.esperarElementoEstarPresente(By.id("user_email"), 20);
    }
}
