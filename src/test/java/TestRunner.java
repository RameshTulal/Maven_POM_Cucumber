import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {".//Features"},
        glue = "stepDefinitions",
        dryRun = false,
        tags = "@Execute",
        plugin = {"pretty", "json:Reports/cucumber.json"})

public class TestRunner {

}