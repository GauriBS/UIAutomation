package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example3 {
	
	
	
	@Test (groups = {"Smoke"})
	public void WebAPILoan() {
		System.out.println("Web Loan");
	}
	
	@BeforeTest
	public void BeforeTst() {
		System.out.println("BeforeTest - I will execute first in that particular <test>");
	}
	
	
	@Test 
	public void RestAPILoan() {
		System.out.println("Rest Loan");
	}

}
