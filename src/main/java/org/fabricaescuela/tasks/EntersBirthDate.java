package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Simulation;

public class EntersBirthDate implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Simulation.NACIMIENTO_INPUT),
                Click.on(Simulation.BIRTH_YEAR_2000),
                Click.on(Simulation.BIRTH_MONTH_MAY),
                Click.on(Simulation.BIRTH_DAY_29)
                );
    }

    public static EntersBirthDate makeInformation() {
        return Tasks.instrumented(EntersBirthDate.class);
    }
}