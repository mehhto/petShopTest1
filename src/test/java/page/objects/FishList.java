package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class FishList {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(xpath = "//div[@id='Catalog']/table//tr[2]//a")
    private WebElement fishType;

    public FishList() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelFishList clickOnFishType() {
        WaitForElement.waitUntilElementIsClickable(fishType);
        fishType.click();
        logger.info("Clicked on Angelfish type");
        return new AngelFishList();
    }

}
