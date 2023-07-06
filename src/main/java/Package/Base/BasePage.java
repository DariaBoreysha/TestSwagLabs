package Package.Base;

import Package.Cart.CartPage;
import Package.Login.LoginPage;
import Package.Product.ProductsPage;
import Package.Saucelabs.SauceLabs;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;


public class BasePage {

    public final SelenideElement shoppingCartLink = $x(".//a[@class='shopping_cart_link']");
    public final SelenideElement shoppingCartBadge = $x(".//span[@class='shopping_cart_badge']");
    public final SelenideElement burgerButton = $x(".//button[@id='react-burger-menu-btn']");
    public final SelenideElement allItemsBurgerOption = $x(".//a[@id='inventory_sidebar_link']");
    public final SelenideElement aboutBurgerOption = $x(".//a[@id='about_sidebar_link']");
    public final SelenideElement logoutBurgerOption = $x("logout_sidebar_link");

    public void goToURL(String URL) {
        open(URL);
    }

    public void openBurger() {
        burgerButton.click();
    }

    public ProductsPage clickOnAllItemsOption() {
        this.openBurger();
        allItemsBurgerOption.click();
        return page(ProductsPage.class);
    }

    public SauceLabs clickOnAboutOption() {
        this.openBurger();
        aboutBurgerOption.click();
        return page(SauceLabs.class);
    }

    public LoginPage clickOnLogOutOption() {
        this.openBurger();
        logoutBurgerOption.click();
        return page(LoginPage.class);
    }

    public CartPage goToCart() {
        shoppingCartLink.click();
        return page(CartPage.class);
    }
}
