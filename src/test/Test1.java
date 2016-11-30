package test;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

/**
 * Created by olga on 30.11.16.
 */
public class Test1 extends TestCommon{
    @Test
    public void myFirstTest() {
        driver.get("https://ya.ru");
    }
}
