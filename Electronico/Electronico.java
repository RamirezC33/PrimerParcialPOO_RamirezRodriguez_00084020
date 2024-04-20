package Electronico;

import Articulo.Articulo;

public abstract class Electronico extends Articulo {
    private String ID;
    protected float CostoBase;

    public Electronico(){}

    public Electronico(Articulo Articulo){
        super(Articulo);
    }

    public abstract float precio();

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public float getCostoBase() {
        return CostoBase;
    }

    public void setCostoBase(float CostoBase) {
        this.CostoBase = CostoBase;
    }
}