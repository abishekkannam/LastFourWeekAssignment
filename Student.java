package datatypedemo;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a student name");
		String studentName = sc.nextLine();
		System.out.println("Enter a department");
		Scanner sc1 = new Scanner(System.in);
		String department = sc1.nextLine();
		System.out.println("Enter a rollnumber");
		int rollnumber = sc.nextInt();
		System.out.println("You entered Studentname " + studentName);
		System.out.println("You entered department " + department);
		System.out.println("You entered rollnumber " + rollnumber);

		System.out.println(studentName + " is studying in " + department + " department " + " : " + rollnumber);
	}

}
