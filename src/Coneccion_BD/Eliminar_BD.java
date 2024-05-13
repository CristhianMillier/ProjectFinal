package Coneccion_BD;

import Clases.*;

public class Eliminar_BD {
    private Conexion con = new Conexion();
    
    public void eliminarxIDOrden(int idOP) throws Exception {
        String sql = "delete from DetallePedido where id_pedido = " + idOP;
        try {
            this.con.Conectar();
            this.con.actualizarDatos(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
}
