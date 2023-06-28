package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( //features= {".\\Feature\\"},
		features = { ".\\Feature\\Login.feature" }, 
		//{ ".\\Feature\\LoginDDT.feature" },
		 //features= {".\\Feature\\LoginDDTExcel.feature"},

		glue = "stepDefinitions", plugin = { "pretty", "html:reports/myreport.html",
				"json:reports/myreport.json", "rerun:target/rerun.txt" }, dryRun = false, monochrome = true, tags = "@sanity")

public class TestRunner {
 
}
