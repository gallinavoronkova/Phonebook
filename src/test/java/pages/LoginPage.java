package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //Fill email and password fields
    //Click Login button

    @FindBy(xpath = "//*[@type='email']")
    WebElement emailField;

    @FindBy(xpath = "//*[@type='password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement loginButton;

    public void fillEmailField(String email) {
        emailField.sendKeys(email);
    }

    public void fillPasswordField(String password) {
        passwordField.sendKeys(password);
    }

    public void clickOnLoginButton() {
        click(loginButton);
    }

}
