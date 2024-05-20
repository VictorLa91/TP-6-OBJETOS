package org.example.ejercicio5;

import org.example.ejercicio1.AdapterMotorElectrico;
import org.example.ejercicio1.MotorComun;
import org.example.ejercicio1.MotorEconomico;
import org.example.ejercicio1.MotorElectrico;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainConcursoParticipante {
    public static void main(String[] args) {
        var decorador = new DecoratorConcurso();
        var participante = new Participante("victor",10);
        var concurso = new Concurso(LocalDateTime.now().minusDays(5),
                LocalDateTime.now().plusDays(5),
                10,


                );
    }
}