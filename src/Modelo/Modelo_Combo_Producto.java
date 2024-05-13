package Modelo;

import Clases.Producto_Proveedor;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class Modelo_Combo_Producto extends AbstractListModel implements ComboBoxModel{
    private List<Producto_Proveedor> listadoProducto;
    private Producto_Proveedor seleccionado;

    public List<Producto_Proveedor> getListadoProducto() {
        return listadoProducto;
    }

    public void setListadoProducto(List<Producto_Proveedor> listadoProducto) {
        this.listadoProducto = listadoProducto;
    }

    @Override
    public int getSize() {
        int cantElem= 0;
        if(this.listadoProducto !=null) {
            cantElem = this.listadoProducto.size();
        }
        return cantElem;
    }

    @Override
    public Object getElementAt(int index) {
        Object elem = "";
        if(this.listadoProducto !=null) {
            elem = this.listadoProducto.get(index).getId_pord().toString();
        }
        return elem;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if(this.listadoProducto !=null && anItem!=null) {
            for(Producto_Proveedor p: this.listadoProducto) {
                if(p.toString().equals(anItem.toString())) {
                    this.seleccionado = p;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object elem = "";
        if(this.seleccionado!=null) {
            elem = this.seleccionado.getId_pord().toString();
        }
        return elem;
    }
    public void seleccionarProducto(Producto_Proveedor producto) {
        this.seleccionado = null;
        if(producto != null && this.listadoProducto != null) {
            for(Producto_Proveedor p : this.listadoProducto) {
                if(p.getCod_produx() == producto.getCod_produx()) {
                    this.seleccionado = p;
                    return;
                }
            }
        }
    }
    
    
    public Producto_Proveedor obtenerProducto() {
        Producto_Proveedor objP = null;
        if(this.listadoProducto != null && this.seleccionado != null) {
            objP = this.seleccionado;
        }
        return objP;
    }
    
    public Producto_Proveedor buscarProducto(String idProd) {
        Producto_Proveedor objP = null;
        if(idProd.equals("") && this.listadoProducto != null) {
            for(Producto_Proveedor p : this.listadoProducto) {
                if(p.getId_pord().getCode().equals(idProd)) {
                    objP = p;
                    break;
                }
            }
        }
        return objP;
    }
}
