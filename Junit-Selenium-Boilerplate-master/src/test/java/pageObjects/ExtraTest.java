package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExtraTest extends BasePage {

    public ExtraTest(WebDriver driver) {
        super(driver);
    }

    private static final By Click_Dress = By.cssSelector("#block_top_menu > ul > li:nth-child(2) > a");
    private static final By Click_Polyester = By.cssSelector("#uniform-layered_id_feature_1 > span");
    private static final By Click_Midi_Dress = By.cssSelector("#uniform-layered_id_feature_20 > span");
    private static final By Click_More_Button = By.cssSelector("#center_column > ul > li > div > div.right-block > div.button-container > a.button.lnk_view.btn.btn-default > span");
    private static final By Add_To_Cart = By.cssSelector("#add_to_cart > button");
    private static final By Proceed_To_Checkout = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
    private static final By compare_item1 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.functional-buttons.clearfix > div.compare > a");
    private static final By compare_item2 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line > div > div.functional-buttons.clearfix > div.compare > a");
    private static final By image1 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.first-in-line.last-line.first-item-of-tablet-line.first-item-of-mobile-line.last-mobile-line > div > div.left-block > div");
    private static final By image2 = By.cssSelector("#center_column > ul > li.ajax_block_product.col-xs-12.col-sm-6.col-md-4.last-line.last-item-of-tablet-line.last-mobile-line.hovered > div > div.left-block > div > a.product_img_link > img");
    private static final By compare_button = By.cssSelector(("#center_column > div:nth-child(6) > div > form > button"));

    public void ClickDress() {
        waitAndClick(Click_Dress);
    }

    public void ClickPolyester() {
        waitAndClick(Click_Polyester);
    }

    public void ClickMidiDress() {

        waitAndClick(Click_Midi_Dress);
    }

    public void ClickMore() {
        waitAndClick(Click_More_Button);
    }

    public void ClickAddToCart() {
        waitAndClick(Add_To_Cart);
    }

    public void ProceedToCheckout() {
        waitAndClick(Proceed_To_Checkout);
    }

    private By locatorForProductByIndex(int index) {
        return By.cssSelector("ul.product_list > li:nth-child(" + index + ")");
    }

    public void waitUntilCompareButtonShowsItems(int number) {
        wait.until(ExpectedConditions.textToBe(By.cssSelector("form.compare-form button[type=submit]"),
                "Compare (" + number + ")"));

    }

    public void HoverDress() {

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Click_Dress)).click().build().perform();
        actions.moveToElement(driver.findElement(Click_Polyester)).click().build().perform();

        WebElement firstDress = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locatorForProductByIndex(1)));
        WebElement secondDress = wait.until(
                ExpectedConditions.visibilityOfElementLocated(locatorForProductByIndex(2)));

        waitUntilCompareButtonShowsItems(0);

        WebElement firstAddToCompare = firstDress.findElement(By.cssSelector("a.add_to_compare"));
        WebElement secondAddToCompare = secondDress.findElement(By.cssSelector("a.add_to_compare"));


        actions
                .moveToElement(firstDress)
                .moveToElement(firstAddToCompare)
                .click()
                .build().perform();
        waitUntilCompareButtonShowsItems(1);

        actions
                .moveToElement(secondDress)
                .moveToElement(secondAddToCompare)
                .click()
                .build().perform();
        waitUntilCompareButtonShowsItems(2);


//           actions.moveToElement(driver.findElement(image1))
//                    .moveToElement(driver.findElement(compare_item1)).click().build().perform();
//
//            actions.moveToElement(driver.findElement(image2))
//                    .moveToElement(driver.findElement(compare_item2)).click().build().perform();


        actions.moveToElement(driver.findElement(compare_button)).click().build().perform();

    }


}
