import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumTestNgTest {
  WebDriver driver;
@BeforeMethod
  public void beforeMethod() {
	  System.out.println("hello java ");
  }

 

  @Test
  public void f() {
	  	//Setting up the chrome driver exe, the second argument is the location where you have kept the driver in your system
	  	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\mukun\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	  	 
	  	//Setting the driver to chrome driver
	  	  ChromeDriver driver = new ChromeDriver();
	  	  String url = "https://www.google.com";
	  	  driver.get(url);
	  	  //Capturing the title and validating if expected is equal to actual
	  	  String expectedTitle = "Google";
	  	  String actualTitle = driver.getTitle();
	  	  AssertJUnit.assertEquals(actualTitle, expectedTitle);
	    }
  @AfterMethod
  public void afterMethod() {
	  System.out.println("hi java ");
	 
	driver.close();
	  
  }

 
  }

