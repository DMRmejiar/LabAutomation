package org.fabricaescuela.questions;
import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Visibility;
import org.fabricaescuela.userinterfaces.Simulation;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SimulationResultIsCompleted implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Simulation.SIMULATION_DONE_TEXT).viewedBy(actor).asBoolean();
    }

    public static SimulationResultIsCompleted onThePage() {
        return new SimulationResultIsCompleted();
    }
}