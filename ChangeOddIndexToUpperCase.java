package week3.day1;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		char[] str1 = test.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (i % 2 == 0) {
				System.out.println(Character.toUpperCase(str1[i]));
			} else {
				System.out.println(str1[i]);
			}
		}
	}

}
