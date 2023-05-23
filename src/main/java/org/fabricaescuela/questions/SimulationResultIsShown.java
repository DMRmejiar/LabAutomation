package org.fabricaescuela.questions;
import net.serenitybdd.screenplay.Actor;
        import net.serenitybdd.screenplay.Question;
        import net.serenitybdd.screenplay.questions.Visibility;
import org.fabricaescuela.userinterfaces.Simulation;

public class SimulationResultIsShown implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Simulation.INFORMACION_LEGAL_TEXT).viewedBy(actor).asBoolean();
    }

    public static SimulationResultIsShown onThePage() {
        return new SimulationResultIsShown();
    }
}