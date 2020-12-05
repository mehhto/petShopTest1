package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class ShoppingCart {

    private Logger logger = LogManager.getLogger(ShoppingCart.class);

    @FindBy(xpath = "//div[@id = 'Cart']/a")
    private WebElement proceedButton;

    public ShoppingCart() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPage clickOnProceedButton() {
        WaitForElement.waitUntilElementIsClickable(proceedButton);
        proceedButton.click();
        logger.info("Clicked proceed chart button");
        return new LoginPage();

    }


}
