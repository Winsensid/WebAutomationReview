package amazonHomePage;

import mainPackage.HomePage;
import org.openqa.selenium.By;

public class SetupAmazonHome extends HomePage {

    public void homePage(){
        System.out.println(driver.getTitle());
    }

    public void AmazonAccount(){
        driver.findElement(By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]")).click();
    }

    public void Username(String username){
        driver.findElement(By.id("ap_email")).sendKeys(username);
    }
    public void Password(String password){
        driver.findElement(By.id("ap_password")).sendKeys(password);
    }

    public void SignIn(){
        driver.findElement(By.xpath("//*[@id=\'signInSubmit\']")).click();
    }




}
