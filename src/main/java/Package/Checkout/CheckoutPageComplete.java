package Package.Checkout;

import Package.Base.BasePage;
import Package.Product.ProductsPage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class CheckoutPageComplete extends BasePage {

    private SelenideElement backToProductsButton = $x(".//button[@id='back-to-products']");
    private SelenideElement successMessage = $x(".//h2[@class='complete-header']");

    public String getSuccessMessage() {
        return successMessage.getText();
    }

    public ProductsPage clickOnBackHomeButton() {
        backToProductsButton.click();
        return page(ProductsPage.class);
    }
}
