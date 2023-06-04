package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewContactPage extends PageBase {

    public AddNewContactPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id ='form-name']")
    WebElement firstNameField;

    @FindBy(xpath = "//*[@id ='form-lastName']")
    WebElement lastNameField;

    @FindBy(xpath = "//*[@id ='form-about']")
    WebElement contactDescription;

    @FindBy(xpath = "//button[@type='reset']")
    WebElement cancelButton;

    @FindBy(xpath = "//div[@class='row d-flex justify-content-end mr-2']//button[@type='submit']")
    WebElement saveButton;

    @FindBy(xpath = "//span[@aria-hidden='true']")
    WebElement closePageButton;

    public void fillFirstNameField(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void fillLastNameField(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void fillDescriptionField(String description) {
        contactDescription.sendKeys(description);
    }

    public void clickOnSaveButton() {
        click(saveButton);
    }

    public void clickOnCancelButton() {
        click(cancelButton);
    }

    public void clickOnCloseAddAccountPageButton() {
        click(closePageButton);
    }
}
