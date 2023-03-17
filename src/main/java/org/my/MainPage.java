package org.my;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class MainPage extends BasePage{

	public static final String URL = "https://stg-portal.legendsatwar.io/login";
	private final By loginButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By resetPasswordSendButton = By.xpath(".//button[@class='chakra-button css-lde9c0']");
	private final By registerButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
	private final By registrationTab = By.xpath(".//h2[@class='chakra-heading css-1ytomps']");
	private final By emailInput = By.xpath(".//input[@class='chakra-input css-1kejibv']");
	private final By emailResetPasswordInput = By.xpath(".//input[@class='chakra-input css-o9n1tl']");
	private final By passwordInput = By.xpath(".//input[@class='chakra-input css-1mqp856']");
	private final By loginInput = By.xpath(".//input[@class='chakra-input css-dovvw3']");
	private final By forgotPassword = By.xpath("//a[contains(@href, 'password-recovery')]");


	public MainPage(WebDriver driver) {
		super(driver);
	}

	public SuccessfulAndUnsuccessfulLogin clickLoginButton() {
		driver.findElement(loginButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public SuccessfulAndUnsuccessfulLogin clickResetPasswordSendButton() {
		driver.findElement(resetPasswordSendButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage clickRegistrationTab() {
		driver.findElement(registrationTab).click();
		return this;
	}

	public MainPage clickForgotPassword() {
		driver.findElement(forgotPassword).click();
		return this;
	}

	public SuccessfulAndUnsuccessfulLogin clickRegisterButton() {
		driver.findElement(registerButton).click();
		return new SuccessfulAndUnsuccessfulLogin(driver);
	}

	public MainPage enterLogin(String enterLogin) {
		driver.findElement(loginInput).sendKeys(enterLogin);
		return this;
	}

	public MainPage enterEmailForResetPassword(String enterEmail) {
		driver.findElement(emailResetPasswordInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterEmail(String enterEmail) {
		driver.findElement(emailInput).sendKeys(enterEmail);
		return this;
	}

	public MainPage enterRandomLogin(int minLength, int maxLength) {
		GenerateRandomLoginEmailPassword generateRandomLoginEmailPassword = new GenerateRandomLoginEmailPassword(driver);
		String login = generateRandomLoginEmailPassword.generateRandomLogin(minLength, maxLength);
		driver.findElement(loginInput).sendKeys(login);
		return this;
	}

	public MainPage enterRandomEmail(String domain, int localPartLength) {
		GenerateRandomLoginEmailPassword generateRandomLoginEmailPassword = new GenerateRandomLoginEmailPassword(driver);
		String email = generateRandomLoginEmailPassword.generateRandomEmail(domain, localPartLength);
		driver.findElement(emailInput).sendKeys(email);
		return this;
	}

	public MainPage enterRandomPassword(int minLength) {
		GenerateRandomLoginEmailPassword generateRandomLoginEmailPassword = new GenerateRandomLoginEmailPassword(driver);
		String password = generateRandomLoginEmailPassword.generateRandomPassword(minLength);
		driver.findElement(passwordInput).sendKeys(password);
		return this;
	}

	public MainPage enterPassword(String enterPassword) {
		driver.findElement(passwordInput).sendKeys(enterPassword);
		return this;
	}

	public MainPage open() {
		driver.get(URL);
		return this;
	}
}