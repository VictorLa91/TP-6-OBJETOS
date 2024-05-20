package org.example.ejercicio4;

public class ComboFamiliar extends Combo {

    public  ComboFamiliar(){
        var Pizza = new Item(1500, Tipo.Pizza);
        var Pizza2 = new Item(1500, Tipo.Pizza);
        var gaseosaCoca = new Item(200, Tipo.Gaseosa);
        var jugo = new Item(200, Tipo.Jugo);
        var cerveza = new Item(200, Tipo.Cerveza);
        var hamburguesa = new Item(200, Tipo.Hamburguesa);
        var hamburguesa2 = new Item(200, Tipo.Hamburguesa);
        super.agregarItem(Pizza); super.agregarItem(cerveza);
        super.agregarItem(Pizza2); super.agregarItem(jugo);
        super.agregarItem(gaseosaCoca); super.agregarItem(hamburguesa);
        super.agregarItem(hamburguesa2);
    }
}
