package comNopcommercePageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by User on 5/20/2017.
 */
public class HomePage extends Utilis
{
    public HomePage(WebDriver driver)
    {
        this.driver= driver;
    }
    @FindBy(xpath= "//a[contains(text(), 'Register')]")
    WebElement _registerButton;

   // public static WebDriver driver;
//    HomePage (WebDriver driver)
//    {
//        this.driver=driver;
//        PageFactory.initElements(driver, this);
//    }

    public void clickOnRegisterButton()
    {
        clickOnElement(_registerButton);
    }
}
