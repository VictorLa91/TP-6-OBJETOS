package org.example.ejercicio1;

import org.example.ejercicio1.AdapterMotorElectrico;
import org.example.ejercicio1.MotorComun;
import org.example.ejercicio1.MotorEconomico;
import org.example.ejercicio1.MotorElectrico;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        var motorComun = new MotorComun();
        var motorEconomico= new MotorEconomico();

        motorEconomico.arrancar();
        motorComun.arrancar();

        var motorElectrico= new MotorElectrico();
        var adapterMotorElectrico = new AdapterMotorElectrico(motorElectrico);

        adapterMotorElectrico.arrancar();
    }
}