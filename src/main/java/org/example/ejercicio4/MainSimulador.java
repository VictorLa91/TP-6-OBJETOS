package org.example.ejercicio4;


public class MainSimulador {
        public static void main(String[] args) {



            var comboFamiliar = new ComboFamiliar();
            var decorator = new DecoradorCombo(comboFamiliar);
            System.out.println("El costo del combo 1 sin porciones extras : " + comboFamiliar.calcularCosto());
            decorator.agregarTomates();
            decorator.agregarPapas();
            System.out.println("El costo total ahora es : " + comboFamiliar.calcularCosto());


            var comboEspecial = new ComboEspecial();
            var decorator2 = new DecoradorCombo(comboEspecial);
            System.out.println("El costo del combo 2 sin porciones extras : " + comboEspecial.calcularCosto());
            decorator2.agregarPapas();
            decorator2.agregarPapas();
            System.out.println("El costo total ahora es : " + comboEspecial.calcularCosto());

            var comboBasico= new ComboBasico();
            System.out.println("El costo del combo basico es  : " + comboBasico.calcularCosto());

            var comboBuilder = new BuilderCombo(comboBasico).conPapas().conTomate();
            System.out.println("El costo total ahora es : " + comboBasico.calcularCosto());
             }
    }