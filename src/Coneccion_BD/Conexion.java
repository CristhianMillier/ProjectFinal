package Coneccion_BD;

import java.sql.*;

public class Conexion {
    private final String host= "DESKTOP-K1U570I\\SQLEXPRESS";
    private final String db_name= "MECANICA";
    private final String user = "UsuarioSQL";
    private final String password = "1234";
            
    private Connection conexion;

    public Connection getConexion() {
        return conexion;
    }
    public void Conectar() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        this.conexion = DriverManager.getConnection(
                            "jdbc:sqlserver://" + this.host + ";"
                            + "databaseName=" + this.db_name + ";"
                            + "user=" + this.user + ";"
                            + "password=" + this.password + ";");
    }
    
    public void Desconectar() throws Exception {
        if(this.conexion != null){
            try {
                this.conexion.close();
            } catch (Exception e) {
                throw e;
            }
        }
        this.conexion = null;
    }
    
    public ResultSet obtenerDatos(String sql) throws Exception{
        Statement st;
        ResultSet rs = null;
        if(this.conexion != null) {
            st = this.conexion.createStatement();
            rs = st.executeQuery(sql);
        }
        return rs;
    }
    
    public void actualizarDatos(String sql) throws Exception{
        Statement st;
        if(this.conexion != null) {
            st = this.conexion.createStatement();
            st.executeUpdate(sql);
        }
    }
}
