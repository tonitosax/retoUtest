package co.com.choucair.certification.retoUtest.tasks;

import co.com.choucair.certification.retoUtest.userinterface.UtestForms;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Fill implements Task {

    public String strName;
    public String strLastName;
    public String strEmail;
    public String strZip;
    public String strPassword;

    public Fill(String strName, String strLastName, String strEmail, String strZip, String strPassword){
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strZip = strZip;
        this.strPassword = strPassword;
    }

    public static Fill theform(String strName, String strLastName, String strEmail, String strZip, String strPassword){
        return Tasks.instrumented(Fill.class, strName, strLastName, strEmail, strZip, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(UtestForms.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestForms.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestForms.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("February").from(UtestForms.LIST_MONTH),
                SelectFromOptions.byVisibleText("8").from(UtestForms.LIST_DAY),
                SelectFromOptions.byVisibleText("1991").from(UtestForms.LIST_YEAR),
                Click.on(UtestForms.BUTTON_NL),

                //SECOND FORM
                Enter.theValue(strZip).into(UtestForms.ZIP),
                Click.on(UtestForms.BUTTON_ND),

                //THIRD FORM
                Click.on(UtestForms.BUTTON_LS),

                //FOURTH FORM
                Enter.theValue(strPassword).into(UtestForms.INPUT_PASSWORD),
                Enter.theValue(strPassword).into(UtestForms.INPUT_CONFIRMPASSWORD),
                Click.on(UtestForms.CHECK_TOU),
                Click.on(UtestForms.CHECK_PSP),
                Click.on(UtestForms.BUTTON_CS)
        );

        try {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {

        }



    }
}
