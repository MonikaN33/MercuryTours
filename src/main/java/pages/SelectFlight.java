package pages;

import base.Base;

public class SelectFlight extends Base
{
	public void signOff() 
	{
		driver.findElementByXPath("//a[text()='SIGN-OFF']").click();
		
	}

}
