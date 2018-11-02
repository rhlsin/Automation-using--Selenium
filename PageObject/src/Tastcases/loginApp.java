package Tastcases;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ObjectRepo.rediff_home;
import ObjectRepo.rediff_home_objectFactory;

public class loginApp
{

	@Test
	public void Login()
	{
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		rediff_home_objectFactory rd =new rediff_home_objectFactory(driver);
		rd.Email().sendKeys("hello");    // email text hello
		rd.Password().sendKeys("hello"); // password column will be written hello. 
		rd.Go().click();
		rd.Home().click();
		
		rediff_home rh =new rediff_home(driver);
		rh.Search().sendKeys("refiff");
		rh.Submit().click();
		
		
	}
}

//rediff_home rh =new rediff_home(driver);
//rh.Search().sendKeys("refiff");
//rh.Submit().click();
  