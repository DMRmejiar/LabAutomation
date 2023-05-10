package org.fabricaescuela.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class Home {
    public static final Target CERRAR_BTN = Target.the("cerrarBtn")
            .locatedBy("//*[@id=\"closeModalBtn\"]");

    public static final Target SABER_MAS_BTN = Target.the("saberMasBtn")
            .locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
}
