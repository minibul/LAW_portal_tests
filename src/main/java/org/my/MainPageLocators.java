package org.my;

import org.openqa.selenium.By;

public class MainPageLocators {
    public static final By loginButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
    static final By confirmChangePasswordButton = By.xpath(".//button[@class='chakra-button css-1lhrl23']");
    static final By changePasswordButton = By.xpath(".//p[@class='chakra-text css-i1mhp8']");
    static final By mainPage = By.xpath(".//p[@class='chakra-text css-1c4puky']");
    static final By resetPasswordSendButton = By.xpath(".//button[@class='chakra-button css-lde9c0']");
    static final By registerButton = By.xpath(".//button[@class='chakra-button css-g8bpku']");
    static final By registrationTab = By.xpath(".//h2[@class='chakra-heading css-1ytomps']");
    static final By emailInput = By.xpath(".//input[@class='chakra-input css-1kejibv']");
    static final By currentPasswordInput = By.xpath(".//input[@type='password' and @name='oldPassword' and @placeholder='Current Password']");
    static final By newPasswordInput = By.xpath(".//input[@type='password' and @name='password' and @placeholder='Password']");
    static final By confirmNewPasswordInput = By.xpath(".//input[@type='password' and @name='changepassword' and @placeholder='Password']");
    static final By emailResetPasswordInput = By.xpath(".//input[@class='chakra-input css-o9n1tl']");
    static final By passwordInput = By.xpath(".//input[@class='chakra-input css-1mqp856']");
    static final By loginInput = By.xpath(".//input[@class='chakra-input css-dovvw3']");
    static final By forgotPassword = By.xpath("//a[contains(@href, 'password-recovery')]");
    static final By loginButtonAfterRecoveryPassword = By.xpath(".//div[@class='css-9nes4l']");
    public static final By loggedIn = By.xpath(".//h1[@class='chakra-heading css-9lgfe2']");
    static final By invalidLogin = By.xpath(".//button[@class='chakra-button css-g8bpku']");
    static final By passwordRecovery = By.xpath(".//p[@class='chakra-text css-1c4puky']");
    static final By invalidPasswordRecovery = By.xpath(".//div[@class='chakra-form__error-message css-105qply']");
    static final By menuButton = By.xpath(".//div[@class='css-1jrg5dv']");
    static final By menuGamepediaButton = By.xpath(".//p[@class='chakra-text css-1yuqmmm' and text()='Gamepedia']");
    static final By gamepediaOpeningConfirmation = By.xpath(".//button[@class='chakra-menu__menu-button css-k7jkx0']");
    static final By menuLeaderboardsButton = By.xpath(".//p[@class='chakra-text css-1yuqmmm' and text()='Leaderboards']");
    static final By leaderboardsOpeningConfirmation = By.xpath(".//div[@class='chakra-select__wrapper css-t7fkg9']");
    static final By playButton = By.cssSelector("img[src*='Play_Button.png']");
    static final By playLAWPopUp = By.xpath(".//div[@class='chakra-modal__body css-l19c9p']");
    static final By playOnlineButton = By.cssSelector("img[alt='Play_Online'].css-xth51");
    static final By downloadAppStoreButton = By.cssSelector("img[alt='Download_Appstore'].css-xth51");
    static final By downloadGoogleButton = By.cssSelector("img[alt='Download_Google'].css-xth51");
    static final By downloadWindowsButton = By.cssSelector("img[alt='Windows'].css-xth51");
    static final By downloadMacOSButton = By.cssSelector("img[alt='MacOS'].css-xth51");


}
