package org.example.ejercicio1;




public class MotorComun implements IActionMotors{
    @Override
    public void arrancar() {
        System.out.println("Arranco motor Comun");

    }
    @Override
    public void acelerar() {
        System.out.println("Acelera el motor Comun");
    }
    @Override
    public void apagar() {
        System.out.println("Se apago motor Comun");
    }
}
