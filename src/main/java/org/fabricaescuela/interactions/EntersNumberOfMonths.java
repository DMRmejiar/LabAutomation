package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import org.fabricaescuela.userinterfaces.Simulation;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersNumberOfMonths implements Interaction {
    private Random rand = SecureRandom.getInstanceStrong();

    public EntersNumberOfMonths() throws NoSuchAlgorithmException {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int maxMonths=84, minMonths=48;
        int loanMonths = rand.nextInt(maxMonths - minMonths) + minMonths;
        actor.attemptsTo(
                Enter.theValue(String.valueOf(loanMonths)).into(Simulation.MESES_INPUT)
        );
    }
    public static EntersNumberOfMonths makeInformation(){
        return instrumented(EntersNumberOfMonths.class);
    }
}
