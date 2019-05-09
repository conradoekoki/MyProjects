package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgottenPassword extends BasePage {

    public ForgottenPassword(WebDriver driver) {
        super(driver);
    }

    private static final By Click_Sign_Out = By.cssSelector("#header > div.nav > div > div > nav > div:nth-child(2) > a");
    private static final By Enter_Email = By.cssSelector("#email");
    private static final By Retrieve_password = By.cssSelector("#form_forgotpassword > fieldset > p > button");

    public void ClickSignOut (){
        waitAndClick(Click_Sign_Out);
    }
    public void EnterEmail(String Email){
        findAndType(Enter_Email,Email);
    }
    public void ClickRetrievePassword()
    {
        waitAndClick(Retrieve_password);
    }
}
