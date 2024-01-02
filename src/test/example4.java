package test;

import org.testng.annotations.Test;

public class example4 {
	
	@Test(timeOut = 4000) //TestNG will wait for 4000ms before throwing error
	public void CarLoan() {
		System.out.println("Car Loan");
	}
	
	@Test (groups = {"Smoke"} , dependsOnMethods = {"CarLoan"})  //BikeLoan() will be executed after CarLoan().
	public void BikeLoan() {
		System.out.println("Bike Loan");
	}
	

	@Test(enabled = false) //TestNG will exclude this test case
	public void Ploan() {
		System.out.println("Personal Loan");
	}
	
	

}
