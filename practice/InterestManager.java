// 금액과 기간으로 이자와 예금총액을 계산하는 class
public class InterestManager {

	public double getInterestRate(int day) {
		// return interest by day

		double interest = 0;

		if (1 <= day && day <= 90) {
			interest = 0.5;
		} else if (day <= 180) {
			interest = 1;
		} else if (day <= 364) {
			interest = 2;
		} else if (365 <= day) {
			interest = 5.6;
		} else
			;

		return interest;
	}

	public double calculateAmount(int day, long amount) {
		// return total by day, amount

		double interest = getInterestRate(day);

		double interAmount = amount * (interest / 100);
		double totalAmount = amount + interAmount;

		return totalAmount;

	}

	public static void main(String[] args) {
		InterestManager manager = new InterestManager();

		int money = 1000000;

		for (int day = 1; day <= 365; day += 10) {
			double amount = manager.calculateAmount(day, money);
			System.out.println("day=" + day + ", amount=" + amount);

			// day += 9;
		}
	}
}