package Clases;

public class Producto_Proveedor {
    private int cod_produx;
    private Proveedor id_prov;
    private Producto id_pord;

    public Producto_Proveedor() {
    }

    public Producto_Proveedor(Proveedor id_prov, Producto id_pord) {
        this.id_prov = id_prov;
        this.id_pord = id_pord;
    }

    public int getCod_produx() {
        return cod_produx;
    }

    public void setCod_produx(int cod_produx) {
        this.cod_produx = cod_produx;
    }

    public Proveedor getId_prov() {
        return id_prov;
    }

    public void setId_prov(Proveedor id_prov) {
        this.id_prov = id_prov;
    }

    public Producto getId_pord() {
        return id_pord;
    }

    public void setId_pord(Producto id_pord) {
        this.id_pord = id_pord;
    }

    @Override
    public String toString() {
        return this.id_pord.getNomb_prod() + " " + this.id_pord.getId_mar().getNomb_mar();
    }
    
}
