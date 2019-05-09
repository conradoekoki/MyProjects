package PageObjects;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static PageObjects.TestSuite.driverFactory;

public class TestPages {

    static WebDriver driver = driverFactory.getDriver ();
    public static Homepage homepage = new Homepage(driver);
    public static SignInPage signIn = new SignInPage(driver);
    private static final By Question_1 = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---sunrise---zPKvE > section > div > div.app-experience-SectionA-SectionA---SectionA__question---B-yER > div > div.app-components-ScalePicker---ScalePicker---1K8l6.app-experience-SectionA-ScaleQuestion---slider---3ttVR > div.app-components-ScalePicker---ScalePicker__bar---1rtXh > div.app-components-ScalePicker---ScalePicker__handle---23yPj.react-draggable.react-draggable-dragged");
    @Before
    public void individualSetup() {
        driver.manage().deleteAllCookies();
        homepage.goTo();

    }

    /**Tomorrows World is a BBC quiz
     *
     * From homepage scroll down and click on Tomorrows World tab
     * proceed on the page till you get to the 10 quiz questions
     * Answer all 10 questions by ratting your answer from 1 - 6
     * Proceed to the next set of questions & answer the questions by using the drag and drop method
     *
     */
    @Test
    public void TomorrowsWorld () throws InterruptedException{
        ((JavascriptExecutor)driver).executeScript("scroll(0,11000)");
        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,15000)");
        homepage.ClickTomorrowWorld();
        homepage.ClickTWBanner();
        homepage.TomorrowsWorldAlert();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
        homepage.TakeTheTestButton();
        homepage.TickCookies();
        homepage.ClickStart();
        homepage.ClickMale();
        homepage.ClickConfirm();
        //Thread.sleep(400);
        homepage.StartQuizButton();
        Thread.sleep(1000);
        homepage.Question1();
        homepage.NextQuestionButton();
        Thread.sleep(1000);
        homepage.Question2();
        homepage.NextQuestionButton();

        homepage.Question3();
        homepage.NextQuestionButton();

        homepage.Question4();
        homepage.NextQuestionButton();

        homepage.Question5();
        homepage.NextQuestionButton();

        homepage.Question6();
        homepage.NextQuestionButton();

        homepage.Question7();
        homepage.NextQuestionButton();

        homepage.Question8();
        homepage.NextQuestionButton();

        homepage.Question9();
        homepage.NextQuestionButton();

        homepage.Question10();
        homepage.NextQuestionButton();
        Thread.sleep(1000);

        homepage.ConfirmButton();

        homepage.DragAndDropQuestion1();
        homepage.DragAndDropQuestion2();
        homepage.DragAndDropQuestion3();

//        homepage.QuizAlert();






    }
    @Test
    /** Open BBC sport Instagram
     *
     * Click on the Sport tab on the BBC homepage followed by clicking the football tab
     * verify the football page is displayed
     * scroll down and Click on the Instagram logo
     *
     */
    public void SportFootball() throws InterruptedException{

        homepage.SportButoon();
        homepage.FootballButton();
        homepage.FootballAlert();
        ((JavascriptExecutor)driver).executeScript("scroll(0,4400)");
        Thread.sleep(400);
        homepage.ClickInstagram();


    }

    /** Customise the BBC homepage sections
     * Click the Customise homepage tab
     * Tick and untick different sections
     * Go back to the homepage and verify the changes
     *
     */
    @Test
    public void CustomisePage(){
        homepage.CustomiseButton();
        homepage.SelectFootball();
        homepage.SelectGaming();
        homepage.BackHomepage();



    }

    /** Find a radio category and play the sound
     *
     *  Search "Radio" from the BBC homepage
     *  Click on BBC sounds Homepage
     *  scroll down and Select a category
     *  Select a sound and play it
     *  verify the radio sound is displayed
     */

    @Test
    public void FindRadioHomepage () throws InterruptedException{
        driver.manage().deleteAllCookies();
        homepage.FindSearch("Radio");
        homepage.ClickSearch();
        homepage.SoundsHomepage();
        Thread.sleep(400);
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");
        homepage.SelectSoundCategory();
        homepage.SelectSound();
        Thread.sleep(400);
        homepage.SignInRadio();
        /*signIn.EnterEmail("ten10@test.com");
        signIn.EnterPassword("Co123456");
        signIn.ClickSignIn();
        Thread.sleep(400);
        homepage.PlayRadio();*/
        homepage.FindRadioAlert();

    }
    @Test

    /** Find a particular type of food with the recipe
     *
     * From the BBC Homepage click on More button drop down menu and select FOOD
     * Hover from recipes to dishes
     * Search a particular type of food and get the ingredients and recipe
     *
     */
    public void FindFood () throws InterruptedException{
        homepage.MoreButton();
        homepage.FoodButton();
        Thread.sleep(400);
        homepage.HoverToDishes();
        homepage.ClickFoodSearch("Churros");
        homepage.ClickSearchButton();
        homepage.ClickChurros();
        homepage.FoodAlert();

    }

    /** Play a video from the BBC IPlayer
     *
     *  Click IPlayer from the BBC homepage
     *  From the IPlayer page click category followed by Lifestyle
     *  Scroll the page down and Select a video
     *  Play the video selected
     *  Verify the video page is displayed.
     *
     */

    @Test
    public void PlayVideo () throws InterruptedException {

        homepage.ClickIplayer();
        homepage.SelectVideoCategory();
        homepage.SelectLifestyle();
        ((JavascriptExecutor)driver).executeScript("scroll(0,1200)");

        homepage.SelectVideo();
        homepage.MoreAlertVideo();

        homepage.ClickVideo();
        Thread.sleep(4000);
        homepage.VideoSignInButton();
        signIn.EnterEmail("ten10@test.com");
        signIn.EnterPassword("Co123456");
        signIn.ClickSignIn();
        homepage.ClickVideo();
        Thread.sleep(2000);
//        homepage.NoPG();
        homepage.VideoAlert();
    }
    @Test
    /** Display todays and tomorrows weather
     *
     * Click weather from the BBC homepage
     * Select a city to view the weather
     * Scroll the weather section to select next days weather
     * verify next days weather page is displayed with the right date on
     *
     */
    public void Weather () throws InterruptedException{

        homepage.ClickWeather();
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        homepage.ClickLondon();

        WebElement
        myElement = (new WebDriverWait(driver, 5))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#wr-forecast > div.wr-time-slot-container > div > div.wr-time-slot-container__details-container > div.wr-time-slot-container__slots > div > div")));
        myElement.click();
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(4000,0);
        move.release();
        move.perform();

        Thread.sleep(200);
        homepage.ClickScroll();
        Thread.sleep(200);
       // ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        homepage.ClickNextDay();
        homepage.WeatherAlert();

        //((JavascriptExecutor)driver.findElement(Weather_Scroll_Bar)).executeScript("window.scrollBy(2000,0)");


        //((JavascriptExecutor)driver.findElement(Weather_Scroll_Bar)).executeScript("scroll(0,1200)");

    }

    @AfterClass
    public static void mainTearDown (){
        //driver.quit();

    }


}
