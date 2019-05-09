package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private WebDriver driver;

    public WebDriver getDriver (){
        if (driver == null) {
            setDriver();
        }
        return driver;
    }
    private void setDriver(){
       // System.setProperty("webdriver.gecko.driver", "C:\\Users\\Conrado.Ekoki\\Desktop\\geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
       // driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);



    }




}
