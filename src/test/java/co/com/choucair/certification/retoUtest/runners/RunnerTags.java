package co.com.choucair.certification.retoUtest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/retoUtest.feature",
        tags = "@scenario1",
        glue = "co.com.choucair.certification.retoUtest.stepdefinitions",
        snippets = SnippetType.CAMELCASE )

public class RunnerTags {
}