package Modelo;

import Clases.Producto_Proveedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Modelo_ProducProvee extends AbstractTableModel{
    private List<Producto_Proveedor> listado_ProdProvee;

    public void setListado_ProdProvee(List<Producto_Proveedor> listado_ProdProvee) {
        this.listado_ProdProvee = listado_ProdProvee;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        int cantFilas = 0;
        if (this.listado_ProdProvee != null) {
            cantFilas = this.listado_ProdProvee.size();
        }
        return cantFilas;
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Producto_Proveedor objPP;
        Object celda = "";
        if (this.listado_ProdProvee != null) {
            objPP = this.listado_ProdProvee.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    celda = objPP.getId_pord().getCode();
                    break;
                case 1:
                    celda = objPP.getId_pord().getNomb_prod();
                    break;
                case 2:
                    celda = objPP.getId_pord().getPrecio_prod();
                    break;
                case 3:
                    celda = objPP.getId_pord().getId_mar().getNomb_mar();
                    break;
                case 4:
                    celda = objPP.getId_prov().getNomb_provee();
                    break;
            }
        }
        return celda;
    }
    @Override
    public String getColumnName(int column) {
        String nombreolumn = "";
        switch (column) {
            case 0:
                nombreolumn = "Código";
                break;
            case 1:
                nombreolumn = "Descripción";
                break;
            case 2:
                nombreolumn = "Precio unitario";
                break;
            case 3:
                nombreolumn = "Marca";
                break;
            case 4:
                nombreolumn = "Proveedor";
                break;
        }
        return nombreolumn;
    }
    public Producto_Proveedor getProdPorevee(int fila) {
        Producto_Proveedor objPP = null;
        if (this.listado_ProdProvee != null) {
            objPP = this.listado_ProdProvee.get(fila);
        }
        return objPP;
    }
}
