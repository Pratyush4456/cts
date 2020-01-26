package cognizant;

public class MethodOverloading {
	static String bank = "SBI";
	void print(int custId) {
		System.out.println("Only customer id and bank name");
		System.out.println(bank);
		System.out.println("The customer id is "+custId);
	}
	void print(int custId,String name) {
		System.out.println("Customer id,customer name and bank name");
		System.out.println(bank);
		System.out.println("The customer id is "+custId);
		System.out.println("The customer name is "+name);
	}


}
