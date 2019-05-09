package Tests;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageObjects.ForgottenPassword;
import pageObjects.ShoppingCartPage;
import pageObjects.HomePage;
import pageObjects.SignInPage;

import static Tests.TestSuite.driverFactory;

/**
 * Created by jack.forman on 30/10/2016.
 */
public class SignIn {

    public static WebDriver driver = driverFactory.getDriver();
    private HomePage homepage = new HomePage(driver);
    private ForgottenPassword forgottenPasswordPage = new ForgottenPassword(driver);
    private SignInPage signIn = new SignInPage(driver);


    @Before
    public void individualSetUp(){
        homepage.goTo();
    }


    /** Sign in as Registered User
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign In
     * Verify My Account is Displayed
     */
    @Test
    public void signInAsRegisteredUser(){
        homepage.navigateToSignInPage();
        signIn.enterEmailAddress("conrado@ten10.com");
        signIn.EnterPassword("Co12345");
        signIn.ClickSignIn();


    }

    /**Cannot sign in as unregistered customer
     * Pre-Conditions - Must have Email address and Password of unregistered customer
     * Navigate to Sign in Page
     * Fill in Email Address
     * Fill in Password
     * Click Sign in
     * Verify Error Message is Displayed
     */
    @Test
    public void signInAsUnRegisteredUser(){
        homepage.navigateToSignInPage();
        signIn.enterEmailAddress("con@ten.com");
        signIn.EnterPassword("1234556");
        signIn.ClickSignIn();

    }

    /** Forgotten Password
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click Forgotten Password
     * Enter E mail Address
     * Click retrieve password
     * Confirmation message displayed
     */
    @Test
    public void forgottenPassword(){

        homepage.navigateToSignInPage();
        signIn.ClickForgottenPassword();
        forgottenPasswordPage.EnterEmail("Conrado@ten10.com");
        forgottenPasswordPage.ClickRetrievePassword();


    }

    /**Able to sign out
     * Pre-Conditions - Must have signIn information for a registered user
     * Navigate to Sign In Page
     * Click sign out
     * Verify customer signed out
     */
    @Test
    public void signOut(){
        homepage.navigateToSignInPage();
        signIn.EnterEmail("conrado@ten10.com");
        signIn.EnterPassword("Co12345");
        signIn.ClickSignIn();
        forgottenPasswordPage.ClickSignOut();
           }
}
