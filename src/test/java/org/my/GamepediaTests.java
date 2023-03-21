package org.my;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class GamepediaTests extends BaseUITest {

    @Test
    public void successfulOpenGamepediaTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        SuccessfulAndUnsuccessfulLogin successfulOpenGamepediaTest = mainPage
                .open()
                .enterEmail(mainPage.getEmail())
                .enterPassword(mainPage.getOldPassword())
                .clickLoginButton();

        TimeUnit.SECONDS.sleep(5);

        boolean isOpenGamepediaTestSuccessful = successfulOpenGamepediaTest
                .clickMenuButton()
                .clickMenuGamepediaButton()
                .showGamepediaHomePage();

        assertTrue("Failed to open leaderboards", isOpenGamepediaTestSuccessful);
    }
}