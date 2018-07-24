package resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Page {
    public WebDriver driver;

    public Page (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Test
    public void navigation(String Menu) {
        String siteTitle = driver.getTitle();
        driver.findElement(By.cssSelector("a[href='" + Menu + "']")).click();
    }

}
