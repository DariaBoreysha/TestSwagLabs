package Package.Product;

import Package.Base.BasePage;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class DefiniteProductPage extends BasePage {


    private SelenideElement removeButton = $x(".//button[@class='btn btn_secondary btn_small btn_inventory']");
    private SelenideElement backToProductsButton = $x(".//button[@id='back-to-products']");


    public DefiniteProductPage removeProduct() {
        removeButton.click();
        return this;
    }

    public ProductsPage clickOnBackToProductsButton() {
        backToProductsButton.click();
        return page(ProductsPage.class);
    }
}
