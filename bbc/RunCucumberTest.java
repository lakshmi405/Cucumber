package bbc;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features=".", format={"html:target/cucumber"},tags = "@smoke")

public class RunCucumberTest {
}
