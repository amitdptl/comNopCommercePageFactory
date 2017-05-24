package comNopcommercePageFactory;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;



/**
 * Created by User on 5/20/2017.
 */
public class Hooks extends BasePage
{
    @BeforeMethod
    public void openBrowser()
    {
        driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.get("http://demo.nopcommerce.com");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }
//    @AfterMethod
//    public void closeBrowser()
//    {
//        driver.quit();
//    }
}
