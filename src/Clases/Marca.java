package Clases;

import Coneccion_BD.Conexion;
import javax.swing.JComboBox;
import java.sql.*;
import javax.swing.JOptionPane;

public class Marca {
    private Conexion con = new Conexion();
    private int cod_mar;
    private String nomb_mar;

    public Marca() {
    }

    public Marca(String nomb_mar) {
        this.nomb_mar = nomb_mar;
    }

    //Construcctor para Combo
    public Marca(int cod_mar, String nomb_mar) {
        this.cod_mar = cod_mar;
        this.nomb_mar = nomb_mar;
    }

    public String getNomb_mar() {
        return nomb_mar;
    }

    public void setNomb_mar(String nomb_mar) {
        this.nomb_mar = nomb_mar;
    }

    public int getCod_mar() {
        return cod_mar;
    }

    public void setCod_mar(int cod_mar) {
        this.cod_mar = cod_mar;
    }

    @Override
    public String toString() {
        return nomb_mar;
    }

    public void mostrar_Marca(JComboBox<Marca> jComboBox) throws Exception{
        try {
            this.con.Conectar();
            String sql = "select * from Marca order by nombre_mar";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                jComboBox.addItem(
                        new Marca(
                                rs.getInt("id_mar"),
                                rs.getString("nombre_mar")
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
