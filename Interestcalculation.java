package datatypedemo;

import java.util.Scanner;

public class Interestcalculation {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a Principle");
	int Principle = sc.nextInt();
	System.out.println("Enter a Interest rate");
	//Scanner sc1 = new Scanner(System.in);
	int Interestrate = sc.nextInt();
	System.out.println("Enter a Timeduration");
	//Scanner sc2 = new Scanner(System.in);
	int Timeduration = sc.nextInt();
	System.out.println("You entered Principle " + Principle);
	System.out.println("You entered Interest rate " + Interestrate);
	System.out.println("You entered Timeduration " + Timeduration);

	
	int interest = Principle*Interestrate*Timeduration / 100 ;
	System.out.println(" Interset " + interest);
	
}
}
