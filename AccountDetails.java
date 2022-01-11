package week3.day1;

public class AccountDetails extends BankingInformationDetails {
	public void deposit() {

		System.out.println("Amount deposited in Area branch");

	}

	public static void main(String[] args) {
		AccountDetails ad = new AccountDetails();
		ad.deposit();
		ad.savings();
		ad.Fixed();
	}

}