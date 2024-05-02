package nz.ac.auckland.se754.democucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/features",
        glue={"nz.ac.auckland.se754.democucumber"},
        plugin={"pretty", "html:target/cucumber-reports.html"})
public class TestRunner {}

