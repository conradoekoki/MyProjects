package Tests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import pageObjects.ShoppingCartPage;
import pageObjects.CreateNewAccountPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import java.util.Random;

import static junit.framework.TestCase.assertTrue;
import static Tests.TestSuite.driverFactory;


/**
 * Created by jack.forman on 09/10/2016.
 */


public class Registration {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ShoppingCartPage basketpage = new ShoppingCartPage(driver);
    private SignInPage signInPage = new SignInPage(driver);
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);
    Random randomGenerator = new Random();


    /**
     * This should make sure we are on the correct page, i.e. set up each test case so we can be sure that they run
     */
    @Before
    public void individualSetUp(){
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }


    /** Cannot register if user Already Registered
     * Pre-Conditions - Must have Email address of user already registered
     * Navigate to Sign In Screen
     * Enter E mail Address
     * Click Create Account
     * Verify error message displayed
     */
    @Test
    public void registerAlreadyRegistered(){
        homepage.navigateToSignInPage();
        signInPage.enterEmailAddress("conrado@ten10.com");
        signInPage.clickCreateAnAccount();
        signInPage.alreadyRegisteredAlertPresent();
    }


    /**
     * New user is able to register (New = not registered before)
     * Navigate to signIn Page
     * Enter E-Mail Address
     * Click Create New Account
     * Fill in All Details on registration form
     * Click Register
     * Check My Account Page is Displayed
     */
    @Test
    public void registerAsNewUser(){

        homepage.navigateToSignInPage();
        String newEmail = "c" + randomGenerator.nextInt() + "@conrado.com";
        signInPage.enterEmailAddress (newEmail);
        signInPage.clickCreateAnAccount();

        createNewAccountPage.EnterFirstName("Conrado");
        createNewAccountPage.EnterLastName("Ekoki");
        createNewAccountPage.EnterPassword("Co12345");
        createNewAccountPage.ClickDay();
        createNewAccountPage.SelectDay();
        createNewAccountPage.SelectMonth();
        createNewAccountPage.ClicMonth();
        createNewAccountPage.SelectYear();
        createNewAccountPage.ClicYear();
        createNewAccountPage.EnterAddress("St Ann's Rise");
        createNewAccountPage.EnterCity("London");
        createNewAccountPage.ClickState();
        createNewAccountPage.SelectState();
        createNewAccountPage.EnterPostcode("00000");
        createNewAccountPage.TelephoneNumber("078254499324");
        createNewAccountPage.AssignAddress("");

        createNewAccountPage.ClickRegister();


    }




    @After
    public void individualTearDown(){

    }

    @AfterClass
    public static void mainTearDown(){
        // Uncomment this when just running individual tests in this file.
        //driver.quit();
    }


}
