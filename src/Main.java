
public class Main {
	public static void main(String[] args) {
		Client cli = new Client();
		cli.setName("Murillo");
		
		Account ca = new CheckingAccount(cli);
		ca.deposit(100);
		
		Account sa = new SavingsAccount(cli);
		
		ca.transfer(100, sa);
		
		ca.printExtract();
		sa.printExtract();
	}
}
	
