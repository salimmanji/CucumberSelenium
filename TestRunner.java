package my.domain.name.A4JPetStoreBDD;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
features={"feature"},
glue= {"steps"},
plugin = {"html:target/cucumber-html-repo" }
)

public class TestRunner {
	

		

}
