package tests;

import org.testng.annotations.Test;
import page.objects.*;

import static org.testng.Assert.assertEquals;

public class FishBuyTest extends TestBase {

    @Test
    public void fishBuyTest() {

        LandingPage landingPage = new LandingPage();
        String messageToCheck = landingPage
                .clickOnEnterShopLink()
                .clickOnFishMenu()
                .clickOnFishType()
                .clickOnAddToChartFish()
                .clickOnProceedButton()
                .getMessageToCheck();

        String messageToBeDisplayed = "You must sign on before attempting to check out. Please sign on and try checking out again.";
        assertEquals(messageToCheck, messageToBeDisplayed);
    }
}
