package FrontEnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindAll({@FindBy(xpath = "//a[contains(.,'My Account')]"),@FindBy(className = "btn btn-text-inherit btn-interactive"),@FindBy(id="dropdownCurrency")})
    private WebElement dropdownAccount;
    @FindAll({@FindBy(xpath = "//a[contains(.,'Sign Up')]"),@FindBy(className = "dropdown-item tr")})
    private WebElement signUp;
    @FindBy(name = "firstname")
    private WebElement firstName;


    public WebElement getdropdownAccount() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        return dropdownAccount;

    }
    public WebElement getSignUp() {
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        return signUp;
    }

    public WebElement getFirstName() {
        return firstName;
    }

}
