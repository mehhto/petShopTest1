package tests;

import configuration.ConfigurationProperties;
import configuration.PropertiesLoader;
import driver.BrowserType;
import driver.DriverManager;
import driver.manager.DriverUtils;
import org.testng.annotations.*;

import java.util.Properties;

import static driver.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    @BeforeClass
    public void configurationLoad() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties properties = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(properties);
    }

    @Parameters("browser")
    @BeforeMethod
    public void testSetUp(@Optional BrowserType browserType) {
        DriverManager.setWebDriver(browserType);
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void cleanUpTest() {
        DriverManager.disposeDriver();
    }


}
