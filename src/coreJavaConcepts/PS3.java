package coreJavaConcepts;

public class PS3 {
	
	int a; //class variable
	
	public PS3(int a) {  //parameterized constructor -- instance variable - a
		this.a=a;
		
		
	}
	
	public int Multiply() { //this won't be executed in parent class without parameterized constructor
		a=a*1;
		return a;
		
	}



}
