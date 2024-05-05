package firstclass;

public class BankAccount {

	private String accountOwner;
	private Double balance;
	
	public BankAccount(String accountOwner) {
		this.accountOwner = accountOwner;
		this.balance = 0.0;
	}
	
	public void deposit(Double amount) {
		this.balance += amount;
		System.out.println("Depositaste $" + amount);
		System.out.println("Tu nuevo balance es $" + this.balance);
	}
	
	public void withdraw(Double amount) {
		if (this.balance >= amount) {
			System.out.println("Retiraste $" + amount);
			this.balance -= amount;
			System.out.println("Tu nuevo balance es $" + this.balance);
		} else {
			System.out.println("No tienes suficientes fondos para retirar esa cantidad");
		}
	}
}
