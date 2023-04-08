package firstselenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySeleniumTest {

    @Test
    public void openTheWebService () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        System.out.println("Driver surucusu chrome browser olusturma");
        driver.manage().window().maximize();
        System.out.println("browser ekran boyutu ayarlama");
        driver.navigate().to("https://petstore.swagger.io/#/pet/addPet");
        driver.navigate().to("https://youtube.com");
        System.out.println();
        //driver.navigate().wait();

        driver.close();
        System.out.println("browser kapatma");

    }


}
