package chapter2;

public class CurrencyFormat {

	public static void main(String[] args) {
		double monthlyPay = 5000.0;
		double annualPay = monthlyPay * 12;
		System.out.printf("Your annual pay is $%,.2f", annualPay);
	}
}
