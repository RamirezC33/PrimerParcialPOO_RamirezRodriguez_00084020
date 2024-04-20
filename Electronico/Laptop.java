package Electronico;

import Articulo.Articulo;

public class Laptop extends Electronico implements Impuesto{
    private int CostoPrecioBase;

    public Laptop(Articulo Articulo, String ID, float CostoBase, int CostoPrecioBase) {
        super(Articulo);
        setID(ID);
        setCostoBase(CostoBase);
        this.CostoPrecioBase = CostoPrecioBase;
    }

    public int getCostoPrecioBase() {
        return CostoPrecioBase;
    }

    public void setCostoPrecioBase(int CostoPrecioBase) {
        this.CostoPrecioBase = CostoPrecioBase;
    }

    public float precio() {
        return calcularCosto(CostoPrecioBase);
    }

    public float calcularCosto(int CostoImpuestos) {
        return CostoImpuestos*CostoBase;
    }
}