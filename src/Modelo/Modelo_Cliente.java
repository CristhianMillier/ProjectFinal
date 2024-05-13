package Modelo;

import Clases.Cliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class Modelo_Cliente extends AbstractTableModel {

    private List<Cliente> listado_Cliente;

    public void setListado_Cliente(List<Cliente> listado_Cliente) {
        this.listado_Cliente = listado_Cliente;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        int cantFilas = 0;
        if (this.listado_Cliente != null) {
            cantFilas = this.listado_Cliente.size();
        }
        return cantFilas;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente objC;
        Object celda = "";
        if (this.listado_Cliente != null) {
            objC = this.listado_Cliente.get(rowIndex);
            switch (columnIndex) {
                case 0:
                    celda = objC.getApell_cliet();
                    break;
                case 1:
                    celda = objC.getNomb_cliet();
                    break;
                case 2:
                    celda = objC.getSexo_cliet();
                    break;
                case 3:
                    celda = objC.getDni_cliet();
                    break;
                case 4:
                    celda = objC.getTelef_cliet();
                    break;
                case 5:
                    celda = objC.getDirec_cliet();
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
                nombreolumn = "Apellido";
                break;
            case 1:
                nombreolumn = "Nombre";
                break;
            case 2:
                nombreolumn = "Sexo";
                break;
            case 3:
                nombreolumn = "DNI";
                break;
            case 4:
                nombreolumn = "Teléfono";
                break;
            case 5:
                nombreolumn = "Dirección";
                break;
        }
        return nombreolumn;
    }

    public Cliente getCliente(int fila) {
        Cliente objC = null;
        if (this.listado_Cliente != null) {
            objC = this.listado_Cliente.get(fila);
        }
        return objC;
    }
}
