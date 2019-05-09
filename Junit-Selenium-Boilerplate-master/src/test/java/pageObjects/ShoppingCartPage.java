package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static junit.framework.TestCase.assertTrue;

/**
 * Created by jack.forman on 22/10/2016.
 */
public class ShoppingCartPage extends BasePage {

    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }

    private static final By Add_Quantity = By.cssSelector("#quantity_wanted_p > a.btn.btn-default.button-plus.product_quantity_up");
    private static final By Click_Size = By.cssSelector("#uniform-group_1");
    private static final By Select_Size = By.cssSelector("#group_1 > option:nth-child(3)");
    private static final By Add_To_Cart = By.cssSelector("#add_to_cart > button");
    private static final By Proceed_To_Cart = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a");
    private static final By Delete = By.cssSelector("#\\31 _5_0_0");
    private static final By Increase_Item = By.cssSelector("#cart_quantity_up_1_5_0_0");
    private static final By Verify_Shopping = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    private static final By EnterEmail = By.cssSelector("#email");
    private static final By Enter_Password = By.cssSelector("#passwd");
    private static final By Click_Sign_In = By.cssSelector("#SubmitLogin");
    private static final By ProceedToCheckout = By.cssSelector("#center_column > form > p > button");
    private static final By Terms_Conditions = By.cssSelector("#uniform-cgv > span");
    private static final By ProceedToCheckout2 = By.cssSelector("#form > p > button");
    private static final By Bank_Wire = By.cssSelector("#HOOK_PAYMENT > div:nth-child(1) > div > p > a");
    private static final By Confirmation = By.cssSelector("#cart_navigation > button");

    public void AddQuantity(){
        waitAndClick(Add_Quantity);
    }
    public void ClickSize(){
        waitAndClick(Click_Size);
    }
    public void SelectSize(){
        waitAndClick(Select_Size);
    }
    public void AddToCart(){
        waitAndClick(Add_To_Cart);
    }
    public void ProceedToCart(){
        waitAndClick(Proceed_To_Cart);
    }
    public void Delete(){
        waitAndClick(Delete);

    }
    public void IncreaseItem(){
        waitAndClick(Increase_Item);
    }
    public void VerifyShopping(){
        waitAndClick(Verify_Shopping);
    }
    public void enterEmail(String Email)
    {
        findAndType(EnterEmail,Email);
    }
    public void EnterPassword(String Password)
    {
        findAndType(Enter_Password,Password);
    }
    public void ClickSignIn()
    {
        waitAndClick(Click_Sign_In);
    }
    public void ProceedToCheckout()
    {
        waitAndClick(ProceedToCheckout);
    }
    public void TermsConditions()
    {
        waitAndClick(Terms_Conditions);
    }
    public void ProceedToCheckout2()
    {
        waitAndClick(ProceedToCheckout2);
    }
    public void BankWire()
    {
        waitAndClick(Bank_Wire);
    }
    public void Confirmation()
    {
        waitAndClick(Confirmation);
    }








}
