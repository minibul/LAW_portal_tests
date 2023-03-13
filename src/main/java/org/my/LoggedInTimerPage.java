package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInTimerPage extends BasePage{

	private final By loggedIn = By.className("chakra-text css-1twwkzv");

	public LoggedInTimerPage(WebDriver driver) {
		super(driver);
	}

	public boolean loggedInShowTimer() {
		return driver.findElement(loggedIn).isDisplayed();
	}
}
