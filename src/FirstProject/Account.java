package FirstProject;
public class Account {
	
	static int balance = 2000;
	static int amount = 1500;
	static int minbal = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (amount<0 || (amount>balance)|| ((balance-amount)>minbal)) {
			System.out.println("Withdrawl failed");	
			}

		else {
	
			balance -=amount;
			System.out.println(balance);
		}
	}

}
