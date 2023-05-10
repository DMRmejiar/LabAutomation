package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.fabricaescuela.userinterfaces.Simulation;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterLoanAmount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int maxAmount=500000000, minAmount=1000000;
        int loanAmount = new Random().nextInt(maxAmount - minAmount) + minAmount;
        actor.attemptsTo(
                Enter.theValue(String.valueOf(loanAmount)).into(Simulation.MONTO_INPUT)
        );
    }
    public static EnterLoanAmount makeInformation(){
        return instrumented(EnterLoanAmount.class);
    }
}

