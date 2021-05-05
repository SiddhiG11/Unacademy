package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature/angellogin_demo.feature",glue= {"stepDefinition"},plugin= {"pretty","junit:target/junit-report/logincucumber.xml"})

public class TestRunner {

}
