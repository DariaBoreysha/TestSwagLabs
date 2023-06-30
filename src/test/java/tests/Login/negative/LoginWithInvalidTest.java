package tests.Login.negative;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static Constants.Constant.TimeoutVariables.LoginsAndPasswords.*;

public class LoginWithInvalidTest extends BaseTest {
    @Test
    public void LoginWithInvalidCredentials() {
        loginPage.loginWithWrongCredentials(USERNAME_INVALID, PASSWORD_INVALID);
        String errorText = loginPage.GetInvalidCredentialsErrorText();
        Assertions.assertEquals("Epic sadface: Username and password do not match any user in this service", errorText);
    }

    @Test
    public void LoginWithoutUsername() {
        loginPage.loginWithoutUserName(PASSWORD_VALID);
        String errorText = loginPage.GetNoUsernameErrorText();
        Assertions.assertEquals("Epic sadface: Username is required", errorText);
    }

    @Test
    public void LoginWithoutPassword() {
        loginPage.loginWithoutPassWord(USERNAME_VALID_STANDARD);
        String errorText = loginPage.GetNoPasswordErrorText();
        Assertions.assertEquals("Epic sadface: Password is required", errorText);
    }

    @Test
    public void LoginWithEmptyFields() {
        loginPage.loginWithFieldsEmpty();
        String errorText = loginPage.GetNoUsernameErrorText();
        Assertions.assertEquals("Epic sadface: Username is required", errorText);
    }
}
