package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.ExtraTest;
import pageObjects.HomePage;
import pageObjects.ShoppingCartPage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 08/11/2016.
 */
public class ShoppingCart {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private ShoppingCartPage shoppingCart = new ShoppingCartPage(driver);
    private SignInPage signIn = new SignInPage(driver);
    private ExtraTest extraTest = new ExtraTest(driver);

    @Before
    public void individualSetUp(){
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }

    /**Remove item from shopping cart
     * Pre-Condition - Item must be in basket
     * Navigate to basket
     * Click Delete
     * Verify Item is removed from Basket
     * Extension - verify pricing and totals are updated to reflect accurately
     */
    @Test
    public void removeItemFromShoppingBasket() throws InterruptedException {
        homepage.hooverToMoreButton();
        Thread.sleep(1000);
        shoppingCart.AddQuantity();
        shoppingCart.ClickSize();
        shoppingCart.SelectSize();
        shoppingCart.AddToCart();
        shoppingCart.ProceedToCart();
        shoppingCart.Delete();

    }

    /**Increase quantity of product
     * Pre-Condition - Must have one item in basket
     * Navigate to basket
     * Increase quantity of product
     * Verify basket updated with correct quantity
     * Verify Product counter (Top right) is updated
     * Extension - verify pricing and totals are updated to reflect accurately
     */
    @Test
    public void increaseQuantityOfProductInBasket(){
        homepage.hooverToMoreButton();
        shoppingCart.AddQuantity();
        shoppingCart.ClickSize();
        shoppingCart.SelectSize();
        shoppingCart.AddToCart();
        shoppingCart.ProceedToCart();
        shoppingCart.IncreaseItem();



    }

    /** Proceed to checkout - not signed in
     * Pre-Condition - Must have one item in basket && not be signed in
     * Navigate to basket
     * Click proceed to checkout
     * Verify sign in page displayed
     */
    @Test
    public void proceedToCheckoutNotLoggedIn(){
        homepage.hooverToMoreButton();
        shoppingCart.AddToCart();
        shoppingCart.ProceedToCart();
        shoppingCart.VerifyShopping();


    }

    /** Proceed to checkout - signed in
     * Pre-Condition - Must have one item in basket && be signed in
     * Navigate to basket
     * Click proceed to checkout
     * Delivery Address Page is shown
     * Click proceed to checkout
     * Shipping page is shown
     * Agree to terms of service
     * Click proceed to checkout
     * Payment page is displayed
     * Click pay by bank wire
     * Confirm order
     * Order confirmation page is displayed
     */
    @Test
    public void proceedToCheckoutAndBuyLoggedIn(){

        homepage.hooverToMoreButton();
        shoppingCart.AddToCart();
        shoppingCart.ProceedToCart();
        shoppingCart.VerifyShopping();

        shoppingCart.enterEmail("conrado@ten10.com");
        shoppingCart.EnterPassword("Co12345");
        shoppingCart.ClickSignIn();

        shoppingCart.ProceedToCheckout();
        shoppingCart.TermsConditions();
        shoppingCart.ProceedToCheckout2();
        shoppingCart.BankWire();
        shoppingCart.Confirmation();



    }

    /**Proceed to checkout under Dress items
     * Navigate to Dress
     * Click polyester
     * Click Midi Dress
     * Click item
     * Add to cart
     * Verify checkout
     */
    @Test
    public void ProceedToDressWear() throws InterruptedException{
        extraTest.ClickDress();
        extraTest.ClickPolyester();
        extraTest.ClickMidiDress();
        Thread.sleep(1000);
        extraTest.ClickMore();
        extraTest.ClickAddToCart();
        extraTest.ProceedToCheckout();




    }
    /**Hover to Dress section and compare items
     * Hover to Dress
     * Click polyester
     * Compare items
     */
    @Test
    public void CompareItems (){
        extraTest.HoverDress();





    }


}
