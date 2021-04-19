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
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class retoUtestStepDefinitions {

    @Before
    public void setSage () {
        OnStage.setTheStage(new OnlineCast());}

    @Given("^than Brandon wants to login in Utest page$")
    public void thanBrandonWantsToLoginInUtestPage() throws Exception {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thePage(), JoinToday.onThePage());
    }

    @When("^he fill all the forms$")
    public void heFillAllTheForms(List<UtestData> UtestData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Fill.theform(UtestData.get(0).getStrName(), UtestData.get(0).getStrLastName(),
                UtestData.get(0).getStrEmail(), UtestData.get(0).getStrZip(), UtestData.get(0).getStrPassword()));
    }

    @Then("^He can view the Utest welcome page$")
    public void heCanViewTheUtestWelcomePage(List<UtestData> UtestData) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UtestData.get(0).getStrWelcomeMessage())));
    }

}
