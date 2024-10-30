package Pagepkage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class zoukpage {
	
WebDriver driver;

	@FindBy(xpath="//*[@id=\"shopify-section-sections--23233771241768__header\"]/height-observer/x-header/nav[2]/a[1]/svg")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"input-template--23233776550184__main--customeremail\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"input-template--23233776550184__main--customerpassword\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"customer_login\"]/button")
	WebElement login;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--23233771241768__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary")
	public static WebElement bag;
	
	@FindBy(xpath="//*[@id=\"product-list-template--23233776189736__main\"]/product-card[1]/div[3]/div/div/a")
	public static WebElement bag1;
	
	@FindBy(xpath="//*[@id=\"product-form-8853093515560-template--23233778024744__main\"]/div/buy-buttons/button")
	WebElement addtocart;
	
	@FindBy(xpath="//*[@id=\"shopify-section-sections--23233771241768__header\"]/height-observer/x-header/nav[2]/a[2]/svg")
	WebElement cart;
	
	@FindBy(xpath="//*[@id=\"checkout2\"]")
	WebElement checkout;
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement fullname;
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement aemail;
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	@FindBy(xpath="//*[@id=\"zip\"]")
	WebElement pincode;
	@FindBy(xpath="//*[@id=\"flo_address_submit\"]")
	WebElement save;
	@FindBy(xpath="//*[@id=\"flo_address__btn\"]")
	WebElement payment;
	
	
	public zoukpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
public void clicklogin()
{
loginbutton.click();

}

public void setvalues(String Email,String Password)
{
email.sendKeys(Email);	
password.sendKeys(Password);
login.click();
}
public void select() 
{
bag.click();
bag1.click();
	
}
public void cart() 
{
cart.click();
	
}

public void checkoutclick() 
{
	checkout.click();
	
}
public void senddetails(String fname,String email,String add,String pin)
{
	fullname.sendKeys(fname);
	aemail.sendKeys(email);	
	address.sendKeys(add);
	pincode.sendKeys(pin);
	payment.click();

}

}
