package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinuesSimulation implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.CONTINUAR_BTN)
        );
    }
    public static ContinuesSimulation makeInformation(){
        return instrumented(ContinuesSimulation.class);
    }
}
