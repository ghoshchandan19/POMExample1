package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	WebDriver driver;
	By welcome_tab = By.xpath("//a[contains(text(),'Welcome')]");
	By passion_tab = By.xpath("//a[contains(text(),'Our Passion')]");
	By menu_tab = By.xpath("//a[contains(text(),'Menu')]");
	By checkout_tab = By.xpath("//a[contains(text(),'Check Out')]");
	By collection=By.xpath("//span[@class='button-content wsb-button-content']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickmenu()
	{
		driver.findElement(menu_tab).click();
	}
	
	public int teacollection()
	{
	List<WebElement> element=driver.findElements(collection);
	return element.size();
	}
}
