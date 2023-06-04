package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactsPage extends PageBase {

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@href='/contacts']")
    WebElement addNewContactButton;

    public void clickOnAddNewContactButton() {
        click(addNewContactButton);
    }
}
