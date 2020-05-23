package StepDefinitions;

import java.util.Arrays;

public class Anagram {

	public static char[] convertStringToArray(String str) {

		char[] ch = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}

		return ch;

	}

	public static void main(String[] args) {

		String str1 = "DEAD";

		String str2 = "READ";

		char[] strArray1 = convertStringToArray(str1);

		char[] strArray2 = convertStringToArray(str2);

		boolean flag = verifyAnagram(strArray1, strArray2);

		if (flag)

			System.out.println("Strings are Anagram");

		else
			System.out.println("Strings are not Anagram");

	}

	public static boolean verifyAnagram(char[] array1, char[] array2) {
		int length1 = array1.length;

		int length2 = array2.length;

		int i;

		if (length1 != length2)
			return false;
		else {
			Arrays.sort(array1);

			Arrays.sort(array2);

			for (i = 0; i < length1; i++) {
				if (array1[i] != array2[i]) {
					return false;

				}

			}
			return true;

		}

	}

}
