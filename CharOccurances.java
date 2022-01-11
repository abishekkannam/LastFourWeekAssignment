package week1.day1;

public class CharOccurances {

	public static void main(String[] args) {
		String str = "Welcome to Chennai";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'n') {
				count++;
			}
		}
		System.out.println("Frequency of n is: " + count);
	}

}
