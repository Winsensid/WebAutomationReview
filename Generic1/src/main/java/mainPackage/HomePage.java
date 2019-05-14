package mainPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;


public class HomePage {


    public static WebDriver driver = null; // to be able to call it from anywhere

    @Parameters({"platform","url","browser"})
    @BeforeMethod
    public static WebDriver setupDriver(String platform, String url, String browser){ //main method
       System.setProperty("webdriver.chrome.driver", "../Generic1/src/main/resources/Drivers/chromedriver");
        driver = new ChromeDriver(); //Chromedriver Object
        driver.get(url);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();


       return driver;

    }
    @AfterMethod
    public void quit (){
        driver.quit(); //be able to manage
    }
    public void sleep() throws InterruptedException {
        Thread.sleep(2000);
    }
}
