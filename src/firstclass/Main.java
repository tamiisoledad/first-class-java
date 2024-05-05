package firstclass;

public class Main {

	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount("Tamara");
		
		bankAccount.deposit(300.0);
		bankAccount.deposit(500.0);
		bankAccount.withdraw(180.00);
		bankAccount.withdraw(2000.0);
	}

}
