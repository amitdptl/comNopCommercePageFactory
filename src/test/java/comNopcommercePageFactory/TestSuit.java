package comNopcommercePageFactory;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by User on 5/20/2017.
 */
public class TestSuit extends Hooks
{
  //  HomePage homePage =new HomePage(driver);
@BeforeClass
    public void beforeClass(){
    HomePage homePage =new HomePage(driver);
}


    @Test
    public void UserRegisterSuccessfully()
    {

          HomePage homePage= PageFactory.initElements(driver,HomePage.class);
          homePage.clickOnRegisterButton();
    }
}
