package com.bptn.course._01_big_coding_wk1;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a word: ");
		String word = scanner.nextLine();

		StringBuilder encrypted = new StringBuilder();

		for (char c : word.toCharArray()) {
			if (Character.isLetter(c)) {
				// Get the ASCII value
				int asciiValue = (int) c;

				// Shift the letter by one position
				int shiftedAsciiValue = asciiValue + 1;

				// Handle wrapping around from 'z' to 'a' or 'Z' to 'A'
				if (shiftedAsciiValue > 'z' && Character.isLowerCase(c)) {
					shiftedAsciiValue = 'a';
				} else if (shiftedAsciiValue > 'Z' && Character.isUpperCase(c)) {
					shiftedAsciiValue = 'A';
				}

				// Convert the shifted ASCII value back to a character
				char encryptedChar = (char) shiftedAsciiValue;

				encrypted.append(encryptedChar);
			} else {
				encrypted.append(c);
			}
		}

		System.out.println("Encrypted word: " + encrypted.toString());
		scanner.close();

	}

}
