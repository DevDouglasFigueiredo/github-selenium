package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

public class Utils extends RunCucumberTest {

    public static void esperarElementoEstarPresente(By elemento, Integer tempo){
        WebDriverWait esperar = new WebDriverWait(getDriver(), tempo);
        esperar.until(ExpectedConditions.elementToBeClickable(elemento));
    }
}
