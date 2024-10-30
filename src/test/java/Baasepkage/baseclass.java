package Baasepkage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class baseclass {

	public WebDriver driver;

	@BeforeClass
	public void precondition()
	{
		driver= new ChromeDriver();
		driver.get("https://zouk.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
	}
}
