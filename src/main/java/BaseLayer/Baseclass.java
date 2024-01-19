package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	
	protected static  WebDriver driver;
	
	
	public static void intialize()
	{
		
		//System.setProperty("webdriver.chrome.driver","/Users/dhananjay/eclipse-workspace/Guru99/Allchromepath/chromedriver-mac-x64 2/chromedriver");
		
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)).pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	}

}



