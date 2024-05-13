package Clases;

public class Producto {
    private int cod_prod;
    private String code;
    private String nomb_prod;
    private int stock_prod;
    private float precio_prod;
    private Marca id_mar;

    public Producto() {
    }

    public Producto(String code, String nomb_prod, int stock_prod, float precio_prod, Marca id_mar) {
        this.code = code;
        this.nomb_prod = nomb_prod;
        this.stock_prod = stock_prod;
        this.precio_prod = precio_prod;
        this.id_mar = id_mar;
    }

    public int getCod_prod() {
        return cod_prod;
    }

    public void setCod_prod(int cod_prod) {
        this.cod_prod = cod_prod;
    }

    public String getNomb_prod() {
        return nomb_prod;
    }

    public void setNomb_prod(String nomb_prod) {
        this.nomb_prod = nomb_prod;
    }

    public int getStock_prod() {
        return stock_prod;
    }

    public void setStock_prod(int stock_prod) {
        this.stock_prod = stock_prod;
    }

    public float getPrecio_prod() {
        return precio_prod;
    }

    public void setPrecio_prod(float precio_prod) {
        this.precio_prod = precio_prod;
    }

    public Marca getId_mar() {
        return id_mar;
    }

    public void setId_mar(Marca id_mar) {
        this.id_mar = id_mar;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return this.nomb_prod + " " + this.id_mar.getNomb_mar();
    }
    
    
}
