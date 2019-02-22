package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	WebDriver driver;
	
	@BeforeMethod
	public void  setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Test
	// This code is pushed by Manohar
	public void test()
	{
		driver.get("http://www.freecrm.com/");
		System.out.println(driver.getTitle());
	}

	@AfterMethod
	
	public void teardown()
	{
		driver.close();
	}
}
