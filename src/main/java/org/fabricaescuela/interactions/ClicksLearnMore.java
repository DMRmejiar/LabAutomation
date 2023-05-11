package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ClicksLearnMore implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.CERRAR_BTN),
                Click.on(Home.SABER_MAS_BTN)
        );
    }
    public static ClicksLearnMore makeInformation(){
        return instrumented(ClicksLearnMore.class);
    }
}
