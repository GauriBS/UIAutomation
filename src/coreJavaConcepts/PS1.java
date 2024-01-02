package coreJavaConcepts;

import org.testng.annotations.Test;

public class PS1 extends PS{
	
	@Test
	
	public void child() {
		doThis();
		
		PS2 p = new PS2(3);
		//int a=3;
		System.out.println(p.Increment());
		System.out.println(p.Multiply());
		
		
		
		
	}

}
