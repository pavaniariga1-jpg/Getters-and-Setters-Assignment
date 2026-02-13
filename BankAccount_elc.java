package package_example;

public class BankAccount2 {
		public static void main(String[] args) {
			BankAccount obj=new BankAccount();
			obj.setHolderName("Pavani");
			obj.setaccountNumber(64321);
			obj.deposit(5000);
			obj.withdraw(2000);
			obj.withdraw(4000);
			System.out.println("Final Balance: "+obj.getbalance());
		}
	}
