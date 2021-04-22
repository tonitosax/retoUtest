package co.com.choucair.certification.retoUtest.stepdefinitions;

import co.com.choucair.certification.retoUtest.model.UtestData;
import co.com.choucair.certification.retoUtest.questions.Answer;
import co.com.choucair.certification.retoUtest.tasks.Fill;
import co.com.choucair.certification.retoUtest.tasks.JoinToday;
import co.com.choucair.certification.retoUtest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class retoUtestStepDefinitions {

    @Before
    public void setSage () {
        setTheStage(new OnlineCast());}

    @Given("^than Brandon wants to login in Utest page$")
    public void thanBrandonWantsToLoginInUtestPage() throws Exception {
        theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^he fill all the forms$")
    public void heFillAllTheForms(List<UtestData> utestData) throws Exception {
      theActorInTheSpotlight().attemptsTo(Fill.theform(utestData));
    }

    @Then("^He can view the Utest welcome page$")
    public void heCanViewTheUtestWelcomePage(List<UtestData> utestData) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData)));
    }

}
