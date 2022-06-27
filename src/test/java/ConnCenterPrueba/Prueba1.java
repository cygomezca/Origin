package ConnCenterPrueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Prueba1 {

    public static void main (String[] args){

        System.getProperty("webdriver.gecko.driver","C:\\webdrives\\firefox\\geckdriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.wikipedia.org/");

    }
}

