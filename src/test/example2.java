package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class example2 {

	@Test (groups = {"Smoke"})
	public void SBILoan() {
		System.out.println("SBI Bank");
	}
	
	@Test
	public void ICICILoan() {
		System.out.println("ICICI Bank");
	}
	
	@Test
	public void IDFCLoan() {
		System.out.println("IDFC Bank");
	}
	
	@AfterTest
	public void Aftertst() {
		System.out.println("AfterTest - I will execute last in that particular <test>");
	}
	

}
