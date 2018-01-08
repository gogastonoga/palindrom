package com.capgemini.palindrom;

public class PalindromTest {

	public static void main(String[] args) {

		System.out.println("Czy wyrażenie 'kajak' jest palindromem?");
		System.out.println(Palindrom.isPalindrom(Palindrom.modifyPalindrom("kajak")));

		System.out.println("Czy wyrażenie 'a.sd.z.z.ser' jest palindromem?");
		System.out.println(Palindrom.isPalindrom(Palindrom.modifyPalindrom("a.sd.z.z.ser")));

		System.out.println("Czy wyrażenie 'Kobyla ma maly bok.' jest palindromem?");
		System.out.println(Palindrom.isPalindrom(Palindrom.modifyPalindrom("Kobyla ma maly bok.")));

		System.out.println("Czy wyrażenie ' ' jest palindromem?");
		System.out.println(Palindrom.isPalindrom(Palindrom.modifyPalindrom(" ")));

		System.out.println("Czy wyrażenie 'Ala ama ala' jest palindromem?");
		System.out.println(Palindrom.isPalindrom(Palindrom.modifyPalindrom("Ala ama ala")));

	}

}
