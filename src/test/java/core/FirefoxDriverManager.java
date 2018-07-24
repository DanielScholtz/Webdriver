package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {


    @Override
    protected void startService() {
        WebDriverManager.firefoxdriver().setup();
    }

    @Override
    protected void stopService() {
        driver.close();

    }

    @Override
    protected void createDriver() {
        driver = new FirefoxDriver();
    }
}
