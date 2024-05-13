package Coneccion_BD;

import Clases.*;
import java.sql.*;
import java.util.ArrayList;

public class Llamado_BD {

    private Conexion con = new Conexion();

    //Conección para la entidad Marca
    public ArrayList llenar_Marca() throws Exception {
        ArrayList<Marca> ltsMarca = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Marca order by nombre_mar";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                Marca objM = new Marca();
                objM.setCod_mar(rs.getInt("id_mar"));
                objM.setNomb_mar(rs.getString("nombre_mar"));
                ltsMarca.add(objM);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsMarca;
    }

    //Conección para la entidad Empleado
    public ArrayList llenar_Empleado() throws Exception {
        ArrayList<Empleado> ltsEmpleado = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Empleado order by apellidos_emp";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                Empleado objE = new Empleado();
                objE.setCod_emp(rs.getInt("id_emp"));
                objE.setNomb_emp(rs.getString("nombre_emp"));
                objE.setApell_emp(rs.getString("apellidos_emp"));
                objE.setDni_emp(rs.getInt("dni_emp"));
                objE.setTelef_emp(rs.getInt("telefono_emp"));
                objE.setDirec_emp(rs.getString("direccion"));
                objE.setSexo_emp(rs.getString("genero"));
                objE.setHorario_emp(rs.getString("horario"));
                objE.setCargo_emp(rs.getString("cargo"));
                objE.setUsuario(rs.getString("usuario"));
                objE.setContraseña(rs.getString("contraseña"));
                ltsEmpleado.add(objE);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsEmpleado;
    }

    //Conección para la entidad Cliente
    public ArrayList llenar_Cliente() throws Exception {
        ArrayList<Cliente> ltsCliente = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Cliente order by apellidos_cli";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                Cliente objC = new Cliente();
                objC.setCod_clie(rs.getInt("id_cli"));
                objC.setNomb_cliet(rs.getString("nombre_cli"));
                objC.setApell_cliet(rs.getString("apellidos_cli"));
                objC.setTelef_cliet(rs.getString("telefono_cli"));
                objC.setDni_cliet(rs.getString("dni_cli"));
                objC.setSexo_cliet(rs.getString("sexo_cli"));
                objC.setDirec_cliet(rs.getString("direccion_cli"));
                ltsCliente.add(objC);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsCliente;
    }

    //Conección para la entidad Proveedor
    public ArrayList llenar_Proveedor() throws Exception {
        ArrayList<Proveedor> ltsProveedor = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Proveedor order by nombre_prov";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                Proveedor objP = new Proveedor();
                objP.setCod_provee(rs.getInt("id_prov"));
                objP.setNomb_provee(rs.getString("nombre_prov"));
                objP.setDirec_provee(rs.getString("direccion_prov"));
                objP.setTelef_provee(rs.getString("telefono_prov"));
                objP.setCiud_provee(rs.getString("ciudad_prov"));
                ltsProveedor.add(objP);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsProveedor;
    }

    //Llenar el obejto Producto
    public ArrayList llenar_Producto() throws Exception {
        ArrayList<Producto> ltsProduct = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Producto order by nombre_pro";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                //Obtener objeto Marca
                Marca objM = null;
                int idMar = rs.getInt("id_mar1");
                ArrayList<Marca> ltsMarca = this.llenar_Marca();
                for (Marca mar : ltsMarca) {
                    if (mar.getCod_mar() == idMar) {
                        objM = mar;
                    }
                }
                //llenamos el objeto Producto
                Producto objP = new Producto();
                objP.setCod_prod(rs.getInt("cod_pro"));
                objP.setCode(rs.getString("codigo"));
                objP.setNomb_prod(rs.getString("nombre_pro"));
                objP.setId_mar(objM);
                objP.setStock_prod(rs.getInt("stock_pro"));
                objP.setPrecio_prod(rs.getFloat("precio_pro"));
                ltsProduct.add(objP);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsProduct;
    }

    //Conección para la entidad Produx
    public ArrayList llenar_Producto_Provee() throws Exception {
        ArrayList<Producto_Proveedor> ltsProduct = new ArrayList();
        try {
            this.con.Conectar();
            String sql = "select * from Produx";
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                //Obtener objeto Proveedor
                Proveedor objP = null;
                int idProvee = rs.getInt("id_prov1");
                ArrayList<Proveedor> ltsprov = this.llenar_Proveedor();
                for (Proveedor prove : ltsprov) {
                    if (prove.getCod_provee() == idProvee) {
                        objP = prove;
                    }
                }
                //Obtener objeto Producto
                Producto objPro = null;
                int idPord = rs.getInt("cod_pro1");
                ArrayList<Producto> ltsprod = this.llenar_Producto();
                for (Producto prod : ltsprod) {
                    if (prod.getCod_prod() == idPord) {
                        objPro = prod;
                    }
                }
                //Llenamos el objeto Producto_Proveedor
                Producto_Proveedor objPP = new Producto_Proveedor();
                objPP.setCod_produx(rs.getInt("id_produx"));
                objPP.setId_pord(objPro);
                objPP.setId_prov(objP);
                ltsProduct.add(objPP);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return ltsProduct;
    }

    //Accerder al sistema
    public Empleado accder(String usuario, String clave) throws Exception {
        Empleado objE = null;
        try {
            con.Conectar();
            String sql = "select * from Empleado WHERE usuario='" + usuario + "' AND contraseña='" + clave + "'";
            ResultSet rs = con.obtenerDatos(sql);
            while (rs.next()) {
                objE = new Empleado();
                objE.setCod_emp(rs.getInt("id_emp"));
                objE.setNomb_emp(rs.getString("nombre_emp"));
                objE.setApell_emp(rs.getString("apellidos_emp"));
                objE.setDni_emp(rs.getInt("dni_emp"));
                objE.setTelef_emp(rs.getInt("telefono_emp"));
                objE.setDirec_emp(rs.getString("direccion"));
                objE.setSexo_emp(rs.getString("genero"));
                objE.setHorario_emp(rs.getString("horario"));
                objE.setCargo_emp(rs.getString("cargo"));
                objE.setUsuario(rs.getString("usuario"));
                objE.setContraseña(rs.getString("contraseña"));
            }
        } catch (Exception e) {
            throw e;
        } finally {
            this.con.Desconectar();
        }
        return objE;
    }

    //Obtener una orden de Pedido
    public Pedido buscarXNroOrden(String nroOrden) throws Exception {
        Pedido objOP = null;
        String sql = "select * from Pedido where codigo = '" + nroOrden + "'";
        try {
            con.Conectar();
            ResultSet rs = con.obtenerDatos(sql);
            while (rs.next()) {
                objOP = new Pedido();
                objOP.setCod_ped(rs.getInt("id_ped"));
                objOP.setCodigo(rs.getString("codigo"));
                
                //Para cliente
                Cliente objC = null;
                ArrayList<Cliente> ltclie = this.llenar_Cliente();
                for (Cliente c : ltclie) {
                    if (c.getCod_clie() == rs.getInt("id_cli1")) {
                        objC = c;
                    }
                }
                objOP.setId_clie(objC);

                //Para empleado
                Empleado objE = null;
                ArrayList<Empleado> ltempl = this.llenar_Empleado();
                for (Empleado E : ltempl) {
                    if (E.getCod_emp() == rs.getInt("id_emp1")) {
                        objE = E;
                    }
                }
                objOP.setId_emp(objE);
            }
            return objOP;
        } catch (Exception e) {
            throw e;
        } finally {
            con.Desconectar();
        }
    }
    
    //Obtener un detalle orden
    public ArrayList buscarDetalle(int idOrden) throws Exception {
        ArrayList<Detalle_Pedido> lista = new ArrayList();
        String sql = "select * from DetallePedido where id_pedido = " + idOrden;
        try {
            con.Conectar();
            ResultSet rs = con.obtenerDatos(sql);
            Detalle_Pedido objDOP = null;
            while (rs.next()) {
                objDOP = new Detalle_Pedido();
                objDOP.setCod_detped(rs.getInt("id_detped"));
                objDOP.setCatidad(rs.getInt("cantidad"));
                objDOP.setSubtotal(rs.getFloat("subtotal"));
                //Obtener objeto Pedido
                Pedido objP = null;
                objP = this.buscarXNroOrden(String.valueOf(rs.getInt("id_pedido")));     
                objDOP.setId_ven(objP);
                //Obtener objeto Producto
                Producto_Proveedor objPro = null;
                ArrayList<Producto_Proveedor> ltsprod = this.llenar_Producto_Provee();
                for (Producto_Proveedor prod : ltsprod) {
                    if (prod.getCod_produx() == rs.getInt("cod_produx1")) {
                        objPro = prod;
                    }
                }
                objDOP.setId_produx(objPro);
                lista.add(objDOP);
            }
            return lista;
        } catch (Exception e) {
            throw e;
        } finally {
            con.Desconectar();
        }
    }
    
    //Obtener total a pagar
    public float obtenerTotalVenta(int idOrden) throws Exception {
        float montoTotal = 0;
        String sql = "select sum(subtotal) as monto from DetallePedido where id_pedido = " + idOrden;
        try {
            this.con.Conectar();
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                montoTotal = rs.getFloat("monto");
            }
            return montoTotal;
        } catch (Exception e) {
            throw  e;
        } finally {
            this.con.Desconectar();
        }
    }

    public int obtenerCompras(Cliente objC) throws Exception{
        int compra = 0;
        String sql = "select count(*) as comp from Pedido as P inner join Cliente as C" 
                + " on P.id_cli1 = C.id_cli where C.id_cli =" + objC.getCod_clie();
        try {
            this.con.Conectar();
            ResultSet rs = this.con.obtenerDatos(sql);
            while (rs.next()) {
                compra = rs.getInt("comp");
            }
            return compra;
        } catch (Exception e) {
            throw  e;
        } finally {
            this.con.Desconectar();
        }
    }
}
