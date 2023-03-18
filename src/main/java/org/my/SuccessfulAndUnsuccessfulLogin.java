package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessfulAndUnsuccessfulLogin extends BasePage{

	private final By loggedIn = By.xpath(".//h1[@class='chakra-heading css-9lgfe2']");
	private final By invalidLogin = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By passwordRecovery = By.xpath(".//p[@class='chakra-text css-1c4puky']");
	private final By invalidPasswordRecovery = By.xpath(".//div[@class='chakra-form__error-message css-105qply']");
	private final By loginButtonAfterRecoveryPassword = By.xpath(".//div[@class='css-9nes4l']");
	private final By menuButton = By.xpath(".//div[@class='css-1jrg5dv']");
	private final By mainPage = By.xpath(".//p[@class='chakra-text css-1c4puky']");

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
	public boolean showInvalidPasswordRecovery() {
		return driver.findElement(invalidPasswordRecovery).isDisplayed();
	}
	public MainPage clickLoginButtonAfterRecoveryPassword() {
		driver.findElement(loginButtonAfterRecoveryPassword).click();
		return new MainPage(driver);
	}
	public MainPage clickMenuButton() {
		driver.findElement(menuButton).click();
		return new MainPage(driver);
	}
	public boolean showMainPageAfterPasswordRecovery() {
		return driver.findElement(mainPage).isDisplayed();
	}


}
