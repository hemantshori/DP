package com.DP;

public class ImplementAcct {

	public static void main(String[] args) {
		
//		
//		Account a1 = new SA();
//		a1.withdraw();
//		
//		Account a2 = new CA();
//		a2.withdraw();
		
		
		//dynamic poly
		
		Decide d = new Decide();
		d.invokeMyAccount(new CA());
		d.invokeMyAccount(new SA());

		
		
		
	}

}
