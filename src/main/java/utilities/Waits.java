package utilities;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Waits {

        WebDriver driver;

        public void implicitWait() {
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        public void explicitWait() {

        }
    }


