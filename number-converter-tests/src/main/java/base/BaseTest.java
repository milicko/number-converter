package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Milic Bogiceivc
 */
public class BaseTest {

    public WebDriver getDriver() {
        return _driver;
    }

    public void setDriver(WebDriver driver) {
        this._driver = driver;
    }

    public static WebDriver _driver;

    /**
     * This method sets path to chromedriver and it sets web driver that you want to use (in this case ChromeDriver) and after that it opens browser
     * Path to chromedriver should be absolute path to chromedriver on your machine
     */
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/techtailor/Documents/Programs/ChromeDriver/chromedriver");
        setDriver(_driver = new ChromeDriver());
        getDriver().get("localhost:8080");
    }

    /**
     * This method closes browser
     */
    public void closeBrowser() {
        getDriver().quit();
    }


}
