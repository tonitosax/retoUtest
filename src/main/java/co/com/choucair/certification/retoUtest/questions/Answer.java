package co.com.choucair.certification.retoUtest.questions;

import co.com.choucair.certification.retoUtest.model.UtestData;
import static co.com.choucair.certification.retoUtest.userinterface.WelcomePage.WELCOME_MESSAGE;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;


public class Answer implements Question<Boolean> {


    List<UtestData> utestData;

    public Answer(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Answer toThe(List<UtestData> utestData){
        return  new Answer(utestData);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String message= Text.of(WELCOME_MESSAGE).viewedBy(actor).asString();
        if (utestData.get(0).strWelcomeMessage.equals(message)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
