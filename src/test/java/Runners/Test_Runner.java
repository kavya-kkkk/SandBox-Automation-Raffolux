/**
 * 
 */
package Runners;

/**
 * @author hp
 *
 */


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@run",
features = "src\\test\\resources\\Features\\PointsStore.feature", 
glue = { "stepdefinitions" }, 
monochrome = true, 
plugin = {"pretty", "junit:JunitReports/reports.xml", "html:html-output/cucumber.html", "json:json_output/cucumber.json"},
dryRun = true
		)
public class Test_Runner {

}
