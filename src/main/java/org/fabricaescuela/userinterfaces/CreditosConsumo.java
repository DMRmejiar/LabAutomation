package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreditosConsumo {
    public static final Target SIMULAR_BTN = Target.the("simulate loan button")
            .locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[11]/div/div[2]/div/a[1]");


}
