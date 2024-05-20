package org.example.ejercicio4;

public  class Item {
    private double precio;
    private Tipo tipo;

    public Item(double precio, Tipo tipo){
        this.precio=precio;
        this.tipo=tipo;
    }
    public double precio(){
        return this.precio;
    }
}
