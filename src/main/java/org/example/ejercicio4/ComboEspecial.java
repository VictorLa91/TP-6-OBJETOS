package org.example.ejercicio4;

public class ComboEspecial extends Combo{

    public ComboEspecial (){
        var milanesa = new Item(1500, Tipo.Milanesa);
        var milanesa2 = new Item(1500, Tipo.Milanesa);
        var cerveza1 = new Item(200, Tipo.Cerveza);
        var cerveza2 = new Item(2000, Tipo.Cerveza);
        var cerveza3 = new Item(200, Tipo.Cerveza);
        var hamburguesa = new Item(200, Tipo.Hamburguesa);
        var hamburguesa2 = new Item(200, Tipo.Hamburguesa);
        super.agregarItem(milanesa2); super.agregarItem(cerveza1);
        super.agregarItem(milanesa); super.agregarItem(cerveza2);
        super.agregarItem(cerveza3); super.agregarItem(hamburguesa);
        super.agregarItem(hamburguesa2);
    }
}
