package Clases;

public class Detalle_Pedido {
    private int cod_detped;
    private int catidad;
    private float subtotal;
    private Producto_Proveedor id_produx;
    private Pedido id_ven;

    public Detalle_Pedido() {
    }

    public Detalle_Pedido(int catidad, float subtotal, Producto_Proveedor id_produx, Pedido id_ven) {
        this.catidad = catidad;
        this.subtotal = subtotal;
        this.id_produx = id_produx;
        this.id_ven = id_ven;
    }

    public int getCod_detped() {
        return cod_detped;
    }

    public void setCod_detped(int cod_detped) {
        this.cod_detped = cod_detped;
    }

    public int getCatidad() {
        return catidad;
    }

    public void setCatidad(int catidad) {
        this.catidad = catidad;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public Producto_Proveedor getId_produx() {
        return id_produx;
    }

    public void setId_produx(Producto_Proveedor id_produx) {
        this.id_produx = id_produx;
    }

    public Pedido getId_ven() {
        return id_ven;
    }

    public void setId_ven(Pedido id_ven) {
        this.id_ven = id_ven;
    }
   
}
