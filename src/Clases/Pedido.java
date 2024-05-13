package Clases;

public class Pedido {
    private int cod_ped;
    private String codigo;
    private String fechaHora;
    private Empleado id_emp;
    private Cliente id_clie;

    public Pedido() {
    }

    public Pedido(int cod_ped, String codigo, String fechaHora, Empleado id_emp, Cliente id_clie) {
        this.cod_ped = cod_ped;
        this.codigo = codigo;
        this.fechaHora = fechaHora;
        this.id_emp = id_emp;
        this.id_clie = id_clie;
    }

    public int getCod_ped() {
        return cod_ped;
    }

    public void setCod_ped(int cod_ped) {
        this.cod_ped = cod_ped;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(String fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Empleado getId_emp() {
        return id_emp;
    }

    public void setId_emp(Empleado id_emp) {
        this.id_emp = id_emp;
    }

    public Cliente getId_clie() {
        return id_clie;
    }

    public void setId_clie(Cliente id_clie) {
        this.id_clie = id_clie;
    }
    
}
