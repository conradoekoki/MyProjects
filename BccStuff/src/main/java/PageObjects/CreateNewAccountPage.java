package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountPage extends BasePage {
    CreateNewAccountPage (WebDriver driver) {super (driver); }

    private static final By Enter_Email_Address = By.cssSelector("#user-identifier-input");
    private static final By Enter_Password = By.cssSelector("#password-input");
    private static final By Select_Gender = By.cssSelector("#gender-input > option:nth-child(3)");
    private static final By Post_Code = By.cssSelector("#postcode-input");
   // private static final By No_Thanks = By.cssSelector("#marketingOptIn > div.buttons__wrapper > div:nth-child(2)");

    private static final By Click_Register = By.cssSelector("#submit-button > span");
    private static final By Alert_Message = By.cssSelector("#form-message-email");

    private static final By Thanks_message = By.cssSelector("#container > div > div > div > div.page__wrapper > div.page__grid-wrapper > div.page__content-wrapper > div > h1 > span");






    public void EnterEmailAddress(String Email){
        findAndType(Enter_Email_Address, Email);
    }
    public void EnterPassword (String Password){
        findAndType(Enter_Password, Password);
    }
    public void SelectGender (){
        waitAndClick(Select_Gender);
    }
    public void PostCode (String PostCode){
        findAndType(Post_Code, PostCode);
    }
    public void ClickRegister (){
        waitAndClick(Click_Register);
    }

    public void NoThanks ()
    {
        WebElement clickButton = driver.findElement(By.cssSelector("#marketingOptIn > div.buttons__wrapper > div:nth-child(2)"));
        clickButton.click();
    }


    /*public void NoThanks ()  {


        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(No_Thanks));
        driver.findElement(No_Thanks).click();

    }*/
    public void AlertMeessage () {


        WebElement alertBox = driver.findElement(Alert_Message);
        Assert.assertEquals ("Looks like you’ve already registered with this email. Want to sign in?", alertBox.getText());
}
    public void RegisterAsNewUseryAlert ()
    {
        WebElement alertBox = driver.findElement(Thanks_message);
        Assert.assertEquals("Thanks. You're now signed in.", alertBox.getText());

    }


}
