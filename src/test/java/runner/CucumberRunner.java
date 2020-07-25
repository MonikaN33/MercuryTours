package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = !true,
	features = {"src/test/java/feature/login.feature"},
	glue = {"stepdefinition"},
	snippets = SnippetType.CAMELCASE,
	monochrome = true,
	format = {"pretty", "html:target/Destination"}

		)		




public class CucumberRunner extends AbstractTestNGCucumberTests
{

	
}
	