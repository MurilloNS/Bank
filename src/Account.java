
public abstract class Account implements IAccount{
	private static final int STANDARD_AGENCY = 1;
	private static int SEQUENTIAL = 1;
	
	private int agency;
	private int number;
	private double balance;
	protected Client client;

	public Account(Client client) {
		this.agency = STANDARD_AGENCY;
		this.number = SEQUENTIAL++;
		this.client = client;
	}
	
	@Override
	public void withdraw(double value) {
		balance -= value;
	}

	@Override
	public void deposit(double value) {
		balance += value;
	}

	@Override
	public void transfer(double value, Account destinationAccount) {
		this.withdraw(value);
		destinationAccount.deposit(value);
	}
	
	protected void extractInformation() {
		System.out.println(String.format("Titular: %s", client.getName()));
		System.out.println(String.format("Agency: %d", agency));
		System.out.println(String.format("Number: %d", number));
		System.out.println(String.format("Balance: %.2f", balance));
	}

	public int getAgency() {
		return agency;
	}

	public int getNumber() {
		return number;
	}

	public double getBalance() {
		return balance;
	}
}
