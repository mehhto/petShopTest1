package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import page.objects.LandingPage;

import static org.testng.Assert.assertEquals;

public class FishBuyTest extends TestBase {

    @TmsLink("ID-2")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Description("The goal of this test is add to cart a product without login " +
            "and check if warning message to login is displayed.")
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
