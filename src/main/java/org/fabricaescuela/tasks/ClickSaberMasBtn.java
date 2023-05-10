package org.fabricaescuela.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import org.fabricaescuela.userinterfaces.Home;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class ClickSaberMasBtn implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Home.CERRAR_BTN),
                Click.on(Home.SABER_MAS_BTN)
        );
    }
    public static ClickSaberMasBtn makeInformation(){
        return instrumented(ClickSaberMasBtn.class);
    }
}
