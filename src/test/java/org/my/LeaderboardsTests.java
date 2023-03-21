package org.my;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class LeaderboardsTests extends BaseUITest {

    @Test
    public void successfulOpenLeaderboards() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        SuccessfulAndUnsuccessfulLogin successfulOpenLeaderboards = mainPage
                .open()
                .enterEmail(mainPage.getEmail())
                .enterPassword(mainPage.getOldPassword())
                .clickLoginButton();

        TimeUnit.SECONDS.sleep(5);

        boolean isSuccessfulOpenLeaderboards = successfulOpenLeaderboards
                .clickMenuButton()
                .clickMenuLeaderboardsButton()
                .showLeaderboardsHomePage();

        assertTrue("Failed to open gamepedia", isSuccessfulOpenLeaderboards);
    }
}