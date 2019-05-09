package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by jack.forman on 23/10/2016.
 */
public class CreateNewAccountPage extends BasePage {

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    private static final By First_Name = By.cssSelector("#customer_firstname");
    private static final By Last_Name = By.cssSelector("#customer_lastname");
    private static final By Password = By.cssSelector("#passwd");
    private static final By click_Day = By.cssSelector("#uniform-days");
    private static final By Select_Day = By.cssSelector("#days > option:nth-child(7)");
    private static final By click_Month = By.cssSelector("#uniform-months");
    private static final By Select_Month= By.cssSelector("#months > option:nth-child(8)");
    private static final By click_Year = By.cssSelector("#uniform-years");
    private static final By Select_Year = By.cssSelector("#years > option:nth-child(20)");
    private static final By Enter_Address = By.cssSelector("#address1");
    private static final By Enter_City = By.cssSelector("#city");
    private static final By Enter_Postcode = By.cssSelector("#postcode");
    private static final By Select_State = By.cssSelector("#uniform-id_country");
    private static final By Click_State = By.cssSelector("#id_state > option:nth-child(22)");
    private static final By Telephone_Number = By.cssSelector("#phone_mobile");
    private static final By Assign_Address = By.cssSelector("#alias");
    private static final By Click_Register = By.cssSelector("#submitAccount");



    public void EnterFirstName (String FirstName)
    {
        findAndType(First_Name, FirstName);
    }
    public void EnterLastName (String LastName)
    {
        findAndType(Last_Name, LastName);
    }
    public void EnterPassword (String password)
    {
        findAndType(Password, password);
    }
    public void ClickDay()

    {
        waitAndClick(click_Day);
    }
    public void SelectDay()

    {
        waitAndClick(Select_Day);
    }
    public void ClicMonth()

    {
        waitAndClick(click_Month);
    }
    public void SelectMonth()

    {
        waitAndClick(Select_Month);
    }
    public void ClicYear()

    {
        waitAndClick(click_Year);
    }
    public void SelectYear()

    {
        waitAndClick(Select_Year);
    }
    public void EnterAddress (String Address)
    {
        findAndType (Enter_Address, Address);
    }
    public void EnterCity (String city)
    {
        findAndType (Enter_City, city);
    }
    public void EnterPostcode (String Postcode)
    {
        findAndType (Enter_Postcode, Postcode);
    }
    public void SelectState()

    {
        waitAndClick(Select_State);
    }
    public void ClickState()

    {
        waitAndClick(Click_State);
    }
    public void TelephoneNumber (String TNumber)
    {
        findAndType (Telephone_Number, TNumber);
    }
    public void AssignAddress (String AssignAddress)
    {
        findAndType (Assign_Address, AssignAddress);
    }
    public void ClickRegister()
    {
        waitAndClick(Click_Register);
    }




}
