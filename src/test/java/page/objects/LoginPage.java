package page.objects;

import driver.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.waits.WaitForElement;

public class LoginPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#Content ul[class='messages'] li")
    private WebElement message;

    @FindBy(name = "username")
    private WebElement usernameInputField;

    @FindBy(name = "password")
    private WebElement passwordInputField;

    @FindBy(name = "signon")
    private WebElement loginButton;

    public LoginPage() {

        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public String getMessageToCheck() {
        WaitForElement.waitUntilElementVisible(message);
        String messageToCheck = message.getText();
        logger.info("Returned warning message was: {}", messageToCheck);
        return messageToCheck;
    }

    public LoginPage typeUsernameIntoUsernameField(String username) {
        WaitForElement.waitUntilElementIsClickable(usernameInputField);
        usernameInputField.sendKeys(username);
        logger.info("Typed username into Username Input Field");
        return this;
    }

    public LoginPage typePasswordIntoPasswordField(String password) {
        WaitForElement.waitUntilElementIsClickable(passwordInputField);
        passwordInputField.sendKeys(password);
        logger.info("Typed password into Password Input Field");
        return new LoginPage();
    }

    public LoginPage clickLoginButton() {
        WaitForElement.waitUntilElementIsClickable(loginButton);
        loginButton.click();
        logger.info("Clicked login button");
        return new LoginPage();
    }

}
