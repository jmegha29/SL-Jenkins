package FirstProject;

public class Bank {

	int accountbal = 500;
	public int getBalance(int ID) {
		
		if (ID ==1234) {
		System.out.println(accountbal);	
		}
		else {
			System.out.println("No funds");
		}
		return accountbal;		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b = new Bank();
		b.getBalance(1234);
		b.getBalance(123);
	}
	}


