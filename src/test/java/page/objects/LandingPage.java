package page.objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driver.DriverManager;
import tests.waits.WaitForElement;

public class LandingPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content a")
    private WebElement enterShopLink;

    public LandingPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public QuickLinks clickOnEnterShopLink() {
        WaitForElement.waitUntilElementIsClickable(enterShopLink);
        enterShopLink.click();
        logger.info("Clicked on Enter Store link");
        return new QuickLinks();
    }

}
