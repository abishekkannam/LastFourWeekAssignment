package datatypedemo;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first name");
		String name = sc.nextLine();
		System.out.println("Enter a salary");
		int salary = sc.nextInt();
		System.out.println("Enter a company");
		Scanner sc1 = new Scanner(System.in);
		String company = sc1.nextLine();
		System.out.println("You entered name " + name);
		System.out.println("You entered salary" + salary);
		System.out.println("You entered company " + company);

		System.out.println(name + " is working in " + company + " and earning " + salary);
	}

}
