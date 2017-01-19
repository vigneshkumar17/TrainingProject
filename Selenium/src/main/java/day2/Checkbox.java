package day2;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		//Setting property and launch
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		//getting url		
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		//maximise window
		driver.manage().window().maximize();
		
		//Timeout
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Checking status and printing 
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected());
		
		//Checking condition for checkbox selected or not
		if (!(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").isSelected())) {
			
			//if not selected, check the checkbox
			driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/input").click();			
		}
		//Collect all the checkbox in the page
		 List<WebElement> boxes=driver.findElementsByTagName("input");
		System.out.println(boxes.size());
		boxes.get(boxes.size()-2).click();
		
	}

}
