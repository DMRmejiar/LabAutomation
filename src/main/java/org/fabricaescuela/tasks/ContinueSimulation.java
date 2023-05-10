package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.CreditosConsumo;
import org.fabricaescuela.userinterfaces.Home;
import org.fabricaescuela.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ContinueSimulation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.CONTINUAR_BTN)
        );
    }
    public static ContinueSimulation makeInformation(){
        return instrumented(ContinueSimulation.class);
    }
}
