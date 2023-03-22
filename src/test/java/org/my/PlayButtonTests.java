package org.my;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class PlayButtonTests extends BaseUITest {
	@Test
	public void successfulClickPlayLAWButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isShowPlayLAWPopUp = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showPlayLAWPopUp();

		assertTrue("Failed to show PlayLAWButton", isShowPlayLAWPopUp);
	}
	@Test
	public void successfulClickPlayOnlineButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isShowPlayOnlineButton = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showPlayOnlineButton();

		assertTrue("Failed to show ClickPlayOnlineButton", isShowPlayOnlineButton);
	}
	@Test
	public void successfulClickDownloadAppStoreButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isDownloadAppStoreButton = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showDownloadAppStoreButton();

		assertTrue("Failed to show DownloadAppStoreButton", isDownloadAppStoreButton);
}
	@Test
	public void successfulClickDownloadGoogleButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isDownloadGoogleButton = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showDownloadGoogleButton();

		assertTrue("Failed to show DownloadGoogleButton", isDownloadGoogleButton);
	}
	@Test
	public void successfulClickDownloadWindowsButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isDownloadWindowsButton = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showDownloadWindowsButton();

		assertTrue("Failed to show DownloadGoogleButton", isDownloadWindowsButton);
	}
	@Test
	public void successfulClickDownloadMacOSButton() {
		MainPage mainPage = new MainPage(driver);

		boolean isDownloadMacOSButton = mainPage
				.open()
				.enterEmail(mainPage.getEmail())
				.enterPassword(mainPage.getOldPassword())
				.clickLoginButton()
				.clickPlayButton()
				.showDownloadMacOSButton();

		assertTrue("Failed to show DownloadMacOSButton", isDownloadMacOSButton);
	}
}

