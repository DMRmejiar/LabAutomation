package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import org.fabricaescuela.userinterfaces.Simulation;

import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterMonthsNumber implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int maxMonths=84, minMonths=48;
        int loanMonths = new Random().nextInt(maxMonths - minMonths) + minMonths;
        actor.attemptsTo(
                Enter.theValue(String.valueOf(loanMonths)).into(Simulation.MESES_INPUT)
        );
    }
    public static EnterMonthsNumber makeInformation(){
        return instrumented(EnterMonthsNumber.class);
    }
}
