package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	WebDriver driver;
	
	By email=By.xpath("//input[@id='email']");
	By name=By.xpath("//input[@id='name']");
	By address=By.xpath("//textarea[@id='address']");
	By cardNumber=By.xpath("//input[@id='card_number']");
	By cardName=By.xpath("//input[@id='cardholder_name']");
	By verificationCode=By.xpath("//input[@id='verification_code']");
	By cardType=By.xpath("//select[@id='card_type']");
	By placeOrder=By.xpath("//button[@class='btn btn-primary']");
	By cancel=By.xpath("//a[@class='btn']");
	
	public CheckoutPage(WebDriver driver)
	{
		
		this.driver=driver;
	}
	
	public void placeOrder()
	{
		driver.findElement(placeOrder).click();
	}
	

}
