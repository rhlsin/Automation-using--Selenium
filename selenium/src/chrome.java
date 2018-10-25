import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class chrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://selenium//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("http://google.com");
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys(new String[] {"[UserName]"});
		driver.findElement(By.name("pass")).sendKeys(new String[] {"-[Yourpassword]"});
		driver.findElement(By.id("loginbutton")).click();
		driver.findElement(By.xpath ("//div[@id='u_1n_2']//input[@placeholder='Search']")).sendKeys(new String[] {"Name"});
		driver.findElement(By.xpath("//form[@action='/search/web/direct_search.php']//button[@value='1']")).click();
		driver.findElement(By.xpath("//a[@id='u_48_7']")).click();
		driver.findElement(By.xpath("//ul[@class='_54nf']")).click();
		driver.findElement(By.xpath("//textarea[@id='u_5h_4']")).sendKeys(new String[] {"hello"});
		driver.findElement(By.xpath("//button[contains(text(),'Send')]"));

		//driver.findElement(By.cssSelector("//div[@class='_52eh _5bcu']")).click();
		//driver.findElement(By.xpath("//div[@class='_552h']")).sendKeys(new String[] {"hello"});
		//driver.findElement(By.xpath("//a[@class='_6gb _6wm4 _6987']")).click();
		
		

		
				  	
		  		

		

		
		



		

		

	}

}
