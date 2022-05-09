package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.RegisterPage;

public class Register {
	
	@Test
	public void reg() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		  driver.manage().window().maximize();
		  RegisterPage rp=new RegisterPage(driver);
		  rp.firstname().sendKeys("Nivruti");
		  rp.lastname().sendKeys("Rode");
		  driver.close();
		  
	}

}
