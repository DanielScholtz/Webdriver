import core.DriverManager;
import core.DriverManagerFactory;
import core.DriverType;
import enums.MainMenu;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import resources.Page;

public class siteTest {
    DriverManager driverManager;
    public WebDriver driver;
    Page page = new Page(driver);

    @BeforeTest
    public void beforeTest() {
        driverManager = DriverManagerFactory.getManager(DriverType.FIREFOX);
    }

    @BeforeMethod
    public void beforeMethod() {
        driver = driverManager.getDriver();
    }

    @AfterMethod
    public void afterMethod() {
        driverManager.quitDriver();
    }

    @Test
    public void launchTestAutomationGuruTest() {
        driver.get("http://testautomationguru.com");
        Assert.assertEquals("TestAutomationGuru – A technical blog on test automation", driver.getTitle());
    }

    @Test
    public void launchEpamTest() {
        driver.get("https://www.epam.com");
        page.navigation(MainMenu.CAREER_MENU);

    }



}
