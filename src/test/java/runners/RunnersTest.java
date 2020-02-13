package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/CadastroGmail.feature",
		glue = "steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report-json"},
		tags = ("~@ignore"),
		snippets = SnippetType.CAMELCASE,
		monochrome = true,
		strict = false		
        )

public class RunnersTest {

}
