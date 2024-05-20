package org.example.ejercicio1;

public class AdapterMotorElectrico implements IActionMotors{
    private MotorElectrico motorElectrico;

    public AdapterMotorElectrico(MotorElectrico motorElectrico){
        this.motorElectrico=motorElectrico;
    }
    @Override
    public void arrancar() {
        motorElectrico.conectarYactivar();
    }

    @Override
    public void acelerar() {
        motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        motorElectrico.detenerYdesconectar();
    }
}
