 
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.github.dockerjava.api.model.Driver;

public class Started {
	
	WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void mybeforetest(){

		driver.get("https://www.google.com/");
		
	}
	
	@Test()
	public void mytest() throws InterruptedException{
		driver.navigate().to("https://www.selenium.dev/documentation/webdriver/elements/");
		
		driver.navigate().back();

		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.navigate().wait(100);
		 
		driver.quit();
	}

}
