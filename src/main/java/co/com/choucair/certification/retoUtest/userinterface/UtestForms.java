package co.com.choucair.certification.retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestForms {

    public static final Target INPUT_NAME= Target.the("When do you write your name")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME= Target.the("When do you write your lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL= Target.the("When do you write your email")
            .located(By.id("email"));

    public static final Target LIST_MONTH= Target.the("When do you select your birth month")
            .located(By.id("birthMonth"));

    public static final Target LIST_DAY= Target.the("When do you select your birthday")
            .located(By.id("birthDay"));

    public static final Target LIST_YEAR= Target.the("When do you select your birth year")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NL= Target.the("When do you click to go to page Next: Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));

    //SECOND FORM
    public static final Target ZIP= Target.the("When do you write your zip code")
            .located(By.id("zip"));

    public static final Target BUTTON_ND= Target.the("When do you click to go to page Next: Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //THIRD FORM
    public static final Target BUTTON_LS= Target.the("When do you click to go to page Last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //FOURT FORM
    public static final Target INPUT_PASSWORD= Target.the("When do you write your password")
            .located(By.id("password"));

    public static final Target INPUT_CONFIRMPASSWORD= Target.the("When do you rewrite your password")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_TOU= Target.the("When do you mark the checkbox Term of us")
            .located(By.id("termOfUse"));

    public static final Target CHECK_PSP= Target.the("When do you mark the checkbox Privacy & Security Policy")
            .located(By.id("privacySetting"));

    public static final Target BUTTON_CS= Target.the("When do you click to go to complete setup")
            .located(By.id("laddaBtn"));
}
