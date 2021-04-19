package co.com.choucair.certification.retoUtest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayPage {
    public static final Target JOIN_TODAY_BT= Target.the("Button than show us the login forms")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));

}
