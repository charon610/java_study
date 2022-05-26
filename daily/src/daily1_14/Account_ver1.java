package daily1_14;

public class Account_ver1 {
	private String name;
	private String no;
	private long balance;

	Account_ver1(String n, String num, long z, Day d) {
		name = n;
		no = num;
		balance = z;
	}

	String getName() {
		return name;
	}

	String getNo() {
		return no;
	}

	long getBalance() {
		return balance;
	}

	void deposit(long k) {
		balance += k;
	}

	void wirhdraw(long k) {
		balance -= k;
	}
}