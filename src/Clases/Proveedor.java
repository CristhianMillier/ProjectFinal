package Clases;

import Coneccion_BD.Conexion;
import java.sql.ResultSet;
import javax.swing.JComboBox;

public class Proveedor {
    private Conexion con = new Conexion();
    private int cod_provee;
    private String nomb_provee;
    private String direc_provee;
    private String telef_provee;
    private String ciud_provee;

    public Proveedor() {
    }

    public Proveedor(String nomb_provee, String direc_provee, String telef_provee, String ciud_provee) {
        this.nomb_provee = nomb_provee;
        this.direc_provee = direc_provee;
        this.telef_provee = telef_provee;
        this.ciud_provee = ciud_provee;
    }
    //Constructor para JComboBox

    public Proveedor(int cod_provee, String nomb_provee, String direc_provee, String telef_provee, String ciud_provee) {
        this.cod_provee = cod_provee;
        this.nomb_provee = nomb_provee;
        this.direc_provee = direc_provee;
        this.telef_provee = telef_provee;
        this.ciud_provee = ciud_provee;
    }
    

    public String getNomb_provee() {
        return nomb_provee;
    }

    public void setNomb_provee(String nomb_provee) {
        this.nomb_provee = nomb_provee;
    }

    public String getDirec_provee() {
        return direc_provee;
    }

    public void setDirec_provee(String direc_provee) {
        this.direc_provee = direc_provee;
    }

    public String getTelef_provee() {
        return telef_provee;
    }

    public void setTelef_provee(String telef_provee) {
        this.telef_provee = telef_provee;
    }

    public String getCiud_provee() {
        return ciud_provee;
    }

    public void setCiud_provee(String ciud_provee) {
        this.ciud_provee = ciud_provee;
    }

    public int getCod_provee() {
        return cod_provee;
    }

    public void setCod_provee(int cod_provee) {
        this.cod_provee = cod_provee;
    }

    @Override
    public String toString() {
        return nomb_provee;
    }
    public void mostrar_Proveedor(JComboBox<Proveedor> jComboBox) throws Exception{
        try {
            this.con.Conectar();
            String sql = "select * from Proveedor order by nombre_prov";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                jComboBox.addItem(
                        new Proveedor(
                                rs.getInt("id_prov"),
                                rs.getString("nombre_prov"),
                                rs.getString("direccion_prov"),
                                rs.getString("telefono_prov"),
                                rs.getString("ciudad_prov")
                        )
                );
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
}
