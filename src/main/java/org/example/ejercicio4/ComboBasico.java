package org.example.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class ComboBasico extends Combo{

    public ComboBasico()  {
        var SandwichDeMilanga = new Item(1500, Tipo.Sandwinch);
        var gaseosaCoca = new Item(200, Tipo.Gaseosa);
        var porcionDePapas = new Item(200, Tipo.PapasFritas);
        super.agregarItem(SandwichDeMilanga);
        super.agregarItem(gaseosaCoca);
        super.agregarItem(porcionDePapas);

    }
}
