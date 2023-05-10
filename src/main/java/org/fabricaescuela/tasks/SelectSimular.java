package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.CreditosConsumo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectSimular implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreditosConsumo.SIMULAR_BTN)
        );
    }
    public static SelectSimular makeInformation(){
        return instrumented(SelectSimular.class);
    }
}
