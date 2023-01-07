package entities;

public class Account {

		private int accNumber;
		private String holder;
		private double balance;
		
		public Account(int accNumber, String holder, double initialDeposit) {
			
			this.accNumber = accNumber;
			this.holder = holder;
			addMoney(initialDeposit);
		}
		
		public Account(int accNumber, String holder) {
			
			this.accNumber = accNumber;
			this.holder = holder;
			
		}

		public int getAccNumber() {
			
			return accNumber;
			
		}

		public String getHolder() {
			
			return holder;
			
		}

		public void setHolder(String holder) {
			
			this.holder = holder;
			
		}
		
		public double getBalance() {
			
			return balance;
			
		}

		public void addMoney(double deposit) {
			
			balance += deposit;
			
		}
		
		public void removeMoney(double deposit) {
			
			balance = (balance - deposit) - 5.00;
			
		}

		public String toString() {
			
			return "Account "
					+ accNumber 
					+ ", Holder: " 
					+ holder
					+ ", Balance: $ "
					+ String.format("%.2f", balance);
			
		}
		
		
}
