package tests.Products.positive;


import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.base.BaseTest;

import static Constants.Constant.TimeoutVariables.LoginsAndPasswords.PASSWORD_VALID;
import static Constants.Constant.TimeoutVariables.LoginsAndPasswords.USERNAME_VALID_STANDARD;

public class AddingProductsToCartTest extends BaseTest {

    /*@Test
    public void checkingNumberOfAddedProducts(){
        loginPage.loginIntoApp(USERNAME_VALID_STANDARD,PASSWORD_VALID);
        int number1 = productsPage.numberOfProductsToAddOnPage();
        productsPage.addProductsToCart();
        Assertions.assertEquals(number1, productsPage.getTheAmountOfAddedGoods());
    }*/
}
