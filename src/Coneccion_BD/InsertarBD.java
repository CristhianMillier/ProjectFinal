package Coneccion_BD;

import Clases.*;
import java.sql.ResultSet;

public class InsertarBD {

    private Conexion con = new Conexion();

    //Insertar datos para la entidad Marca
    public void agregar_Marca(Marca objM) throws Exception {
        try {
            this.con.Conectar();
            String insertar = "insert into Marca values ('"
                    + objM.getNomb_mar() + "')";
            this.con.actualizarDatos(insertar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }

    //Insertar datos para la entidad Cliente
    public void agregar_Cliente(Cliente objC) throws Exception {
        try {
            this.con.Conectar();
            String insertar = "insert into Cliente values ('"
                    + objC.getNomb_cliet() + "', '"
                    + objC.getApell_cliet() + "', "
                    + Integer.parseInt(objC.getTelef_cliet()) + ", "
                    + Integer.parseInt(objC.getDni_cliet()) + ", '"
                    + objC.getSexo_cliet() + "', '"
                    + objC.getDirec_cliet() + "')";
            this.con.actualizarDatos(insertar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }

    //Insertar datos para la entidad Empleado
    public void agregar_Empleado(Empleado objE) throws Exception {
        String user, contra = "";
        if (objE.getUsuario().equals("null") || objE.getContraseña().equals("null")) {
            user = null;
            contra = null;
        } else {
            user = "'" + objE.getUsuario() + "'";
            contra = "'" + objE.getContraseña() + "'";
        }
        try {
            this.con.Conectar();
            String insertar = "insert into Empleado values ('"
                    + objE.getNomb_emp() + "', '"
                    + objE.getApell_emp() + "', "
                    + objE.getDni_emp() + ", "
                    + objE.getTelef_emp() + ", '"
                    + objE.getDirec_emp() + "', '"
                    + objE.getSexo_emp() + "', '"
                    + objE.getHorario_emp() + "', '"
                    + objE.getCargo_emp() + "', "
                    + user + ", "
                    + contra + ")";
            this.con.actualizarDatos(insertar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }

    //Insertar datos para la entidad Proveedor
    public void agregar_Proveed(Proveedor objP) throws Exception {
        try {
            this.con.Conectar();
            String insertar = "insert into Proveedor values ('"
                    + objP.getNomb_provee() + "', '"
                    + objP.getDirec_provee() + "', '"
                    + Integer.parseInt(objP.getTelef_provee()) + "', '"
                    + objP.getCiud_provee() + "')";
            this.con.actualizarDatos(insertar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }

    //Insertar datos para la entidad Producto
    public void agregar_Produc_Provee(Producto_Proveedor objPP) throws Exception {
        try {
            this.con.Conectar();
            //Insertamos Producto
            String insertarPro = "insert into Producto values ('"
                    + objPP.getId_pord().getCode() + "', '"
                    + objPP.getId_pord().getNomb_prod() + "', "
                    + objPP.getId_pord().getStock_prod() + ", "
                    + objPP.getId_pord().getPrecio_prod() + ", "
                    + objPP.getId_pord().getId_mar().getCod_mar() + ")";
            this.con.actualizarDatos(insertarPro);
            //obtener ID de producto
            int id = 0;
            String obt = "select cod_pro from Producto where codigo = '"
                    + objPP.getId_pord().getCode() + "'";
            ResultSet rs = this.con.obtenerDatos(obt);
            while (rs.next()) {
                id = rs.getInt("cod_pro");
            }
            //insertamos Producto_Proveedor
            this.con.Conectar();
            String insertarProdPorve = "insert into Produx values ("
                    + objPP.getId_prov().getCod_provee() + ", "
                    + id + ")";
            this.con.actualizarDatos(insertarProdPorve);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }

    //Insertar Pedido
    public long insertarPedido(Pedido objP) throws Exception {
        long id = 0;
        try {
            this.con.Conectar();
            String sql = "insert into Pedido values ( '"
                + objP.getCodigo() + "', '"
                + objP.getFechaHora() + "', "
                + objP.getId_emp().getCod_emp() + ", "
                + objP.getId_clie().getCod_clie() + " )";
            this.con.actualizarDatos(sql);
            
            String llamaid = "select id_ped from Pedido where codigo = '" + objP.getCodigo() + "' ";
            ResultSet rs = this.con.obtenerDatos(llamaid);
            while (rs.next()) {
                id = rs.getLong("id_ped");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return id;
    }

    //Insertar Desatalle Pedido
    public void insertarDetalle(Detalle_Pedido dop) throws Exception {
        String sql = "insert into DetallePedido values ("
                + dop.getCatidad() + ", "
                + dop.getSubtotal() + ", "
                + dop.getId_produx().getCod_produx() + ", "
                + dop.getId_ven().getCod_ped() + " )";
        try {
            this.con.Conectar();
            this.con.actualizarDatos(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    
    //Insertar Venta
    public void insertarVenta(Venta objV) throws Exception {
        String sql = "insert into Venta values ('"
                + objV.getFechaHora() + "', "
                + objV.getMontoPagar() + ", "
                + objV.getId_ped().getCod_ped() + ")";
        try {
            con.Conectar();
            con.actualizarDatos(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            con.Desconectar();
        }
    }
}
