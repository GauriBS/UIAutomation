package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class example1 {

	@Test
	public void Demo() {
		System.out.println("Hello");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Hi");
		System.out.println("gIT pUSH");
		System.out.println("gIT pUSH");
		
	}
	
	@Test
	public void Demo3() {
		System.out.println("Hai");
	}
	
	@BeforeMethod
	public void BfMethod() {
		System.out.println("Before Method - I will execute before each test method in example 1 class");
	}
	@AfterMethod
	public void AfMethod() {
		System.out.println("AfterMethod - I will execute after each test method in example 1 class");
	}
	
	@BeforeSuite
	public void BFSuite() {
		System.out.println("BeforeSuite - I will execute first always");
	}
	@AfterSuite
	public void AFSuite() {
		System.out.println("AfterSuite - I will execute last always");
	}
	@BeforeClass
	public void BFClass() {
		System.out.println("BeforeClass - I will execute first in the class example 1.");
	}
	@AfterClass
	public void AFClass() {
		System.out.println("After Class - I will execute last in the class example 1.");
	}
}
