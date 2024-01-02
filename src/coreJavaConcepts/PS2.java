package coreJavaConcepts;

public class PS2 extends PS3{
	
	int a; //class variable
	
	public PS2(int a) { //parameterized constructor -- instance variable - a
		super(a); //Invoking parent constructor PS3() so that we can access PS3 methods in PS1 using object of PS2.
		this.a=a;
		
		
		
	}
	
	public int Increment() { //this won't be executed in parent class without parameterized constructor
		a=a+1;
		return a;
		
	}


}
