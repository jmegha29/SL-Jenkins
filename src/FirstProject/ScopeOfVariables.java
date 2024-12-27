package FirstProject;

public class ScopeOfVariables {
	
	int i = 10; //instance variable
	static String s = "variable";//static variable
	
	public void integer() {
		
	int	a= 20; // local variable
	System.out.println(a+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScopeOfVariables Scope = new ScopeOfVariables();//object creation
		System.out.println(Scope.i);
		System.out.println(s);
		Scope.integer(); //method calling
		
		
	}

}
