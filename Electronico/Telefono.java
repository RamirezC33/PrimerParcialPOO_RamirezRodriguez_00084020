package Electronico;

import Articulo.Articulo;

public class Telefono extends Electronico {
    public Telefono() {}

    public Telefono(Articulo Articulo, String ID, float CostoBase) {
        super(Articulo);
        setID(ID);
        setCostoBase(CostoBase);
    }

    public float precio() {
        return super.CostoBase;
    }
}