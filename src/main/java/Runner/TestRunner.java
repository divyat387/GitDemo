package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Divya\\Work\\workspace\\SeleniumPractice\\src\\main\\java\\Features",//path of feature files 
	glue= {"stepDefinitions"},//path of step definition files
	format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_output/cucumber.xml"},//to generate different types of reporting
	dryRun= true,//to check matching between feature file and stepdef file
	strict=true//check if any step is not defined in step definition file
	)

public class TestRunner {

}
