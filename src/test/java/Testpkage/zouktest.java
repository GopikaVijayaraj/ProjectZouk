package Testpkage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import Baasepkage.baseclass;
import Pagepkage.zoukpage;
import Utilitypkage.exelutilities;


public class zouktest extends baseclass
{
	@Test
	public void titleverification() //title verification
	{
		String actual=driver.getTitle();
		String expect="Online Fashion & Lifestyle Store for Bags, Wallets & Footwear - Zouk";
		Assert.assertEquals(actual, expect,"title failed");
		
	}
	@Test
	public void testlogo()  //logo verification
    {
		WebElement logo=driver.findElement(By.xpath("/html/body/header/height-observer/x-header/a/img[2]"));
		Boolean logodisplay=logo.isDisplayed();
		if(logodisplay)
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("failed");
		}
    }
	
	@Test//login and cart
	public void testlogin() throws InterruptedException
	{
		Thread.sleep(3000);
	zoukpage p1=new zoukpage(driver);	
	p1.clicklogin();
	String xl="C:\\Users\\USER\\Desktop\\Book1.xlsx";
	String Sheet="Sheet3";
	int rowCount=exelutilities.getRowCount(xl, Sheet);
	for(int i=1;i<=rowCount;i++)
	{

		String Email=exelutilities.getCellValues(xl, Sheet, i, 0);
		System.out.println("username----"+Email);
		
		String Password=exelutilities.getCellValues(xl, Sheet, i, 1);
		System.out.println("password----"+Password);
		
		p1.setvalues(Email, Password);
		driver.navigate().refresh();
		driver.navigate().back();
	
	}	
	Thread.sleep(30);
	p1.bag.click();
	Thread.sleep(30);
	p1.bag1.click();
	Thread.sleep(30);
	p1.cart();
	Thread.sleep(30);
	p1.checkoutclick();
	Thread.sleep(30);
	p1.senddetails("Gopika","thazhathuparambilgopika2546@gmail.com","house no 1", "686662");
	
	}
	
}
