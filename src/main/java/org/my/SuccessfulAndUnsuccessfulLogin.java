package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SuccessfulAndUnsuccessfulLogin extends BasePage{

	private final By loggedIn = By.xpath(".//h1[@class='chakra-heading css-9lgfe2']");
	private final By invalidLogin = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By passwordRecovery = By.xpath(".//h1[@class='chakra-heading css-2u101m']");

	public SuccessfulAndUnsuccessfulLogin(WebDriver driver) {
		super(driver);
	}

	public boolean loggedInShowTimer() {
		return driver.findElement(loggedIn).isDisplayed();
	}
	public boolean showErrorInvalidLogin() {
		return driver.findElement(invalidLogin).isDisplayed();
	}
	public boolean showPasswordRecovery() {
		return driver.findElement(passwordRecovery).isDisplayed();
	}

}
