package org.my;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class RandomDataGenerator extends BasePage {

	private static RandomDataGenerator instance;

	private RandomDataGenerator(WebDriver driver) {
		super(driver);
	}

	public static RandomDataGenerator getInstance(WebDriver driver) {
		if (instance == null) {
			instance = new RandomDataGenerator(driver);
		}
		return instance;
	}

	public static String generateRandomLogin(int minLength, int maxLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_ ";
		Random random = new Random();
		int length = random.nextInt(maxLength - minLength + 1 - 5) + minLength + 5;
		StringBuilder sb = new StringBuilder(length);
		sb.append("test_");
		for (int i = 0; i < length - 5; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		return sb.toString();
	}

	public static String generateRandomEmail(String domain, int localPartLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder("test_"); // Добавляем слово "test" в начале
		for (int i = 0; i < localPartLength; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		sb.append(".g@");
		sb.append(domain);
		return sb.toString();
	}

	public static String generateRandomPassword(int minLength) {
		if (minLength < 8) {
			throw new IllegalArgumentException("Password length should be at least 8 characters");
		}

		String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String allChars = upperCaseChars + lowerCaseChars + digits;
		Random random = new Random();

		StringBuilder sb = new StringBuilder(minLength);

		sb.append(upperCaseChars.charAt(random.nextInt(upperCaseChars.length())));
		sb.append(lowerCaseChars.charAt(random.nextInt(lowerCaseChars.length())));
		sb.append(digits.charAt(random.nextInt(digits.length())));

		for (int i = 3; i < minLength; i++) {
			sb.append(allChars.charAt(random.nextInt(allChars.length())));
		}

		return sb.toString().chars()
				.mapToObj(c -> (char) c)
				.sorted((c1, c2) -> random.nextInt(2) - 1)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
	}
}
