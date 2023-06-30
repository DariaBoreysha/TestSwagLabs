package Package.Checkout;

import Package.Base.BasePage;
import Package.Cart.CartPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class CheckoutPage extends BasePage {

    private SelenideElement inputFirstName = $x(".//input[@id='first-name']");
    private SelenideElement inputLastName = $x(".//input[@id='last-name']");
    private SelenideElement inputPostalCode = $x(".//input[@id='postal-code']");
    private SelenideElement continueCheckoutButton = $x(".//input[@id = 'continue']");
    private SelenideElement cancelButton = $x(".//button[@id = 'cancel']");
    private SelenideElement errorForFirstNameAbsence = $x(".//div[@class='error-message-container error']/h3/text()");
    private SelenideElement errorForLastNameAbsence = $x(".//div[@class='error-message-container error']/h3/text()");
    private SelenideElement errorForPostalCodeAbsence = $x(".//div[@class='error-message-container error']/h3/text()");
    private SelenideElement closeErrorMessageButton = $x(".//button[@class='error-button']");


    public CartPage clickCancelButton() {
        cancelButton.click();
        return page(CartPage.class);
    }

    public CheckoutPageOverview clickContinueCheckoutButton() {
        continueCheckoutButton.click();
        return page(CheckoutPageOverview.class);
    }

    public CheckoutPage typeFirstName(String firstName) {
        inputFirstName.setValue(firstName);
        return this;
    }

    public CheckoutPage typeLastName(String lastName) {
        inputLastName.setValue(lastName);
        return this;
    }

    public CheckoutPage typePostalCode(String postalCode) {
        inputPostalCode.setValue(postalCode);
        return this;
    }

    public CheckoutPage fillingAllFields(String firstName, String lastName, String postalCode) {
        this.typeFirstName(firstName)
                .typeLastName(lastName)
                .typePostalCode(postalCode);
        return this;
    }

    public CheckoutPageOverview continueMakingOrder(String firstName, String lastName, String postalCode) {
        this.fillingAllFields(firstName, lastName, postalCode)
                .clickContinueCheckoutButton();
        return page(CheckoutPageOverview.class);
    }

    public CheckoutPageOverview leaveFirstInputEmpty(String lastName, String postalCode) {
        this.typeLastName(lastName)
                .typePostalCode(postalCode)
                .clickContinueCheckoutButton();
        return page(CheckoutPageOverview.class);
    }

    public CheckoutPageOverview leaveSecondInputEmpty(String firstName, String postalCode) {
        this.typeFirstName(firstName)
                .typePostalCode(postalCode)
                .clickContinueCheckoutButton();
        return page(CheckoutPageOverview.class);
    }

    public CheckoutPageOverview leaveThirdInputEmpty(String firstName, String lastName) {
        this.typeFirstName(firstName)
                .typeLastName(lastName)
                .clickContinueCheckoutButton();
        return page(CheckoutPageOverview.class);
    }
}
