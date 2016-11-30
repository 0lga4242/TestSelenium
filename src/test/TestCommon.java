package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by olga on 30.11.16.
 */
public abstract class TestCommon {
    public WebDriver driver;
    public WebDriverWait wait;
    @Before
    public void start() {
        System.setProperty("webdriver.gecko.driver","/home/olga/geckodriver");
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, 10);

    }

    @After
    public void stop() {
        driver.quit();
    }
}
