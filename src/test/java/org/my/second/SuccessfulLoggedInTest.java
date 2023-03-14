package org.my.second;

import org.junit.Test;
import org.my.MainPage;

import static org.junit.Assert.assertTrue;

public class SuccessfulLoggedInTest extends BaseUITest {


	@Test
	public void checkSuccessfulLoggedIn() {
		boolean loggedInShowTimer = new MainPage(driver)
				.open()
				.enterEmail("anton.bondarev@sabregames.com")
				.enterPassword("111111111")
				.clickLoginButton()
				.loggedInShowTimer();


		assertTrue("Failed to login", loggedInShowTimer);

	}


}

