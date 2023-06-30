package tests.Login.positive;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static Constants.Constant.TimeoutVariables.LoginsAndPasswords.PASSWORD_VALID;
import static Constants.Constant.TimeoutVariables.LoginsAndPasswords.USERNAME_VALID_STANDARD;
import static Constants.Constant.TimeoutVariables.URL.PRODUCT_PAGE_URL;


public class LoginPageTest extends BaseTest {

    @Test
    public void LoginWithValidCredentials() {
        productsPage = loginPage.loginIntoApp(USERNAME_VALID_STANDARD, PASSWORD_VALID);
        String title = productsPage.getCatalogueTitle();
        Assertions.assertEquals("Products", title);
    }

    @Test
    public void CheckTheCorrectRedirectAfterLogin() {
        loginPage.loginIntoApp(USERNAME_VALID_STANDARD, PASSWORD_VALID);
        String url = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assertions.assertEquals(PRODUCT_PAGE_URL, url);
    }

}

