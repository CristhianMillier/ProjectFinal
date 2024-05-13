package Interfaces;

import Clases.*;
import Coneccion_BD.*;
import Modelo.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class IFOrdenPedido extends javax.swing.JInternalFrame implements TableModelListener {

    private Pedido ordenEdicion = null;
    private ArrayList<Detalle_Pedido> detallesEdicion = null;

    public IFOrdenPedido() {
        initComponents();
        this.tamanioTabla();
        this.jTableOrdenPedido.getModel().addTableModelListener(this);
        this.activarControles(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldOrden = new javax.swing.JTextField();
        jbtLimpiar = new javax.swing.JButton();
        jbtContinuar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jbtAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdenPedido = new javax.swing.JTable();
        jbtEliminar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPago = new javax.swing.JTextField();
        jbtGuardar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Gestionar Pedido");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nº Orden:");

        jbtLimpiar.setBackground(new java.awt.Color(0, 0, 0));
        jbtLimpiar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        jbtLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/escoba.png"))); // NOI18N
        jbtLimpiar.setText("Limpiar");
        jbtLimpiar.setToolTipText("");
        jbtLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtLimpiarActionPerformed(evt);
            }
        });

        jbtContinuar.setBackground(new java.awt.Color(0, 0, 0));
        jbtContinuar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtContinuar.setForeground(new java.awt.Color(255, 255, 255));
        jbtContinuar.setText("Continuar");
        jbtContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addComponent(jTextFieldOrden, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jbtContinuar)
                .addGap(26, 26, 26)
                .addComponent(jbtLimpiar)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldOrden, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtLimpiar)
                    .addComponent(jbtContinuar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre y Apellido:");

        jComboBoxCliente.setModel(this.combClient());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2)
                .addGap(54, 54, 54)
                .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Producto:");

        jComboBoxProducto.setModel(this.combProdc());

        jbtAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jbtAgregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbtAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
        jbtAgregar.setText("Agregar");
        jbtAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAgregarActionPerformed(evt);
            }
        });

        jTableOrdenPedido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTableOrdenPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Producto", "Cantd.", "Sub Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOrdenPedido.getTableHeader().setResizingAllowed(false);
        jTableOrdenPedido.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableOrdenPedido);

        jbtEliminar.setBackground(java.awt.Color.red);
        jbtEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtEliminar.setForeground(new java.awt.Color(255, 255, 255));
        jbtEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        jbtEliminar.setText("Eliminar");
        jbtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jbtAgregar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtEliminar)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAgregar))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jbtEliminar))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL A PAGAR");

        jTextFieldPago.setEditable(false);
        jTextFieldPago.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldPago.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldPago.setText("0.00");

        jbtGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jbtGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jbtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disquete.png"))); // NOI18N
        jbtGuardar.setText("Guardar Orden");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldPago, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbtGuardar)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtGuardar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtContinuarActionPerformed
        String nroOrden = this.jTextFieldOrden.getText().trim();
        if (nroOrden.equals("")) {
            JOptionPane.showMessageDialog(this, "Escriba un Nro de Orden.", "Orden de Pedido", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Llamado_BD datOP = new Llamado_BD();
                Pedido objOP = datOP.buscarXNroOrden(nroOrden);
                this.limpiarOrden();
                if (objOP != null) {
                    //Encontró pedido! Procede a buscar el Detalle del Pedido:
                    this.ordenEdicion = objOP;
                    this.detallesEdicion = datOP.buscarDetalle(objOP.getCod_ped());
                    this.presentarDatos(objOP, this.detallesEdicion);
                    this.activarControles(true);
                    this.jComboBoxCliente.setEnabled(false);
                    this.jTextFieldOrden.setEnabled(false);
                } else {
                    this.activarControles(true);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage(), "Error en Orden de Pedido", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtContinuarActionPerformed

    private void jbtLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtLimpiarActionPerformed
        this.limpiarControles();
        this.activarControles(false);
    }//GEN-LAST:event_jbtLimpiarActionPerformed

    private void jbtAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAgregarActionPerformed
        int pos = this.jComboBoxProducto.getSelectedIndex();
        if (pos >= 0) {
            Modelo_Combo_Producto mcP = (Modelo_Combo_Producto) this.jComboBoxProducto.getModel();
            Producto_Proveedor objP = mcP.obtenerProducto();

            Detalle_Pedido objDet = new Detalle_Pedido();
            objDet.setId_produx(objP);
            objDet.setCatidad(1);
            objDet.setSubtotal(objP.getId_pord().getPrecio_prod());

            this.agregarDetalleOrden(objDet);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un producto.", "Selección de Productos", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtAgregarActionPerformed

    private void jbtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEliminarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        int[] filas = this.jTableOrdenPedido.getSelectedRows();
        for (int i = 0; i < filas.length; i++) {
            modelo.removeRow(filas[i] - i);
        }
        this.calcularTotalPagar();
    }//GEN-LAST:event_jbtEliminarActionPerformed

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        DefaultTableModel mtProd = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        int cantElem = mtProd.getRowCount();
        InsertarBD datOP = new InsertarBD();
        EditarBD datDOP = new EditarBD();
        Eliminar_BD eliDOP = new Eliminar_BD();

        if (cantElem > 0) {
            Modelo_Combo_Cliente mcC = (Modelo_Combo_Cliente) this.jComboBoxCliente.getModel();
            Cliente objC = mcC.obtenerCliente();
            long idOP = -1;
            
            Calendar cal = Calendar.getInstance();
            Timestamp fecha_hora = new Timestamp(cal.getTimeInMillis());
            String fecha_nuevo = String.valueOf(fecha_hora);
            String Fecha = fecha_nuevo.substring(0, 19);
            String txt_info = "";

            try {
                Pedido objOP = new Pedido((int)idOP, this.jTextFieldOrden.getText(),
                    Fecha,
                    IFLogin.objEmp,
                    objC);
                
                if (this.ordenEdicion == null) {
                    idOP = datOP.insertarPedido(objOP);
                    txt_info = "creó";
                } else {
                    idOP = this.ordenEdicion.getCod_ped();
                    objOP.setCod_ped((int)idOP);
                    datDOP.editar_Pedido(objOP);
                    txt_info = "actualizó";
                }
                if (idOP > 0) {
                    objOP.setCod_ped((int) idOP);
                    //preparar los detalles de la Orden en ArrayList, obtenidos del JTable:
                    ArrayList<Detalle_Pedido> arrDet = this.obtenerDetallesOrden(objOP);

                    //Eliminar detalles anteriores:
                    eliDOP.eliminarxIDOrden((int) idOP);
                    //Insertar cada Detalle a la BD:
                    for (Detalle_Pedido dop : arrDet) {
                        datOP.insertarDetalle(dop);
                    }
                    JOptionPane.showMessageDialog(this, "Se " + txt_info + " la Orden de Pedido.", "Guardar Orden de Pedido", JOptionPane.INFORMATION_MESSAGE);
                    this.limpiarControles();
                    this.activarControles(false);
                } else {
                    System.out.println("No se agregó la Orden Pedido.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR!!!\n" + e.getMessage(), "ERROR BD", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Debe agregar productos a la Orden.", "Guardar Orden", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdenPedido;
    private javax.swing.JTextField jTextFieldOrden;
    private javax.swing.JTextField jTextFieldPago;
    private javax.swing.JButton jbtAgregar;
    private javax.swing.JButton jbtContinuar;
    private javax.swing.JButton jbtEliminar;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JButton jbtLimpiar;
    // End of variables declaration//GEN-END:variables

    @Override
    public void tableChanged(TableModelEvent e) {
        int fila = e.getFirstRow(); //Obtener fila del elem que cambió
        int columna = e.getColumn(); //Obtener columna del elem que cambió
        if (this.jTableOrdenPedido.getRowCount() > 0 && columna == 2) {
            TableModel modelo = (TableModel) e.getSource();
            Object data = modelo.getValueAt(fila, 2);
            int cantidad = (Integer) data;

            //Busco el producto dentro del ModeloComboProducto, para obtener su precio:
            String idProd = String.valueOf(modelo.getValueAt(fila, 0));
            Producto_Proveedor objP = this.buscarProduct(idProd);
            float precio = objP.getId_pord().getPrecio_prod();

            Float nuevoSubTotal = cantidad * precio; //calculo el nuevo subtotal
            modelo.setValueAt(nuevoSubTotal, fila, 3); //Actualizo el nuevo subtotal
            this.calcularTotalPagar();
        }
    }

    private ComboBoxModel combClient() {
        ArrayList<Cliente> lista = null;
        Llamado_BD llam = new Llamado_BD();
        Modelo_Combo_Cliente mcC = new Modelo_Combo_Cliente();
        try {
            lista = llam.llenar_Cliente();
            mcC.setListadoClientes(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!!!\n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
        }
        return mcC;
    }

    private ComboBoxModel combProdc() {
        ArrayList<Producto_Proveedor> lista = null;
        Llamado_BD llam = new Llamado_BD();
        Modelo_Combo_Producto mcP = new Modelo_Combo_Producto();
        try {
            lista = llam.llenar_Producto_Provee();
            mcP.setListadoProducto(lista);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!!!\n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
        }
        return mcP;
    }

    private Producto_Proveedor buscarProduct(String idProd) {
        Modelo_Combo_Producto mcp = (Modelo_Combo_Producto) this.jComboBoxProducto.getModel();
        Producto_Proveedor objP = mcp.buscarProducto(idProd);
        return objP;
    }

    private void calcularTotalPagar() {
        DefaultTableModel mtProd = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        int cantElem = mtProd.getRowCount();
        Float montoTotal = new Float(0.0);
        for (int i = 0; i < cantElem; i++) {
            montoTotal += (Float) mtProd.getValueAt(i, 3);
        }
        this.jTextFieldPago.setText(montoTotal.toString());
    }

    private int buscarDetalle(Detalle_Pedido objD) {
        int idDet = 0;
        for (Detalle_Pedido detOP : this.detallesEdicion) {
            if (detOP.getId_produx().getCod_produx() == objD.getId_produx().getCod_produx()) {
                idDet = detOP.getCod_detped();
            }
        }
        return idDet;
    }

    public void tamanioTabla() {
        TableColumnModel columnModel = this.jTableOrdenPedido.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(250);
        columnModel.getColumn(2).setPreferredWidth(40);
        columnModel.getColumn(3).setPreferredWidth(70);
    }

    private void limpiarOrden() {
        this.jComboBoxCliente.setSelectedIndex(-1);
        this.jComboBoxProducto.setSelectedIndex(-1);
        this.jTextFieldPago.setText("0.00");

        DefaultTableModel modelo = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        modelo.setRowCount(0);

        this.ordenEdicion = null;
        this.detallesEdicion = null;
    }

    private void activarControles(boolean valor) {
        this.jComboBoxCliente.setEnabled(valor);
        this.jComboBoxProducto.setEnabled(valor);
        this.jbtAgregar.setEnabled(valor);
        this.jTableOrdenPedido.setEnabled(valor);
        this.jbtEliminar.setEnabled(valor);
        this.jTextFieldPago.setEnabled(valor);
        this.jbtGuardar.setEnabled(valor);
        this.jbtLimpiar.setEnabled(valor);
    }

    private void limpiar() {
        this.jComboBoxCliente.setSelectedIndex(-1);
        this.jComboBoxProducto.setSelectedIndex(-1);
        this.jTextFieldPago.setText("0.00");

        DefaultTableModel modelo = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        modelo.setRowCount(0);

        this.ordenEdicion = null;
        this.detallesEdicion = null;
    }

    private void limpiarControles() {
        this.jTextFieldOrden.setText("");
        this.limpiarOrden();
    }

    private void presentarDatos(Pedido objOP, ArrayList<Detalle_Pedido> detallesEdicion) {
        Modelo_Combo_Cliente mcC = (Modelo_Combo_Cliente) this.jComboBoxCliente.getModel();
        mcC.seleccionarCliente(objOP.getId_clie());

        for (Detalle_Pedido dop : detallesEdicion) {
            this.agregarDetalleOrden(dop);
        }
    }

    private void agregarDetalleOrden(Detalle_Pedido dop) {
        String idProd = dop.getId_produx().getId_pord().getCode();
        String str_prod = dop.getId_produx().getId_pord().toString();
        int cant = dop.getCatidad();
        float subtotal = dop.getSubtotal();

        DefaultTableModel mtProd = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        if (this.buscar(idProd) == 1) {
            mtProd.addRow(new Object[]{idProd, str_prod, cant, subtotal});
        } else {
            JOptionPane.showMessageDialog(this, "ERROR!!!\n El Producto ya se encuentra en operación", "ERROR", JOptionPane.WARNING_MESSAGE);
        }

        this.calcularTotalPagar();
    }

    private int buscar(String cod) {
        //Retornara 0 si existe el producto y 1 si no existe
        int busca = 0;
        boolean existe = false;
        DefaultTableModel mtProd = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        if (mtProd.getRowCount() > 0) {
            for (int i = 0; i < mtProd.getRowCount(); i++) {
                if (mtProd.getValueAt(i, 0).equals(cod)) {
                    existe = true;
                    break;
                }
            }
            if (existe == true) {
                busca = 0;
            } else {
                busca = 1;
            }
        } else {
            busca = 1;
        }
        return busca;
    }

    private ArrayList<Detalle_Pedido> obtenerDetallesOrden(Pedido objOP) {
        ArrayList listDet = new ArrayList();
        DefaultTableModel mtProd = (DefaultTableModel) this.jTableOrdenPedido.getModel();
        int cantElem = mtProd.getRowCount();
        Detalle_Pedido objDet = null;

        for (int fila = 0; fila < cantElem; fila++) {
            objDet = new Detalle_Pedido();
            String idProd = String.valueOf(mtProd.getValueAt(fila, 0));
            
            objDet.setCatidad((Integer) mtProd.getValueAt(fila, 2));
            objDet.setSubtotal((Float) mtProd.getValueAt(fila, 3));
            objDet.setId_produx(this.buscarProduct(idProd));
            objDet.setId_ven(objOP);
            listDet.add(objDet);
        }
        return listDet;
    }
}