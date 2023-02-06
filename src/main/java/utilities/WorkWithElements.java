package utilities;

import org.openqa.selenium.WebElement;

public class WorkWithElements {

    public static void clickElement(WebElement element) throws InterruptedException {
        validation(element);
        element.click();
        Thread.sleep(5000);
    }
    public static boolean validation(WebElement element) {
        //Waits.waitForElement(element);
        return element.isEnabled();
    }
    public static void complete(WebElement element, String wanteddata) throws InterruptedException {
        validation(element);
        element.sendKeys(wanteddata);
    }

}
