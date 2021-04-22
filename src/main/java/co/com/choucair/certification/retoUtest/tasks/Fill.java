package co.com.choucair.certification.retoUtest.tasks;
import co.com.choucair.certification.retoUtest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_NAME;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_LASTNAME;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_EMAIL;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.LIST_MONTH;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.LIST_DAY;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.LIST_YEAR;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.LANGUAGE_FIELD;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.BUTTON_NEXTLOCATION;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.COUNTRY_SELECT;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_COUNTRY;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_ZIP;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.BUTTON_NEXTDEVICES;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_COMPUTER;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.OS_VERSION;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.SELECT_MODELDEVICE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.OS_TYPE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_OSVERSION;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_OSLANGUAGE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.OS_LANGUAGE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.SELECT_DEVICE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.PHONE_BRAND;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.PHONE_MODEL;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.SELECT_OSDEVICE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.PHONE_OS;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.BUTTON_LASTASTEP;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_PASSWORD;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.INPUT_CONFIRMPASSWORD;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.CHECK_STAYINFORMED;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.CHECK_TERMSOFUSE;
import static co.com.choucair.certification.retoUtest.userinterface.UtestForms.CHECK_PRIVACYSECURITYPOLICY;



public class Fill implements Task {

    List<UtestData> utestData;

    public Fill(List<UtestData> utestData) {
        this.utestData = utestData;
    }

    public static Fill theform(List<UtestData> utestData){
        return Tasks.instrumented(Fill.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(utestData.get(0).getStrName()).into(INPUT_NAME),
                Enter.theValue(utestData.get(0).getStrLastName()).into(INPUT_LASTNAME),
                Enter.theValue(utestData.get(0).getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText("February").from(LIST_MONTH),
                SelectFromOptions.byVisibleText("8").from(LIST_DAY),
                SelectFromOptions.byVisibleText("1991").from(LIST_YEAR),
                Enter.theValue(utestData.get(0).getStrLanguage()).into(LANGUAGE_FIELD).thenHit(Keys.ENTER),
                Click.on(BUTTON_NEXTLOCATION),

                //SECOND FORM
                //Enter.theValue(utestData.get(0).getStrCity()).into(INPUT_CITY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Click.on(COUNTRY_SELECT),
                Enter.theValue(utestData.get(0).getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Enter.theValue(utestData.get(0).getStrZip()).into(INPUT_ZIP),
                Click.on(BUTTON_NEXTDEVICES),

                //THIRD FORM
                Click.on(INPUT_COMPUTER),
                Click.on(OS_TYPE),
                Click.on(INPUT_OSVERSION),
                Click.on(OS_VERSION),
                Click.on(INPUT_OSLANGUAGE),
                Click.on(OS_LANGUAGE),
                Click.on(SELECT_DEVICE),
                Enter.theValue("Xiaomi").into(PHONE_BRAND).thenHit(Keys.ENTER),
                Click.on(SELECT_MODELDEVICE),
                Enter.theValue("Redmi Note 6 Pro").into(PHONE_MODEL).thenHit(Keys.ENTER),
                Click.on(SELECT_OSDEVICE),
                Click.on(PHONE_OS),
                Click.on(BUTTON_LASTASTEP),

                //FOURTH FORM
                Enter.theValue(utestData.get(0).strPassword).into(INPUT_PASSWORD),
                Enter.theValue(utestData.get(0).strPassword).into(INPUT_CONFIRMPASSWORD),
                Click.on(CHECK_STAYINFORMED),
                Click.on(CHECK_TERMSOFUSE),
                Click.on(CHECK_PRIVACYSECURITYPOLICY)
                //Click.on(BUTTON_COMPLETESETUP)

        );

        /*try {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } finally {

        }*/



    }
}
