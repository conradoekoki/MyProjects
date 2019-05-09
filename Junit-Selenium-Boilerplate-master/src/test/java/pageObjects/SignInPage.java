package pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class SignInPage extends BasePage {

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    private static final By EMAIL_ADDRESS_INPUT_BOX = By.cssSelector("input#email_create");
    private static final By CREATE_NEW_ACCOUNT_BUTTON = By.cssSelector("button#SubmitCreate");
    private static final By ALREADY_REGISTERED_ALERT = By.cssSelector("#create_account_error");
    private static final By EnterEmail = By.cssSelector("#email");
    private static final By Enter_Password = By.cssSelector("#passwd");
    private static final By Click_Sign_In = By.cssSelector("#SubmitLogin");
    private static final By Click_Forgotten_Password = By.cssSelector("#login_form > div > p.lost_password.form-group > a");


    public void enterEmailAddress(String emailAddress){
        findAndType(EMAIL_ADDRESS_INPUT_BOX, emailAddress);
    }

    public void clickCreateAnAccount(){
        waitAndClick(CREATE_NEW_ACCOUNT_BUTTON);
    }

    public void alreadyRegisteredAlertPresent(){
        WebElement alertBox = driver.findElement(ALREADY_REGISTERED_ALERT);
        Assert.assertTrue(elementIsVisible(alertBox));
    }
    public void EnterEmail(String Email)
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
    public void ClickForgottenPassword()
    {
        waitAndClick(Click_Forgotten_Password);
    }





}
