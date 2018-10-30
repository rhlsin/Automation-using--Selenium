package ObjectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rediff_login
{
	WebDriver driver;
	public  rediff_login(WebDriver driver)
	{
		this.driver=driver;

	}
	
	By username= By.xpath(".//*[@id='login1']") ;
	By password= By.name("passwd");
	By go=By.name("proceed"); 
	By home=By.linkText("Home"); 

	
	public WebElement Email()
	{
		return driver.findElement(username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	
	public WebElement Go()
	{
		return driver.findElement(go);
	}
	
	public WebElement Home()
	{
		return driver.findElement(home);
	}


}
