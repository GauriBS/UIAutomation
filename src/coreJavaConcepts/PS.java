package coreJavaConcepts;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PS {
	
	@Test
	public void doThis() {
		System.out.println("I'm parent class");
	}

	@BeforeMethod
	public void BfMethod() {
		System.out.println("I'm always before method");
	}
	
	
	
}
