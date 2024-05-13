package Coneccion_BD;

import Clases.*;

public class EditarBD {
    private Conexion con = new Conexion();
    
    //Editar datos para la entidad Marca
    public void editar_Marca(Marca objM) throws Exception{
        try {
            this.con.Conectar();
            String editar = "update Marca set nombre_mar='"
                    + objM.getNomb_mar() + "' where id_mar = "
                    + objM.getCod_mar();
            this.con.actualizarDatos(editar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    //Editar datos para la entidad Cliente
    public void editar_Cliente(Cliente objC) throws Exception{
        try {
            this.con.Conectar();
            String editar = "update Cliente set nombre_cli = '"
                    + objC.getNomb_cliet() + "', apellidos_cli = '"
                    + objC.getApell_cliet() + "', telefono_cli = "
                    + Integer.parseInt(objC.getTelef_cliet()) + ", dni_cli = "
                    + Integer.parseInt(objC.getDni_cliet()) + ", sexo_cli = '"
                    + objC.getSexo_cliet() + "', direccion_cli = '"
                    + objC.getDirec_cliet() + "' where id_cli ="
                    + objC.getCod_clie();
            this.con.actualizarDatos(editar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    //Editar datos para la entidad Empleado
    public void editar_Empleado(Empleado objE) throws Exception{
        String user, contra = "";
        if (objE.getUsuario().equals("null")) {
            user = null;
            contra = null;
        } else {
            user = "'" + objE.getUsuario() + "'";
            contra = "'" + objE.getContraseña() + "'";
        }
        try {
            this.con.Conectar();
            String editar = "update Empleado set nombre_emp = '"
                    + objE.getNomb_emp() + "', apellidos_emp = '"
                    + objE.getApell_emp() + "', dni_emp = "
                    + objE.getDni_emp() + ", telefono_emp = "
                    + objE.getTelef_emp() + ", direccion = '"
                    + objE.getDirec_emp() + "', genero = '"
                    + objE.getSexo_emp() + "', horario ='"
                    + objE.getHorario_emp() + "', cargo ='"
                    + objE.getCargo_emp() + "', usuario ="
                    + user + ", contraseña =" 
                    + contra + " where id_emp =" + objE.getCod_emp();
            this.con.actualizarDatos(editar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    //Editar datos para la entidad Proveedor
    public void editar_Proveed(Proveedor objP) throws Exception{
        try {
            this.con.Conectar();
            String editar = "update Proveedor set nombre_prov = '"
                    + objP.getNomb_provee() + "', direccion_prov = '"
                    + objP.getDirec_provee() + "', telefono_prov =  '"
                    + objP.getTelef_provee() + "', ciudad_prov = '"
                    + objP.getCiud_provee() + "' where id_prov = "
                    + objP.getCod_provee();
            this.con.actualizarDatos(editar);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    //Insertar datos para la entidad Producto
    public void editar_Produc_Provee(Producto_Proveedor objPP) throws Exception {
        try {
            this.con.Conectar();
            //Insertamos Producto
            String insertarPro = "update Producto set codigo = '"
                    + objPP.getId_pord().getCode() + "', nombre_pro = '"
                    + objPP.getId_pord().getNomb_prod() + "', stock_pro = "
                    + objPP.getId_pord().getStock_prod() + ", precio_pro = "
                    + objPP.getId_pord().getPrecio_prod() + ", id_mar1 = "
                    + objPP.getId_pord().getId_mar().getCod_mar() + " where cod_pro = "
                    + objPP.getId_pord().getCod_prod();
            this.con.actualizarDatos(insertarPro);
            //insertamos Producto_Proveedor
            String insertarProdPorve = "update Produx set id_prov1 = "
                    + objPP.getId_prov().getCod_provee() + ", cod_pro1 = "
                    + objPP.getId_pord().getCod_prod() + " where id_produx = "
                    + objPP.getCod_produx();
            this.con.actualizarDatos(insertarProdPorve);
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
    }
    
    //Insertar datos para la entidad Pedido
    public void editar_Pedido(Pedido objOP) throws Exception {
        String sql = "update Pedido set fecha_ped = '" 
                + objOP.getFechaHora() + "' "+
                " where id_ped = " + objOP.getCod_ped();
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
