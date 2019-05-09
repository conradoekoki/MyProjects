package PageObjects;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import static PageObjects.TestSuite.driverFactory;

public class SignIn {
    public static WebDriver driver = driverFactory.getDriver();
    public static Homepage homepage = new Homepage(driver);
    public static SignInPage signIn = new SignInPage(driver);


    @Before
    public void individualSetUp(){
        driver.manage().deleteAllCookies();
        homepage.goTo();
    }

    @Test
    public void signInAsRegisteredUser(){
        homepage.SignIn();
        signIn.EnterEmail("ten10@test.com");
        signIn.EnterPassword("Co123456");
        signIn.ClickSignIn();
    }

    @Test
    public void signInAsUnRegisteredUser(){
        homepage.SignIn();
        signIn.EnterEmail("CONRADO0@test.com");
        signIn.EnterPassword("Co123456");
        signIn.ClickSignIn();
        signIn.SignInAsUnregisteredUserAlert();



    }

    @Test @Ignore
    public void forgottenPassword(){
        homepage.SignIn();
        signIn.ClickHelp();
        signIn.ClickForgot();
        signIn.EnterForgottenEmail("ten10@test.com");
        signIn.ClickSendEmail();
        signIn.ForgottenPasswordAlert();




    }


    @Test
    public void signOut(){
        homepage.SignIn();
        signIn.EnterEmail("ten10@test.com");
        signIn.EnterPassword("Co123456");
        signIn.ClickSignIn();
        homepage.YourAccount();
        homepage.SignOut();


    }












}
