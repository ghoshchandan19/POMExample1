import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest {

	@Test
	public void verifyAllElementsPresent() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.practiceselenium.com");
		HomePage homepage = new HomePage(driver);
		SoftAssert softAssertion = new SoftAssert();
		softAssertion.assertEquals(3, homepage.teacollection());

	}
}
