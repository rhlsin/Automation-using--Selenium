package DataDriven_Maven;

import org.testng.annotations.Test;
import java.io.IOException;

public class AppTest
{
	
	@Test
	public void OpeningBrowser() throws IOException
	{
		// This open the browser
		System.out.println("Executing Opening Browser");
		//Login1();
		
	}
	
	@Test(dependsOnMethods=("OpeningBrowser"))
	public void FlightBooking() throws IOException
	{
		//Login1();
		System.out.println("Executing Test");
	}

}



