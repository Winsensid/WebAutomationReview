package amazonHomePageTest;

import amazonHomePage.SetupAmazonHome;
import org.testng.annotations.Test;

public class SetupAmazonHomeTest extends SetupAmazonHome {
    @Test
    public void homeTest() throws InterruptedException {

        homePage();
        Thread.sleep(3000);

        AmazonAccount();
        Thread.sleep(3000);

        Username("winsen@PNT.COM");
        Thread.sleep(3000);

        Password("asdfghjk");
        Thread.sleep(3000);

        SignIn();
        Thread.sleep(3000);


    }
}
