package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        glue= "stepdef",
        features = "src/test/resources/login.feature",
        plugin = "pretty"
)

public class CucumberTest {
}
