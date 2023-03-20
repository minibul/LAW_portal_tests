package org.my;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class LoggedInTests extends BaseUITest {

	@Test
	public void checkSuccessfulLoggedIn() {
		MainPage mainPage = new MainPage(driver);

		boolean isLoggedInSuccessful = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.loggedInShowTimer();

		assertTrue("Failed to login", isLoggedInSuccessful);
	}
}
