package Package.Cart;

import Package.Base.BasePage;
import Package.Checkout.CheckoutPage;
import Package.Login.LoginPage;
import Package.Product.ProductsPage;
import Package.Saucelabs.SauceLabs;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;


import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class CartPage extends BasePage {


    private ElementsCollection removeButtons = $$x(".//button[text()='Remove']");
    private SelenideElement continueShoppingButton = $x(".//button[text()='Continue Shopping']");
    private SelenideElement checkOutButton = $x(".//button[text()='Checkout']");


    public CartPage removeAllGoodsFromCart(){
        for(int i=0; i!=removeButtons.size(); i++){
            removeButtons.get(i).click();
        }
        return this;
    }

    public ProductsPage goToListOfProducts(){
        continueShoppingButton.click();
        return page(ProductsPage.class);
    }
    public CheckoutPage goToCheckoutPage(){
        checkOutButton.click();
        return page(CheckoutPage.class);
    }



}
