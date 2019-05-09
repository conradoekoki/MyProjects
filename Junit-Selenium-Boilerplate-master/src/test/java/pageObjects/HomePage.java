package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }
    private static String URL = "http://automationpractice.com/index.php";
    private static final By SIGN_IN_BUTTON = By.cssSelector("a.login");
    private static final By Hover_To_Item = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
    private static final By Hover_To_AddToCart = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.ajax_add_to_cart_button.btn.btn-default > span");
    private static final By Click_Checkout = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span");
    private static final By Hover_To_More = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default > span");
    private static final By Hover_To_Item2 = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link > img");
   // private static final By Click_Item = By.cssSelector("#homefeatured > li.ajax_block_product.col-xs-12.col-sm-4.col-md-3.first-in-line.first-item-of-tablet-line.first-item-of-mobile-line > div > div.left-block > div > a.product_img_link");


   public void goTo(){
        driver.get(URL);
   }

   public void navigateToSignInPage(){
       waitAndClick(SIGN_IN_BUTTON);
   }
   public void hooverToItem()
   {
       Actions actions = new Actions(driver);
       actions.moveToElement(driver.findElement(Hover_To_Item))
               .moveToElement(driver.findElement(Hover_To_AddToCart)).click().build().perform();


   }
    public void hooverToMoreButton()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Hover_To_Item2))
                .moveToElement(driver.findElement(Hover_To_More)).click().build().perform();

    }
    public void ClickCheckout(){
       waitAndClick(Click_Checkout);
    }
   /* public void ClickItem(){
        waitAndClick(Click_Item);
    }*/





}
