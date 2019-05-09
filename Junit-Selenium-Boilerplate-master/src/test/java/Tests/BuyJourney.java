package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.ShoppingCartPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class BuyJourney {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);

    @Before
    public void individualSetUp(){
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }

    /**Select Item from homepage, takes to product page
     * On homepage
     * Hover over a product's image
     * Click More Button
     * Verify product page is displayed
     */
    @Test
    public void selectItemFromHomepage() {
        homepage.hooverToMoreButton();

    }

    /** Add product to Cart from homepage
     * Hover over product from homepage
     * Click add to cart
     * Verify added to cart
     */
    @Test
    public void addProductToCartFromHomepage(){
        homepage.hooverToItem();
        homepage.ClickCheckout();


    }

    /** Add product to cart from Product page
     * On product page
     * Select Quantity
     * Select Size
     * Select Colour (if available)
     * Click add to cart
     * Verify Added to Cart
     */
    @Test
    public void addProductToCartFromProductPage(){

        homepage.hooverToMoreButton();
        shoppingCart.AddQuantity();
        shoppingCart.ClickSize();
        shoppingCart.SelectSize();
        shoppingCart.AddToCart();
        shoppingCart.ProceedToCart();




    }
}
