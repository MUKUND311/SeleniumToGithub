

	
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
	import org.testng.annotations.Test;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.AfterMethod;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.*;
	 
	public class TestNG {
	 WebDriver driver ;
	 @Test
	public void f() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		 ChromeDriver driver = new ChromeDriver();
	     String baseUrl = "https://www.toolsqa.com/";
	       
	          
	         System.out.println("Launching Google Chrome browser"); 
	         
	         driver.get(baseUrl);
	         String testTitle = "Free QA Automation Tools For Everyone";
	         String originalTitle = driver.getTitle();
	         assertion.assertEquals(originalTitle, testTitle);
	  }
	 
	 @BeforeMethod
	 public void beforeMethod() {
	 System.out.println("Starting Test On Chrome Browser");
	 }
	 
	
	
	 
	 }
	
