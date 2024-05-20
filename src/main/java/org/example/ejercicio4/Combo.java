package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public abstract class Combo {
    private List<Item>listaItems;


    public Combo(){
        listaItems=new ArrayList<>();

    }

    public double calcularCosto(){
        double total=0;
        for (Item item : listaItems){
            total+= item.precio();
        }
        return total;
    }
    public void agregarItem(Item item){
        listaItems.add(item);

    }
}
