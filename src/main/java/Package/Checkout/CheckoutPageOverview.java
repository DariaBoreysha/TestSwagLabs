package Package.Checkout;

import Package.Base.BasePage;
import Package.Product.DefiniteProductPage;
import Package.Product.ProductsPage;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.page;

public class CheckoutPageOverview extends BasePage {



    private SelenideElement linksToProducts = $x(".//div[@class='cart_item']//a");
    private SelenideElement finishButton = $x(".//button[@id='finish']");
    private SelenideElement cancelButton = $x(".//button[@id='cancel']");
    private SelenideElement itemTotalPrice = $x(".//div[@class='summary_subtotal_label']/text()[2]");
    private SelenideElement taxPrice = $x(".//div[@class='summary_tax_label']/text()[2]");
    private SelenideElement priceTotalAndTax = $x(".//div[@class='summary_info_label summary_total_label']/text()[2]");


    public ProductsPage clickOnCancelButton() {
        cancelButton.click();
        return page(ProductsPage.class);
    }

    public CheckoutPageComplete clickOnFinishButton() {
        finishButton.click();
        return page(CheckoutPageComplete.class);
    }

    public DefiniteProductPage openProductThroughProductLink() {
        linksToProducts.click();
        return page(DefiniteProductPage.class);
    }

}
