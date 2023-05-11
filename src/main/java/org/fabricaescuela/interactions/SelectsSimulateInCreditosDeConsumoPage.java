package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.CreditosConsumo;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectsSimulateInCreditosDeConsumoPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CreditosConsumo.SIMULAR_BTN)
        );
    }
    public static SelectsSimulateInCreditosDeConsumoPage makeInformation(){
        return instrumented(SelectsSimulateInCreditosDeConsumoPage.class);
    }
}
