package datatypedemo;

import java.util.Scanner;

public class Usernamedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number- ");
		int a = sc.nextInt();
		System.out.print("Enter second number- ");
		int b = sc.nextInt();
		int c = a + b;
		System.out.println("Total= " + c);
	}

}
