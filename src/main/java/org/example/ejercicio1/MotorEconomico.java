package org.example.ejercicio1;

public class MotorEconomico implements IActionMotors{
    @Override
    public void arrancar() {
        System.out.println("Arranco motor Economico");

    }
    @Override
    public void acelerar() {
        System.out.println("Acelera el motor Economico");
    }
    @Override
    public void apagar() {
        System.out.println("Se apago motor Economico");
    }
}
