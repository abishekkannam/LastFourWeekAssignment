package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {

		String test = "I am a software tester";
		String rev = "";
		String newstr = "";
		String[] split = test.split(" ");
		int len = split.length;
		for (int i = 1; i < len; i += 2) {
			for (int j = split[i].length(); j > 0; j--) {
				rev = rev + split[i].charAt(j - 1);
			}

			split[i] = rev;
			rev = "";
		}

		for (int k = 0; k < len; k++) {
			if (k == 0) {
				newstr = split[k];
			} else {
				newstr = newstr + " " + split[k];
			}
		}

		System.out.println(newstr);

	}

}
