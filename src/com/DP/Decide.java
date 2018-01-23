package com.DP;

public class Decide {

public void invokeMyAccount( Account acc)
{
	
	if (acc instanceof CA) {
		//acc.withdraw();
		CA ca = (CA)acc;
		ca.withdraw();
		ca.overdraft();
		
	}else if (acc instanceof SA) {
		//acc.withdraw();
		SA sa = (SA)acc;
		sa.withdraw();
		
	}

	
	
	
}
}
