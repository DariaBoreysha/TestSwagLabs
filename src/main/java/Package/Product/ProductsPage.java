package Package.Product;

import Package.Base.BasePage;
import Package.Login.LoginPage;
import Package.Cart.CartPage;
import Package.Saucelabs.SauceLabs;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class ProductsPage extends BasePage {

    private SelenideElement productFilter = $x(".//select[@class='product_sort_container']");
    private SelenideElement filterOptionNameDESC = $x(".//select[@class='product_sort_container']/option[1]");
    private SelenideElement filterOptionNameASC = $x(".//select[@class='product_sort_container']/option[2]");
    private SelenideElement filterOptionPriceASC = $x(".//select[@class='product_sort_container']/option[3]");
    private SelenideElement filterOptionPriceDESC = $x(".//select[@class='product_sort_container']/option[4]");
    private ElementsCollection AddToCartButtons = $$x(".//button[contains(@id, 'add-to-cart')]");
    private ElementsCollection removeFromCartButtons = $$x(".//button[contains(@id, 'remove')]");
    private SelenideElement catalogueTitle = $x(".//span[@class='title']");
    private ElementsCollection numberOfProductsOnPage = $$x(".//div[@class='inventory_item_name']");

    public String getCatalogueTitle(){
        return catalogueTitle.getText();
    }

    public ProductsPage closeAlert(){
        switchTo().alert().accept();
        return this;
    }
    public ProductsPage addProductsToCart(){
        for (int i=0; i!=AddToCartButtons.size(); i++){
            AddToCartButtons.get(i).click();
        }
        return this;
    }

    public int numberOfProductsOnPage(){
      int numberOfProducts = numberOfProductsOnPage.size();
      return numberOfProducts;
    }

    public int numberOfProductsToAddOnPage(){
        int numberOfProductsToAdd = AddToCartButtons.size();
        return numberOfProductsToAdd;
    }
    public int numberOfProductsToRemoveOnPage(){
        int numberOfProductsToRemove = removeFromCartButtons.size();
        return numberOfProductsToRemove;
    }
    public ProductsPage removeProductsFromCart(){
        for (int i=0; i!=removeFromCartButtons.size(); i++){
            removeFromCartButtons.get(i).click();
        }
        return this;
    }
    public ProductsPage openProductsFilter(){
       productFilter.click();
        return this;
    }
    public ProductsPage filterByNameASC(){
       this.openProductsFilter();
       filterOptionNameASC.click();
       return this;
    }
    public ProductsPage filterByNameDESC(){
        this.openProductsFilter();
        filterOptionNameDESC.click();
        return this;}
    public ProductsPage filterByPriceASC(){
        this.openProductsFilter();
        filterOptionPriceASC.click();
        return this;
    }
    public ProductsPage filterByPriceDESC(){
        this.openProductsFilter();
        filterOptionPriceDESC.click();
        return this;
    }

 public int getTheAmountOfAddedGoods(){
       String theAmountOfAddedGoods = shoppingCartBadge.getText();
       int AmountOfAddedGoods = Integer.parseInt(theAmountOfAddedGoods);
       return AmountOfAddedGoods;
    }

}
