package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class AngelFishList {

    private Logger logger = LogManager.getLogger(AngelFishList.class);

    @FindBy(css = "a.Button[href$='EST-2']")
    private WebElement fishSizeAddToChartMenu;

    public AngelFishList() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public ShoppingCart clickOnAddToChartFish() {
        WaitForElement.waitUntilElementIsClickable(fishSizeAddToChartMenu);
        fishSizeAddToChartMenu.click();
        logger.info("Clicked add to chart small angelfish button");
        return new ShoppingCart();
    }

}
