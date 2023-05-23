package org.fabricaescuela.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import org.fabricaescuela.userinterfaces.Simulation;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EntersLoanAmount implements Interaction {
    private Random rand = SecureRandom.getInstanceStrong();

    public EntersLoanAmount() throws NoSuchAlgorithmException {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        int maxAmount=500000000, minAmount=1000000;
        int loanAmount = rand.nextInt(maxAmount - minAmount) + minAmount;
        actor.attemptsTo(
                Enter.theValue(String.valueOf(loanAmount)).into(Simulation.MONTO_INPUT)
        );
    }
    public static EntersLoanAmount makeInformation(){
        return instrumented(EntersLoanAmount.class);
    }
}

