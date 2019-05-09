package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage extends BasePage {

    Homepage(WebDriver driver) {
        super(driver);
    }

    private static String URL = "https://bbc.co.uk/";
    private static final By SignIn = By.cssSelector("#idcta-link");
    private static final By Your_Account = By.cssSelector("#idcta-username");
    private static final By Sign_Out = By.cssSelector("#idcta-link");
    private static final By Sport_button = By.cssSelector("#orb-nav-links [href='https\\:\\/\\/www\\.bbc\\.co\\.uk\\/sport']");
    private static final By Football_Button = By.cssSelector(".sp-c-sport-navigation__inner [href='\\/sport\\/football']");
    private static final By football_alert = By.cssSelector("#sp-nav-secondary > li:nth-child(1) > a");
    private static final By Customise_Button = By.cssSelector("[aria-label='Customise your Homepage']");
    private static final By SignIn_Button = By.cssSelector("#orb-modules > div.hp-dialogs-container > div > div > div > p > a.hp-bbc-id-sign-in-controls__btn.hp-bbc-id-sign-in-controls__btn--sign-in");
    private static final By Select_Football = By.cssSelector("#orb-modules > div > div.hp-settings-wrapper.hp-settings__content > div > div > section:nth-child(2) > div > div > div:nth-child(1) > div > label > span");
    private static final By Select_Gaming = By.cssSelector("#orb-modules > div > div.hp-settings-wrapper.hp-settings__content > div > div > section:nth-child(3) > div > div > div:nth-child(4) > div > label > span");
    private static final By Back_Homepage = By.cssSelector("#orb-modules > div > div.hp-settings__footer > div > a");
    private static final By Find_Search = By.cssSelector("[role] [type='text']");
    private static final By Click_Search = By.cssSelector("#searchboxDrawerForm > button.se-searchbox__submit");
    private static final By Sounds_Homepage = By.cssSelector("#search-content > ol.editors-choice.results > li:nth-child(2) > article > div > h1");
    private static final By Sounds_Alert = By.cssSelector(".primary-title");
    private static final By More_Button = By.cssSelector("#orb-nav-more > a");
    private static final By Food_tab_Button = By.cssSelector("#orb-panel-more > div > ul > li.orb-nav-food > a");
    private static final By Recipies_Tab = By.cssSelector("#main-content > div.food-body.gel-pica.spring.spring_banner_3 > div.main-menu.main-menu--full-width > nav > ul > li.main-menu__item.main-menu__item--primary.main-menu__item--recipes > a");
    private static final By Dishes_Tab = By.cssSelector("#main-content > div.food-body.gel-pica.spring.spring_banner_3 > div.main-menu.main-menu--full-width > nav > ul > li.main-menu__item.main-menu__item--primary.main-menu__item--recipes > div > ul > li:nth-child(4) > a");
    private static final By Click_Video = By.cssSelector("#main > div.playback-gradient.playback-gradient--content.gel-wrap > div > button > div.play-cta__icon.js-play-cta-icon");
    private static final By ClickLyfestyle = By.cssSelector(".column-section [class='column-section__outer gel-1\\/3']:nth-of-type(2) [class='column-section__inner gel-1\\/1 gel-1\\/2\\@xl']:nth-of-type(1) li:nth-of-type(3) .column-section__item");
    private static final By Click_Iplayer = By.cssSelector("#orb-nav-links [href='https\\:\\/\\/www\\.bbc\\.co\\.uk\\/iplayer']");
    private static final By Select_Video = By.cssSelector("#main > div > div.list__groups.gel-wrap > section:nth-child(2) > div > div:nth-child(2) > div > div > ul > li:nth-child(2) > div > a > div:nth-child(2) > div");
    private static final By Click_Category = By.cssSelector("[aria-label='Categories'] .lnk__label--left");
    private static final By Video_Alert = By.cssSelector(".play-cta__text__title");
    private static final By MoreAlert_button = By.cssSelector("#main > div.playback-gradient.playback-gradient--content.gel-wrap > div > div:nth-child(2) > div > div.synopsis.typo.typo--canary > p > button");
    private static final By Video_SignIn_Button = By.cssSelector(".id4-cta-medium-mixed .id4-cta-button");
    private static final By No_PG = By.cssSelector("#toolTipPlay");
    private static final By SignIn_Radio = By.cssSelector(".id4-cta-medium-blue .id4-cta-button");

    private static final By Select_Sound_Category = By.cssSelector("[data-id='music-hiphoprnbanddancehall-rnb'] .sc-o-island > div:nth-of-type(2)");
    private static final By Select_Sound = By.cssSelector("#results > div:nth-child(2) > div > div.media__panel.\\35 \\2f 6\\40 gel3 > div > div.media__body.\\31 \\2f 2\\40 gel1b.\\32 \\2f 3\\40 gel3.\\34 \\2f 5\\40 gel5 > div > h4 > a");
    private static final By Play_Radio = By.cssSelector("#p_audioui_playpause");
    private static final By Click_Weather = By.cssSelector("#orb-nav-links [href='https\\:\\/\\/www\\.bbc\\.co\\.uk\\/weather']");
    private static final By Click_London = By.cssSelector(".wr-c-decorative-map-location__2643743 .wr-o-location-label > span:nth-of-type(1)");
    private static final By Click_Next_day = By.cssSelector("#wr-forecast > div.wr-time-slot-container > div > div.wr-time-slot-container__details-container > div.wr-time-slot-container__slots > div > div > div > div:nth-child(3) > a > div > div:nth-child(1)");
    private static final By Click_Scroll = By.cssSelector("#wr-forecast > div.wr-time-slot-container > div > div.wr-time-slot-container__details-container > div.wr-time-slot-container__slots > div > button.wr-carousel-arrow.wr-carousel-arrow--next.wr-js-carousel-arrow-next.wr-carousel-arrow--active");
    private static final By Weather_Alert = By.cssSelector("#daylink-1 > div.wr-day__title.wr-js-day-content-title > div > span.wr-date__longish");
    private static final By Click_Food_Searcch = By.xpath("//*[@id=\"main-content\"]/div[1]/div[3]/div/div[1]/div[1]/div/div/form/div[1]/input[1]");

    private static final By Food_Search_Button = By.cssSelector("#searchbar-search-button");
    private static final By Click_Churros = By.xpath("//*[@id=\"main-content\"]/div[1]/div[3]/div/div[4]/div[3]/div/div[2]/a/div[1]/div/div/div/div/h3");
    private static final By Food_Alert = By.cssSelector(".content-title__text");
    private static final By Click_Instagram = By.xpath("//a[@class='sp-c-fuh-social sp-c-fuh-social--instagram']//*[@height='64']");
    private static final By Click_Tomorrow_World = By.cssSelector("#orb-aside > div > div > ul > li.orb-nav-tomorrowsworld > a");
    private static final By Click_T_W_Banner = By.cssSelector("#content > div.genre-header > div.kandl-hero.k-colour-palette-tomorrows-world-blue > div.kandl-hero-link-holder > a > h2");
    private static final By Take_The_Test_Button = By.cssSelector("#guide > section.k-g-stp-container.step-number-2.even.k-g-narrative > div > div.k-g-stp > div > div > a");
    private static final By TW_Alert = By.cssSelector("#guide > div.k-iwonder-content > div > a");
    private static final By Click_Start = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---offWhite---1Fii8 > div.app-experience-Intro---Intro__bubble---1LytK > button");
    private static final By Tick_Cookies = By.cssSelector("#root > div > div.app-components-CookieBanner---CookieBanner---1iQRM.app-components-CookieBanner---visible---3Ng11 > div > a.app-components-CookieBanner---CookieBanner__confirm---3gISO");
    private static final By Click_Male = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---dusk---3xpzd > section > div > form > p > label.app-experience-UserQuestions---gender---1QSnH > select > option:nth-child(3)");
    private static final By Click_Confirm = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---dusk---3xpzd > div > div > button");
    private static final By Start_Quiz = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---dusk---3xpzd > div > div > button");
    private static final By Next_QuestionButton = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---sunrise---zPKvE > div > div.app-components-Bar---Bar__middle---2SfS4 > button");
    private static final By Confrim_Button = By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---fuchsia---1ZQQO > div > div > button");
    private static final By Quiz_Alert1 = By.xpath("//span[contains(text(),'Materialist')]");


    public void goTo() {
        driver.get(URL);
    }
    public void SignIn() {
        waitAndClick(SignIn);
    }
    public void YourAccount() {
        waitAndClick(Your_Account);
    }
    public void SignOut() {
        waitAndClick(Sign_Out);
    }
    public void SportButoon() {
        waitAndClick(Sport_button);
    }
    public void FootballButton() {
        waitAndClick(Football_Button);
    }
    public void CustomiseButton() {
        waitAndClick(Customise_Button);
    }
    public void SigninButton() {
        WebElement SignInButton = driver.findElement(By.cssSelector("#orb-modules > div.hp-dialogs-container > div > div > div > p > a.hp-bbc-id-sign-in-controls__btn.hp-bbc-id-sign-in-controls__btn--sign-in"));
        SignInButton.click();
    }

    public void SelectFootball() {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Select_Football));
        driver.findElement(Select_Football).click();
    }

    public void FootballAlert() {
        WebElement Footballalert = driver.findElement(football_alert);
        Assert.assertEquals("Football", Footballalert.getText());
    }

    public void SelectGaming() {

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Select_Gaming));
        driver.findElement(Select_Gaming).click();
    }

    public void BackHomepage() {
        waitAndClick(Back_Homepage);
    }
    public void FindSearch(String Search) {
        findAndType(Find_Search, Search);
    }
    public void ClickSearch() {
        waitAndClick(Click_Search);
    }
    public void SoundsHomepage() {
        waitAndClick(Sounds_Homepage);
    }
    public void FindRadioAlert() {

        WebElement alertbox = driver.findElement(Sounds_Alert);
        Assert.assertEquals("1Xtra's Throwback Thursday", alertbox.getText());
    }

    public void MoreButton() {
        waitAndClick(More_Button);
    }
    public void FoodButton() {
        waitAndClick(Food_tab_Button);
    }
    public void HoverToDishes() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Recipies_Tab)).moveToElement(driver.findElement(Dishes_Tab)).click().build().perform();

    }

    public void ClickVideo() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Click_Video)).click().build().perform();

    }

    public void ClickIplayer() {

        waitAndClick(Click_Iplayer);
    }
    public void SelectLifestyle() {
        waitAndClick(ClickLyfestyle);
    }
    public void SelectVideoCategory() {
        waitAndClick(Click_Category);
    }
    public void SelectVideo() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Select_Video))
                .click().build().perform();
    }

    public void VideoAlert() {
        WebElement alertbox1 = driver.findElement(Video_Alert);
        Assert.assertEquals("Focus", alertbox1.getText());
    }

    public void MoreAlertVideo() {
        waitAndClick(MoreAlert_button);
    }
    public void VideoSignInButton() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Video_SignIn_Button)).click().build().perform();
    }

    public void NoPG() {
        waitAndClick(No_PG);
    }
    public void SignInRadio() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(SignIn_Radio)).click().build().perform();
    }

    public void PlayRadio() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(Play_Radio)).click().build().perform();
    }

    public void SelectSoundCategory() {
        waitAndClick(Select_Sound_Category);
    }
    public void SelectSound() {
        waitAndClick(Select_Sound);
    }
    public void ClickWeather() {
        waitAndClick(Click_Weather);
    }
    public void ClickLondon() {
        waitAndClick(Click_London);
    }
    public void ClickNextDay() {
        waitAndClick(Click_Next_day);
    }
    public void ClickScroll() {
        waitAndClick(Click_Scroll);
    }
    public void WeatherAlert() {
        WebElement AssertBox = driver.findElement(Weather_Alert);
        Assert.assertEquals("Fri 15th", AssertBox.getText());

    }

    public void ClickFoodSearch(String food) {
        findAndType(Click_Food_Searcch, food);
    }
    public void ClickSearchButton() {
        waitAndClick(Food_Search_Button);
    }
    public void ClickChurros() {
        waitAndClick(Click_Churros);
    }
    public void FoodAlert() {
        WebElement AssertBox = driver.findElement(Food_Alert);
        Assert.assertEquals("Churros with peaches and custard", AssertBox.getText());

    }

    public void ClickInstagram() {
        waitAndClick(Click_Instagram);
    }
    public void ClickTomorrowWorld() {
        waitAndClick(Click_Tomorrow_World);
    }
    public void ClickTWBanner() {
        waitAndClick(Click_T_W_Banner);
    }
    public void TakeTheTestButton() {
        waitAndClick(Take_The_Test_Button);
    }
    public void TomorrowsWorldAlert() {
        WebElement Alertbox = driver.findElement(TW_Alert);
        Assert.assertEquals("Tomorrow's World", Alertbox.getText());
    }

    public void ClickStart() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Click_Start));
        driver.findElement(Click_Start).click();

    }

    public void TickCookies() {
        waitAndClick(Tick_Cookies);
    }
    public void ClickMale() {
        waitAndClick(Click_Male);
    }
    public void ClickConfirm() {
        waitAndClick(Click_Confirm);
    }
    public void StartQuizButton() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(Start_Quiz));
        driver.findElement(Start_Quiz).click();

    }

    public void Question1() throws InterruptedException {
        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(-50, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void NextQuestionButton() {
        waitAndClick(Next_QuestionButton);
    }
    public void Question2() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(-100, 0);
        move.release();
        move.perform();

        Thread.sleep(800);

    }

    public void Question3() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(-100, 0);
        move.release();
        move.perform();

        Thread.sleep(800);


    }

    public void Question4() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(80, 0);
        move.release();
        move.perform();

        Thread.sleep(1100);
    }

    public void Question5() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(80, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void Question6() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(0, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void Question7() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(100, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void Question8() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(-80, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void Question9() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));
//        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(-100, 0);
        move.release();
        move.perform();

        Thread.sleep(800);
    }

    public void Question10() throws InterruptedException {

        Thread.sleep(2000);
        WebElement
                myElement = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-ScalePicker---ScalePicker__knob---3Rk1_']")));


        //        myElement.click();

        ((JavascriptExecutor) driver).executeScript("scroll(0,80)");
        Actions move = new Actions(driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(160, 0);
        move.release();
        move.perform();

        Thread.sleep(2000);
    }

    public void ConfirmButton() {
        waitAndClick(Confrim_Button);
    }

    public void DragAndDropQuestion1() throws InterruptedException {

        WebElement to1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(3) > div")));

        WebElement
                From1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='app-components-RankPicker---RankPicker__options---22GdG']//fieldset[1]")));
        From1.click();


        Actions move = new Actions(driver);


        move.clickAndHold(From1).moveToElement(to1).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(3000);


        WebElement to2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(1) > div")));

        WebElement
                From2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(4) > div")));
        From2.click();


        move.clickAndHold(From2).moveToElement(to2).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(1000);


        waitAndClick(By.xpath("//button[@class='app-components-Button---Button---Qja4P app-components-Button---Button--white---1Wy_3 app-components-Button---Button--animate---msptK']"));

    }

    public void DragAndDropQuestion2() throws InterruptedException {

        WebElement to1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(3) > div")));

        WebElement
                From1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(2) > div")));
        From1.click();


        Actions move = new Actions(driver);


        move.clickAndHold(From1).moveToElement(to1).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(3000);


        WebElement to2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(3) > div")));

        WebElement
                From2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(4) > div")));
        From2.click();


        move.clickAndHold(From2).moveToElement(to2).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(1000);


        waitAndClick(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > div > div.app-components-Bar---Bar__middle---2SfS4 > button"));

    }

    public void DragAndDropQuestion3() throws InterruptedException {

        WebElement to1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(1) > div")));

        WebElement
                From1 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(3) > div")));
        From1.click();


        Actions move = new Actions(driver);


        move.clickAndHold(From1).moveToElement(to1).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(3000);


        WebElement to2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(1) > div")));

        WebElement
                From2 = (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > section > div > div.app-experience-SectionB-SectionB---form---3Pa8q > div:nth-child(2) > fieldset > div > div.app-components-RankPicker---RankPicker__options---22GdG > fieldset:nth-child(2) > div")));
        From2.click();


        move.clickAndHold(From2).moveToElement(to2).build().perform();
        Thread.sleep(3000);
        move.release();
        move.build().perform();

        Thread.sleep(1000);


        waitAndClick(By.cssSelector("#root > div > div.app-components-Page---Page---2HRAA.app-common-gradients---lavender---2FRVF > div > div.app-components-Bar---Bar__middle---2SfS4 > button"));

    }

    public void QuizAlert() {

        WebElement AlertBox = driver.findElement(Quiz_Alert1);
        Assert.assertEquals("MATERIALIST", AlertBox.getText());

    }
}

