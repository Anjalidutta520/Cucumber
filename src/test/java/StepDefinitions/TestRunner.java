package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
        glue={"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/HtmlReport.html", "json:target/JSONReport.json", "junit:target/junitReport.xml"},
        tags = "@SmokeTest")
public class TestRunner {

}
