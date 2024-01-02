package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class example5 {
	
	@Test
	public void Country() {
		System.out.println("Country - India");
	}
	
	@Parameters({"URL" , "APIkey"})
	@Test 
	public void State(String urlname , String keyvalue) {
		System.out.println("State - Kerala");
		System.out.println(urlname);
		System.out.println(keyvalue);
	}
	

	@Test(dataProvider="getData") //calling @DataProvider
	public void District(String user, String pwd) {
		System.out.println("District - TVM");
		System.out.println(user);
		System.out.println(pwd);
	}
	
	
	@DataProvider  // Used for Parameterization --> for passing multiple data for a single test -- > Here 3 comb of username and pwd is passed
	public Object[][] getData() {
		Object [][] data = new Object[3][2];
		
		//first comb
		data[0][0] = "firstusername";
		data[0][1] ="firstpassword";
		
		//second comb
		data[1][0] = "secondusername";
		data[1][1] ="secondpassword";
		
		//third comb
		data[2][0] = "thirdusername";
		data[2][1] ="thirdpassword";
				
		return data;
		
	}
	
	

}
