package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MenuPage {
WebDriver driver;

By checkout_first=By.xpath("//a[@id='wsb-button-00000000-0000-0000-0000-000451955160']//span[@class='button-content wsb-button-content'][contains(text(),'Check Out')]");

public MenuPage(WebDriver driver)
{
	
	this.driver=driver;
}

public void clickCheckout()
{
	driver.findElement(checkout_first);
}

}
