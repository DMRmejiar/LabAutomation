package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Simulation {
    public static final Target CONTINUAR_BTN = Target.the("simularBtn")
            .locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target SI_CHECK = Target.the("simularBtn")
            .locatedBy("//*[@id=\"opcion-si\"]");

}
