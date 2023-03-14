package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoggedInTimerPage extends BasePage{

	private final By loggedIn = By.xpath(".//h1[@class='chakra-heading css-9lgfe2']");

	public LoggedInTimerPage(WebDriver driver) {
		super(driver);
	}

	public boolean loggedInShowTimer() {
		return driver.findElement(loggedIn).isDisplayed();
	}
}
