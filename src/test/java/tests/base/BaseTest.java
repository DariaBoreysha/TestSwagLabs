package tests.base;

import Package.Base.BasePage;
import Package.Cart.CartPage;
import Package.Checkout.CheckoutPage;
import Package.Checkout.CheckoutPageComplete;
import Package.Checkout.CheckoutPageOverview;
import Package.Login.LoginPage;
import Package.Product.DefiniteProductPage;
import Package.Product.ProductsPage;
import Package.Saucelabs.SauceLabs;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.time.LocalTime;
import java.util.Objects;

import static Constants.Constant.TimeoutVariables.URL.APP_URL;
import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static common.CommonActions.clearBrowserCookieAndStorage;
import static common.Config.CLEAR_SCREENSHOTS_DIR;
import static common.Config.HOLD_BROWSER_OPEN;


@ExtendWith(Listener.class)

//@Execution(ExecutionMode.CONCURRENT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {
    protected BasePage basePage = new BasePage();
    protected LoginPage loginPage = new LoginPage();
    protected DefiniteProductPage definiteProductPage = new DefiniteProductPage();
    protected ProductsPage productsPage = new ProductsPage();
    protected CartPage cartPage = new CartPage();
    protected CheckoutPage checkoutPage = new CheckoutPage();
    protected CheckoutPageOverview checkoutPageOverview = new CheckoutPageOverview();
    protected CheckoutPageComplete checkoutPageComplete = new CheckoutPageComplete();
    protected SauceLabs sauceLabs = new SauceLabs();
    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);

    static {
        LOGGER.info("START TIME:" + LocalTime.now());
        LOGGER.info("START CLEAR REPORTS DIR: target/allure-results..." + LocalTime.now());
        File allureResults = new File("target/allure-results");
        if (allureResults.isDirectory()) {
            for (File item : Objects.requireNonNull(allureResults.listFiles()))
                item.delete();
        }
        if (CLEAR_SCREENSHOTS_DIR) {
            File allureScreenshots = new File("build/reports");
            for (File item : Objects.requireNonNull(allureScreenshots.listFiles()))
                item.delete();
        }
    }

    @BeforeEach
    void openApp() {
        open(APP_URL);
    }

    @AfterEach
    void clearCookiesAndLocalStorage() {
        clearBrowserCookieAndStorage();
    }

    @AfterAll
    void tearDown() {
        if (!HOLD_BROWSER_OPEN) {
            closeWebDriver();
        }
    }
}
