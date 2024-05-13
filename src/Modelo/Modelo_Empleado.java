package Modelo;

import Clases.Empleado;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Modelo_Empleado extends AbstractTableModel{
    private List<Empleado> listado_Empleado;

    public void setListado_Empleado(List<Empleado> listado_Empleado) {
        this.listado_Empleado = listado_Empleado;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantFilas = 0; 
        if (this.listado_Empleado != null) {
            cantFilas = this.listado_Empleado.size();
        }
        return cantFilas;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Empleado objE;
        Object celda ="";
        if (this.listado_Empleado != null) {
            objE = this.listado_Empleado.get(rowIndex);
            switch(columnIndex){
                case 0: celda = objE.getApell_emp(); break;
                case 1: celda = objE.getNomb_emp(); break;
                case 2: celda = objE.getSexo_emp(); break;
                case 3: celda = objE.getDni_emp(); break;
                case 4: celda = objE.getCargo_emp(); break;
                case 5: celda = objE.getTelef_emp(); break;
            }
        }
        return celda;
    }
    
    @Override
    public String getColumnName(int column) {
        String nombreolumn = "";
        switch(column){
            case 0: nombreolumn = "Apellido"; break;
            case 1: nombreolumn = "Nombre"; break;
            case 2: nombreolumn = "Sexo"; break;
            case 3: nombreolumn = "DNI"; break;
            case 4: nombreolumn = "Cargo"; break;
            case 5: nombreolumn = "Teléfono"; break;
        }
        return nombreolumn;
    }
    
    public Empleado getEmpleado(int fila){
        Empleado objE = null;
        if (this.listado_Empleado != null) {
            objE = this.listado_Empleado.get(fila);
        }
        return objE;
    }
}
