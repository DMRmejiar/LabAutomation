package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Simulation {
    public static final Target CONTINUAR_BTN = Target.the("Boton de continuar")
            .locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target SI_CHECK = Target.the("Opción sí")
            .locatedBy("//*[@id=\"opcion-si\"]");
    public static final Target MONTO_INPUT = Target.the("Input de monto de prestamo")
            .locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target MESES_INPUT = Target.the("Input de meses de prestamo")
            .locatedBy("//*[@id=\"valor-plazo\"]");

}
