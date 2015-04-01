package test.java;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(format="pretty", tags={"~@LowP, @HighP, @Negative"}, features = "src/test/resources", monochrome = true)
//tags for adding or removing test cases and ~ is not to add
public class TestRunner {

}
