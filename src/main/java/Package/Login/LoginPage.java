package Package.Login;

import Package.Base.BasePage;
import Package.Product.ProductsPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class LoginPage extends BasePage {


    private SelenideElement usernameInput = $x(".//input[@id='user-name']");
    private SelenideElement passwordInput = $x(".//input[@id='password']");
    private SelenideElement loginButton = $x(".//input[@id='login-button']");
    private SelenideElement InvalidCredentialsErrorMessageText = $x(".//div[@class='error-message-container error']/h3");
    private SelenideElement noPasswordErrorMessageText = $x(".//div[@class='error-message-container error']/h3");
    private SelenideElement noLoginErrorMessageText = $x(".//div[@class='error-message-container error']/h3");
    private SelenideElement errorButton = $x(".//button[@class='error-button']");
    private SelenideElement catalogueTitle = $x(".//span[@class='title']");

    public String GetInvalidCredentialsErrorText() {
        return InvalidCredentialsErrorMessageText.getText();
    }

    public String GetNoUsernameErrorText() {
        return noLoginErrorMessageText.getText();
    }

    public String GetNoPasswordErrorText() {
        return noPasswordErrorMessageText.getText();
    }

    public ProductsPage loginIntoApp(String userName, String password) {
        usernameInput.setValue(userName);
        passwordInput.setValue(password);
        loginButton.click();
        return page(ProductsPage.class);
    }

    public String getCatalogueTitle() {
        return catalogueTitle.getText();
    }

    public LoginPage loginWithFieldsEmpty() {
        loginButton.click();
        return page(LoginPage.class);
    }

    public LoginPage loginWithoutUserName(String password) {
        passwordInput.setValue(password);
        loginButton.click();
        return page(LoginPage.class);
    }

    public LoginPage loginWithoutPassWord(String userName) {
        usernameInput.setValue(userName);
        loginButton.click();
        return page(LoginPage.class);
    }

    public LoginPage loginWithWrongCredentials(String userName, String password) {
        usernameInput.setValue(userName);
        passwordInput.setValue(password);
        loginButton.click();
        return page(LoginPage.class);
    }

}
