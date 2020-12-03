package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class QuickLinks {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@id = 'QuickLinks']/a[1]")
    private WebElement fishMenuLabel;

    @FindBy(xpath = "//div[@id='MenuContent']/a[2]")
    private WebElement loginPageLink;

    public QuickLinks() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public FishList clickOnFishMenu() {
        WaitForElement.waitUntilElementIsClickable(fishMenuLabel);
        fishMenuLabel.click();
        logger.info("Clicked fish menu label");
        return new FishList();
    }

    public LoginPage clickOnLoginPageLink() {
        WaitForElement.waitUntilElementIsClickable(loginPageLink);
        loginPageLink.click();
        logger.info("Clicked Login Page link");
        return new LoginPage();
    }

}
