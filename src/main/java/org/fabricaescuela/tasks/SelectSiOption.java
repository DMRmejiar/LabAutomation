package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSiOption implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.SI_CHECK)
        );
    }
    public static SelectSiOption makeInformation(){
        return instrumented(SelectSiOption.class);
    }
}
