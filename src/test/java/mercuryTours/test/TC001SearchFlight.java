package mercuryTours.test;

import org.testng.annotations.Test;

import base.Base;
import pages.Login;


public class TC001SearchFlight extends Base
{

	@Test
	public void fillDetails()
	{
		 new Login()
		.enterUserName("abc@we")
		.password("password")
		.clickSignIn()
		.verifyPage()
		.tripType()
		.passengerCount(2)
		.departure("London")
		.fromMonth(4)
		.fromDay("5")
		.arrival("Acapulco")
		.toMonth(5)
		.toDay("5")
		.preference()
		.airLine()
		.nextPage()
		.signOff();
	}
}
