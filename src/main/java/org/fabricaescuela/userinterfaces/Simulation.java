package org.fabricaescuela.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Simulation {
    public static final Target CONTINUAR_BTN = Target.the("continue simulation button")
            .locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target SI_CHECK = Target.the("yes option")
            .locatedBy("//*[@id=\"opcion-si\"]");
    public static final Target MONTO_INPUT = Target.the("loan amount input")
            .locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target MESES_INPUT = Target.the("loan months input")
            .locatedBy("//*[@id=\"valor-plazo\"]");
    public static final Target NACIMIENTO_INPUT = Target.the("birth date input")
            .locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-solicitud-monto/section/form/mat-form-field[3]/div/div[1]/div");
    public static final Target BIRTH_YEAR_2000 = Target.the("2000 option")
            .locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[5]/td[3]/div[1]");
    public static final Target BIRTH_MONTH_MAY= Target.the("may option")
            .locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target BIRTH_DAY_29 = Target.the("29 option")
            .locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[6]/td[2]/div[1]");
    public static final Target SIMULAR_BTN = Target.the("simulate loan button")
            .locatedBy("//*[@id=\"boton-simular\"]");
    public static final Target INFORMACION_LEGAL_TEXT = Target.the("informacion legal text")
            .locatedBy("//*[@id=\"mat-expansion-panel-header-2\"]");
}


