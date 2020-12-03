package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import static org.testng.Assert.assertEquals;

public class FailedLoginTest extends TestBase{

    @Test
    public void failedLoginTest(){
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
