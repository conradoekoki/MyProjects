package PageObjects;

import org.junit.*;
import org.openqa.selenium.WebDriver;

import java.util.Random;

import static PageObjects.TestSuite.driverFactory;


public class Registration {

    public static WebDriver driver = driverFactory.getDriver();
    private Homepage homepage = new Homepage(driver);
    private SignInPage signIn = new SignInPage(driver);
    Random randomGenerator = new Random();
    private CreateNewAccountPage createNewAccountPage = new CreateNewAccountPage(driver);




    @Before
    public void IndividualSetup (){
        driver.manage().deleteAllCookies();
        homepage.goTo();

    }
    @Test
    public void registerAlreadyRegistered  () throws InterruptedException {

        homepage.SignIn();
        signIn.ClickRegister();
        signIn.Over13();

        signIn.EnterDay("6");
        signIn.EnterMonth("December");
        signIn.EnterYear("2000");
        Thread.sleep(1000);
        signIn.ClickContinue();
        createNewAccountPage.EnterEmailAddress("ten1310@test.com");
        createNewAccountPage.EnterPassword ("Co123456");
        createNewAccountPage.PostCode("SE20 8AR");
        createNewAccountPage.SelectGender();
        createNewAccountPage.NoThanks();
        createNewAccountPage.ClickRegister();
        createNewAccountPage.AlertMeessage();


    }
    @Test
    public void registerAsNewUser () throws InterruptedException {


        homepage.SignIn();
        signIn.ClickRegister();
        signIn.Over13();

        signIn.EnterDay("6");
        signIn.EnterMonth("December");
        signIn.EnterYear("1998");
        Thread.sleep(1000);
        signIn.ClickContinue();

        String newEmail = "c" + randomGenerator.nextInt() + "@conrado.com";
        createNewAccountPage.EnterEmailAddress (newEmail);
        createNewAccountPage.EnterPassword ("Co123456");
        createNewAccountPage.PostCode("SE20 8AR");
        createNewAccountPage.SelectGender();
        createNewAccountPage.NoThanks();
        createNewAccountPage.ClickRegister();
        createNewAccountPage.RegisterAsNewUseryAlert();




    }

    @After
    public void individualTearDown (){

    }
    @AfterClass
    public static void mainTearDown (){
        //driver.quit();

    }









}
