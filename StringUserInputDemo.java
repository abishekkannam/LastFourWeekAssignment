package datatypedemo;

import java.util.Scanner;

public class StringUserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		System.out.println("You entered String " + s);
	}

}
