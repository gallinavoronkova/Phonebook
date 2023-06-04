package e2e;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.AddNewContactPage;
import pages.ContactsPage;
import pages.LoginPage;

public class AddNewContactTest extends TestBase {

    Faker faker = new Faker();

    LoginPage loginPage;

    ContactsPage contactsPage;

    AddNewContactPage addNewContactPage;

    @Test
    public void addNewContact() {
        loginPage = new LoginPage(app.driver);
        contactsPage = new ContactsPage(app.driver);
        addNewContactPage = new AddNewContactPage(app.driver);

        String email = "test@gmail.com";
        String password = "test@gmail.com";
        String firstName = faker.internet().uuid();
        String lastName = faker.internet().uuid();
        String description = faker.internet().uuid();

        loginPage.fillEmailField(email);
        loginPage.fillPasswordField(password);

        loginPage.clickOnLoginButton();

        contactsPage.clickOnAddNewContactButton();

        addNewContactPage.fillFirstNameField(firstName);
        addNewContactPage.fillLastNameField(lastName);
        addNewContactPage.fillDescriptionField(description);

        addNewContactPage.clickOnSaveButton();

    }
}
