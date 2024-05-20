package org.example.ejercicio4;

public class BuilderCombo {
    private Combo comboo;
    private Combo decorador;

    public BuilderCombo(Combo combo){
        comboo=combo;
        decorador=combo;
    }

    public BuilderCombo conPapas(){
        var papas = new Item(300,Tipo.Papas);
        decorador.agregarItem(papas);
        return this;
    }

    public BuilderCombo conTomate(){
        var tomate = new Item(300,Tipo.Tomate);
        decorador.agregarItem(tomate);
        return this;
    }


}
