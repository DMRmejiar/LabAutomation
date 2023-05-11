package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsYesOption implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.SI_CHECK)
        );
    }
    public static SelectsYesOption makeInformation(){
        return instrumented(SelectsYesOption.class);
    }
}
