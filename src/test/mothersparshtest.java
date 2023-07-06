package test;

import org.testng.annotations.Test;

import baseclass.bclass;
import pages.login;
import pages.loginpage;

public class mothersparshtest extends bclass{
	@Test
	public void test() 	
	{
		login ob =new login(driver);
		ob.ca();
		
		loginpage ob1= new loginpage(driver);
		ob1.log("adwaithac3@gmail.com","hello123@");
		ob1.signin();
			
		
		
}
}
