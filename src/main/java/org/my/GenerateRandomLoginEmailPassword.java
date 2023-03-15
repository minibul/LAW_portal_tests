package org.my;

import org.openqa.selenium.WebDriver;

import java.util.Random;

public class GenerateRandomLoginEmailPassword extends BasePage {

	public GenerateRandomLoginEmailPassword(WebDriver driver) {
		super(driver);
	}

	public String generateRandomLogin(int minLength, int maxLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_ ";
		Random random = new Random();
		int length = random.nextInt(maxLength - minLength + 1 - 4) + minLength + 4;
		StringBuilder sb = new StringBuilder(length);
		sb.append("test");
		for (int i = 0; i < length - 4; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		return sb.toString();
	}

	public String generateRandomEmail(String domain, int localPartLength) {
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		Random random = new Random();
		StringBuilder sb = new StringBuilder(localPartLength);
		for (int i = 0; i < localPartLength; i++) {
			int index = random.nextInt(chars.length());
			sb.append(chars.charAt(index));
		}
		sb.append("@");
		sb.append(domain);
		return sb.toString();
	}
	public String generateRandomPassword(int minLength) {
		if (minLength < 8) {
			throw new IllegalArgumentException("Password length should be at least 8 characters");
		}

		String upperCaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCaseChars = "abcdefghijklmnopqrstuvwxyz";
		String digits = "0123456789";
		String allChars = upperCaseChars + lowerCaseChars + digits;
		Random random = new Random();

		StringBuilder sb = new StringBuilder(minLength);

		// Гарантируем наличие хотя бы одного символа верхнего регистра, одного нижнего регистра и одной цифры
		sb.append(upperCaseChars.charAt(random.nextInt(upperCaseChars.length())));
		sb.append(lowerCaseChars.charAt(random.nextInt(lowerCaseChars.length())));
		sb.append(digits.charAt(random.nextInt(digits.length())));

		// Заполняем оставшиеся символы случайным образом
		for (int i = 3; i < minLength; i++) {
			sb.append(allChars.charAt(random.nextInt(allChars.length())));
		}

		// Перемешиваем символы, чтобы гарантировать случайность
		return sb.toString().chars()
				.mapToObj(c -> (char) c)
				.sorted((c1, c2) -> random.nextInt(2) - 1)
				.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
				.toString();
	}
}


