package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Annotations extends GenericWrappers {

	/*@Parameters({ "browser", "username", "password" })
	@BeforeMethod()
	public void beforeMethod(String broswer,String username, String password) throws Exception
	{
		invokeApp(broswer, "http://leaftaps.com/control/main");
		
		//enter User_Name
		enterById("username", username);
		
		// enter password
		enterById("password", password);
		
		//click login button
		clickByClassName("decorativeSubmit");		
				
		// Click crmsfa link
		clickByXpath("//div[@class='crmsfa']//img");
	}*/
	
	
	@BeforeMethod()
	public void beforeMethod() throws Exception
	{
		invokeApp("chrome", "http://leaftaps.com/control/main");
		
		//enter User_Name
		enterById("username", "DemoSalesManager");
		
		// enter password
		enterById("password", "crmsfa");
		
		//click login button
		clickByClassName("decorativeSubmit");		
				
		// Click crmsfa link
		clickByXpath("//div[@class='crmsfa']//img");
	}
	
	
	
	
	
	@AfterMethod
	public void afterMethod() throws Exception
	{
		//Close the browser (Do not log out)
		closeBrowser();	
	}
	
	
	
}
