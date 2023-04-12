package org.my;

import org.junit.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class LeaderboardsTests extends BaseUITest {

    @Test
    public void successfulOpenLeaderboards() {
        MainPage mainPage = new MainPage(driver);
        SuccessfulAndUnsuccessfulLogin successfulOpenLeaderboards = mainPage
                .open()
                .enterEmail(mainPage.getEmail())
                .enterPassword(mainPage.getOldPassword())
                .clickLoginButton();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        boolean isSuccessfulOpenLeaderboards = successfulOpenLeaderboards
                .waitForElement(wait, Locators.loggedIn)
                .clickMenuButton()
                .clickMenuLeaderboardsButton()
                .showLeaderboardsHomePage();

        assertTrue("Failed to open Leaderboards", isSuccessfulOpenLeaderboards);
    }
}