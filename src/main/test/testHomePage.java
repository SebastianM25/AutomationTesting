import org.junit.Test;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseClass;
import utilities.TextResources;
import utilities.WorkWithElements;

import java.io.IOException;
import java.text.ParseException;
import FrontEnd.HomePage;

public class testHomePage extends BaseClass {
    @Test
    public void test() throws InterruptedException, IOException, ParseException {


        HomePage homePage = new PageFactory().initElements(driver, HomePage.class);
        Thread.sleep(5000);
        WorkWithElements.clickElement(homePage.getdropdownAccount());
        WorkWithElements.clickElement(homePage.getSignUp());
        WorkWithElements.complete(homePage.getFirstName(), TextResources.firstname);
    }

}
