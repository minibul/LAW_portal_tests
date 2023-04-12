package org.my;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;


import static org.junit.Assert.assertTrue;

public class GamepediaTests extends BaseUITest {

    @Test
    public void successfulOpenGamepediaTest() {
        MainPage mainPage = new MainPage(driver);
        SuccessfulAndUnsuccessfulLogin successfulOpenGamepediaTest = mainPage
                .open()
                .enterEmail(mainPage.getEmail())
                .enterPassword(mainPage.getOldPassword())
                .clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        boolean isOpenGamepediaTestSuccessful = successfulOpenGamepediaTest
                .waitForElement(wait, Locators.loggedIn)
                .clickMenuButton()
                .clickMenuGamepediaButton()
                .showGamepediaHomePage();

        assertTrue("Failed to open leaderboards", isOpenGamepediaTestSuccessful);
    }
}
