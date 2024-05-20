package org.example.ejercicio4;

public class DecoradorCombo extends Combo{
    private Combo combo;

    public DecoradorCombo(Combo combo){
     this.combo=combo;
    }

    public void agregarPapas() {
        var papas = new Item(200,Tipo.Papas);
        combo.agregarItem(papas);
    }
    public void agregarTomates() {
        var tomate = new Item(200,Tipo.Tomate);
        combo.agregarItem(tomate);
    }

}
