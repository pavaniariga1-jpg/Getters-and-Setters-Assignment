package package_example;

public class BankAccount {
		private String HolderName;
		private int accountNumber;
		private double balance;
		//getter and setter for HolderName
		public void setHolderName(String HolderName) {
			this.HolderName=HolderName;
		}
		public String getHolderName() {
			return HolderName;
			
		}
		//getter and setter for accountNumber
		public void setaccountNumber(int accountNumber) {
			this.accountNumber=accountNumber;
		}
		public int getaccountNumber() {
			return accountNumber;
		}
		//getter and setter for balance
		public double getbalance() {
			return balance;
		}
		//deposit method
		public void deposit(double amount) {
			if(amount>0) {
				balance+=amount;
				System.out.println("Rs"+amount+"Deposited Successfully");
			}else {
				System.out.println("Invalid deposit Amount");
			}
		}
		//withdraw method
		public void withdraw(double amount) {
			if(amount<=0) {
				System.out.println("Invalid withdraw amount");
			}else if(amount>balance) {
				System.out.println("Insufficient Balance");
			}else {
				balance-=amount;
				System.out.println("Rs"+amount+"Withdrawn Successfully");
			}
		}
	}
	
