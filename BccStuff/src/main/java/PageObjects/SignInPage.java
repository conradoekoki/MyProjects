package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignInPage extends BasePage {
    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public CreateNewAccountPage createNewAccount = new CreateNewAccountPage(driver);

    private static final By Enter_Email = By.cssSelector("#user-identifier-input");
    private static final By Enter_Password = By.cssSelector("#password-input");
    private static final By Click_SignIn = By.cssSelector("#submit-button");
    private static final By Click_Register = By.cssSelector("#signin-page > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div.page__content.page__content--secondary > a");
    private static final By Over13 = By.cssSelector("#container > div > div > div > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div > div.form > fieldset > div.buttons__wrapper > a:nth-child(2)");
    private static final By Enter_Day = By.cssSelector("#day-input");
    private static final By Enter_Month = By.cssSelector("#month-input");
    private static final By Enter_Year = By.cssSelector("#year-input");
    private static final By Click_Continue = By.cssSelector("#submit-button");
    private static final By Click_Help = By.cssSelector("#signin-page > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div:nth-child(1) > form > p > a > span");
    private static final By Click_Forgot = By.cssSelector("#container > div > div > div > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div > ul > li:nth-child(1) > a > span");
    private static final By Enter_ForgottenEmail = By.cssSelector("#user-identifier-input");
    private static final By Click_Send_Email = By.cssSelector("#submit-button");
    private static final By Sorry_cant_Find_Alert = By.cssSelector("#form-message-username");
    private static final By Click_on_Email_Alert = By.cssSelector("#container > div > div > div > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div > p:nth-child(3) > span:nth-child(1)");


    public void EnterEmail(String email) {
        findAndType(Enter_Email, email);
    }

    public void EnterPassword(String password) {
        findAndType(Enter_Password, password);
    }

    public void ClickSignIn() {
        waitAndClick(Click_SignIn);
    }

    public void ClickRegister() {
        waitAndClick(Click_Register);
    }

    public void Over13() {
        waitAndClick(Over13);
    }


    public void EnterDay(String Day) {
        findAndType(Enter_Day, Day);
    }

    public void EnterMonth(String Month) {
        findAndType(Enter_Month, Month);
    }

    public void EnterYear(String Year) {
        findAndType(Enter_Year, Year);
    }

    public void ClickContinue() {

        WebElement clickColour = driver.findElement(By.cssSelector("#submit-button"));
        clickColour.click();
    }


    public void ClickHelp() {
        waitAndClick(Click_Help);
    }

    public void ClickForgot() {
        waitAndClick(Click_Forgot);
    }

    public void EnterForgottenEmail(String ForgottenEmail) {
        findAndType(Enter_ForgottenEmail, ForgottenEmail);
    }

    public void ClickSendEmail() {
        waitAndClick(Click_Send_Email);
    }

    public void SignInAsUnregisteredUserAlert() {
        WebElement alertbox = driver.findElement(Sorry_cant_Find_Alert);
        Assert.assertEquals("Sorry, we can’t find an account with that email. You can register for a new account or get help here.", alertbox.getText());
    }

    public void ForgottenPasswordAlert() {


        WebElement alertbox = driver.findElement(Click_on_Email_Alert);
        Assert.assertEquals("Click the link in the email we've just sent to reset your password.It may take a few minutes to arrive.", alertbox.getText());
    }


}
