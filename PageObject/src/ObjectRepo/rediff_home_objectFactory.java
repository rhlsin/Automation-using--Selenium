package ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rediff_home_objectFactory
{
	WebDriver driver;
	public  rediff_home_objectFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	 
	/*By search = By.id("srchword");
	By submit = By.xpath("//input[@type='submit']");*/
	
	@FindBy(xpath=".//*[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement password;
	
	@FindBy(name="proceed")
	WebElement go;
	
	@FindBy(linkText="Home")
	WebElement home;
	
	

	public WebElement Email()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement Go()
	{
		return go;
	}
	
	public WebElement Home()
	{
		return home;
	}

		
	
	


}
