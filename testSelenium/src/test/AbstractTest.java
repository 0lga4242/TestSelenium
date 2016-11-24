package test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractTest {


    @Before
    public void start() {
        WebDriver driver = new FirefoxDriver(caps);
        WebDriverWait wait = new WebDriverWait(driver, 10);

    }

    @After
    public void stop() {
        driver.quit();
    }
}