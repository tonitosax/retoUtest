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
    public static final Target LANGUAGE_FIELD= Target.the("When do you write your language")
            .located(By.xpath("//input[@type='search']"));
    public static final Target BUTTON_NEXTLOCATION= Target.the("When do you click to go to page Next: Location")
            .located(By.xpath("//a[@class='btn btn-blue']"));


    //SECOND FORM
    public static final Target INPUT_CITY= Target.the("When do you write your city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP= Target.the("When do you write your zip code")
            .located(By.id("zip"));
    public static final Target COUNTRY_SELECT= Target.the("When do you click on country field")
            .located(By.name("countryId"));
    public static final Target INPUT_COUNTRY= Target.the("When do you write your country")
            .located(By.xpath("//input[@placeholder='Select a country']"));
    public static final Target BUTTON_NEXTDEVICES= Target.the("When do you click to go to page Next: Devices")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));

    //THIRD FORM
    public static final Target INPUT_COMPUTER= Target.the("When do you click the OS of your computer")
            .located(By.name("osId"));
    public static final Target OS_TYPE= Target.the("When do you select the OS of your computer")
            .located(By.xpath("//div[contains(text(), 'Windows')]"));
    public static final Target INPUT_OSVERSION= Target.the("When do you click the OS version of your computer")
            .located(By.name("osVersionId"));
    public static final Target OS_VERSION= Target.the("When do you select the OS version of your computer")
            .located(By.xpath("//div[(text()='10')]"));
    public static final Target INPUT_OSLANGUAGE= Target.the("When do you select the OS language of your computer")
            .located(By.name("osLanguageId"));
    public static final Target OS_LANGUAGE= Target.the("When do you select the OS version of your computer")
            .located(By.xpath("//div[(text()='Spanish')]"));
    public static final Target SELECT_DEVICE= Target.the("When do you click to select your device")
            .located(By.name("handsetMakerId"));
    public static final Target PHONE_BRAND= Target.the("When do you select the phone brand")
            .located(By.xpath("//input[@placeholder='Select Brand']"));
    public static final Target SELECT_MODELDEVICE= Target.the("When do you click to select your model device")
            .located(By.name("handsetModelId"));
    public static final Target PHONE_MODEL= Target.the("When do you select the phone brand")
            .located(By.xpath("//input[@placeholder='Select a Model']"));
    public static final Target SELECT_OSDEVICE= Target.the("When do you click to select your device")
            .located(By.name("handsetOSId"));
    public static final Target PHONE_OS= Target.the("When do you select the OS brand")
            .located(By.xpath("//div[(text()='Android 10')]"));
    public static final Target BUTTON_LASTASTEP= Target.the("When do you click to go to page Last step")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));


    //FOURT FORM
    public static final Target INPUT_PASSWORD= Target.the("When do you write your password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRMPASSWORD= Target.the("When do you rewrite your password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_STAYINFORMED= Target.the("When do you mark the checkbox STAY INFORMED")
            .located(By.name("newsletterOptIn"));
    public static final Target CHECK_TERMSOFUSE= Target.the("When do you mark the checkbox Term of us")
            .located(By.id("termOfUse"));
    public static final Target CHECK_PRIVACYSECURITYPOLICY= Target.the("When do you mark the checkbox Privacy & Security Policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETESETUP= Target.the("When do you click to go to complete setup")
            .located(By.id("laddaBtn"));
}
