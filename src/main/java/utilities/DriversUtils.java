package utilities;


import org.apache.commons.lang3.SystemUtils;

public class DriversUtils {
    public static void setWebDriveProperty(String browser) {
        switch (browser) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", getDriversPath() + "chromedriver" + getFileExtension());
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", getDriversPath() + "geckodriver" + getFileExtension());
                break;
        }
    }

    private static String getProjectPath() {
        return System.getProperty("user.dir");
    }

    private static String getDriversPath() {
        String driversPath;
        if (SystemUtils.IS_OS_MAC ){
            driversPath = "Users/sebastianmarius/IdeaProjects/Automation Testing/drivers/browsers/chrome/chromedriver_mac64/chromedriver";
        } else {

            driversPath = "/src/resources/drivers/mac/";
        }
        return  getProjectPath() + driversPath;
    }

    private static String getFileExtension() {
        if (SystemUtils.IS_OS_WINDOWS) {
            return ".exe";
        }
        return "";


    }
    String getDriverDirPath() {
        return System.getProperty("user.dir") + "/src/resources/drivers/" + this.getDriverDir();
    }
    private String getDriverDir() {
        return (SystemUtils.IS_OS_WINDOWS) ? "windows/" : "mac/";
    }
    String getDriverExtension() {
        return (SystemUtils.IS_OS_WINDOWS) ? ".exe" : "";
    }



}
