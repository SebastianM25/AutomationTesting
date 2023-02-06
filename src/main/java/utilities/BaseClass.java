package utilities;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

        //private static ThreadLocal<WebDriverInstance> driverInstance = new ThreadLocal<>();
        public WebDriver driver;


        String url = "https://www.phptravels.net/";

        private DriversUtils driversPath = new DriversUtils();

    /*@Before
    public void setUpTestFireFox() {

        System.setProperty("webdriver.gecko.driver", driversPath.getDriverDirPath() + "geckodriver" + driversPath.getDriverExtension());
        driver = new FirefoxDriver();
        driver.get(url);
        if (SystemUtils.IS_OS_WINDOWS) {
            driver.manage().window().maximize();
        }
    }*/

        @Before
        public void setUpTestChrome() {
            System.setProperty("webdriver.chrome.driver", driversPath.getDriverDirPath() + "chromedriver" + driversPath.getDriverExtension());
            System.setProperty("webdriver.chrome.whitelistedIps", "");
            driver = new ChromeDriver();
            driver.get(url);
            if (SystemUtils.IS_OS_WINDOWS) {
                driver.manage().window().maximize();
            }
        }

        @After
        public void tearDown() {

        }
    }

