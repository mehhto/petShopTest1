package tests;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import page.objects.LandingPage;

import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase {

    @Issue("DEFECT-1")
    @TmsLink("ID-1")
    @Severity(SeverityLevel.NORMAL)
    @Test
    @Description("The goal of this test is to log in using not proper username and password" +
            " and check if warning message Invalid username or password is displayed")
    public void failedLoginTest() {
        LandingPage landingPage = new LandingPage();
        String messageToCheck = landingPage.clickOnEnterShopLink()
                .clickOnLoginPageLink()
                .typeUsernameIntoUsernameField("Wrong Username")
                .typeUsernameIntoUsernameField("Wrong Password")
                .clickLoginButton()
                .getMessageToCheck();

        assertEquals(messageToCheck, "Invalid username or password. Signon failed.");
    }
}
