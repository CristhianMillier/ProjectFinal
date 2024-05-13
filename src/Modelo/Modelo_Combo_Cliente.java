package Modelo;

import Clases.Cliente;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

public class Modelo_Combo_Cliente extends AbstractListModel implements ComboBoxModel{
    private List<Cliente> listadoClientes;
    private Cliente seleccionado;

    public List<Cliente> getListadoClientes() {
        return listadoClientes;
    }

    public void setListadoClientes(List<Cliente> listadoClientes) {
        this.listadoClientes = listadoClientes;
    }

    @Override
    public int getSize() {
        int cantElem= 0;
        if(this.listadoClientes!=null) {
            cantElem = this.listadoClientes.size();
        }
        return cantElem;
    }

    @Override
    public Object getElementAt(int index) {
        Object elem = "";
        if(this.listadoClientes!=null) {
            elem = this.listadoClientes.get(index).toString();
        }
        return elem;
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.seleccionado = null;
        if(this.listadoClientes!=null && anItem!=null) {
            for(Cliente c: this.listadoClientes) {
                if(c.toString().equals(anItem.toString())) {
                    this.seleccionado = c;
                    return;
                }
            }
        }
    }

    @Override
    public Object getSelectedItem() {
        Object elem = "";
        if(this.seleccionado!=null) {
            elem = this.seleccionado.toString();
        }
        return elem;
    }
    
    public void seleccionarCliente(Cliente cliente) {
        this.seleccionado = null;
        if(cliente != null && this.listadoClientes != null) {
            for(Cliente c : this.listadoClientes) {
                if(c.getCod_clie() == cliente.getCod_clie()) {
                    this.seleccionado = c;
                    return;
                }
            }
        }
    }
    
    public Cliente obtenerCliente() {
        Cliente objC = null;
        if(this.listadoClientes != null && this.seleccionado != null) {
            objC = this.seleccionado;
        }
        return objC;
    }
    public Cliente buscarCliente(int idClie) {
        Cliente objC = null;
        if(idClie > 0 && this.listadoClientes != null) {
            for(Cliente c : this.listadoClientes) {
                if(c.getCod_clie() == idClie) {
                    objC = c;
                    break;
                }
            }
        }
        return objC;
    }
}
