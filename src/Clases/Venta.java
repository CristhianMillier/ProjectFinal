package Clases;

public class Venta {
    private int cod_vent;
    private String fechaHora;
    private float montoPagar;
    private Pedido id_ped;

    public Venta() {
    }    

    public Venta(int cod_vent, String fechaHora, float montoPagar, Pedido id_ped) {
        this.cod_vent = cod_vent;
        this.fechaHora = fechaHora;
        this.montoPagar = montoPagar;
        this.id_ped = id_ped;
    }

    public int getCod_vent() {
        return cod_vent;
    }

    public void setCod_vent(int cod_vent) {
        this.cod_vent = cod_vent;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public float getMontoPagar() {
        return montoPagar;
    }

    public void setMontoPagar(float montoPagar) {
        this.montoPagar = montoPagar;
    }

    public Pedido getId_ped() {
        return id_ped;
    }

    public void setId_ped(Pedido id_ped) {
        this.id_ped = id_ped;
    }
}
