package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CucumberHooks
{

	@Before
	public void beforeScenario(Scenario sc)
	{
		String name = sc.getName();
		System.out.println("Scenario name : " + name);
	}
	
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("Is Failed : " + sc.isFailed());
		System.out.println("Status is " + sc.getStatus());
	}
}
