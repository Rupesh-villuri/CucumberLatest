package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/resources/AppFeatures"},
		glue= {"stepdefinitions"},
		plugin= {"pretty",
				"json:target/MyReports/report.json",
				"junit:target/MyReports/report.xml "
				
		},
		monochrome=true,
		dryRun=true,
		strict=true
		
		)

public class AmazonTest {
	
	


}
