package Modelo;

import Clases.Proveedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Modelo_Proveedor extends AbstractTableModel{
    private List<Proveedor> listado_Proveed;

    public void setListado_Proveed(List<Proveedor> listado_Proveed) {
        this.listado_Proveed = listado_Proveed;
        this.fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        int cantFilas = 0; 
        if (this.listado_Proveed != null) {
            cantFilas = this.listado_Proveed.size();
        }
        return cantFilas;
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Proveedor objP;
        Object celda ="";
        if (this.listado_Proveed != null) {
            objP = this.listado_Proveed.get(rowIndex);
            switch(columnIndex){
                case 0: celda = objP.getNomb_provee(); break;
                case 1: celda = objP.getDirec_provee(); break;
                case 2: celda = objP.getTelef_provee(); break;
                case 3: celda = objP.getCiud_provee(); break;
            }
        }
        return celda;
    }
    @Override
    public String getColumnName(int column) {
        String nombreolumn = "";
        switch(column){
            case 0: nombreolumn = "Capañía"; break;
            case 1: nombreolumn = "Dirección"; break;
            case 2: nombreolumn = "Teléfono"; break;
            case 3: nombreolumn = "Ciudad"; break;
        }
        return nombreolumn;
    }
    
    public Proveedor getProveedor(int fila){
        Proveedor objP = null;
        if (this.listado_Proveed != null) {
            objP = this.listado_Proveed.get(fila);
        }
        return objP;
    }
}
