package com.capgemini.palindrom;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		System.out.println("Wprowadz slowo: ");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();

		String wordModificked = modifyPalindrom(word);
		String result = "";

		if (isPalindrom(wordModificked)) {
			result = word + " jest palindromem.";
		} else {
			result = word + " nie jest palindromem.";
		}
		System.out.println(result);
	}

	public static String modifyPalindrom(String word) {
		return word.toLowerCase().replaceAll("[^a-zA-Z0-9_-]", "").replaceAll(" ", "");
	}

	public static boolean isPalindrom(String word) {
		int length = word.length();
		if (length == 1 || length == 0)
			return true;
		if (word.charAt(0) == word.charAt(length - 1)) {
			String newWord = word.substring(1, length - 1);
			return isPalindrom(newWord);
		}
		return false;
	}

}