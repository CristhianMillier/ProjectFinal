package Interfaces;

import Clases.*;
import Coneccion_BD.InsertarBD;
import Modelo.Tamaño_TextField;
import javax.swing.JOptionPane;

public class IFRegistroProducto extends javax.swing.JInternalFrame {

    public IFRegistroProducto() {
        initComponents();
        this.cargar_combos();
        this.validar_tamañoTexto();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jComboBoxProvee = new javax.swing.JComboBox<>();
        jbtGuardar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jbtSalir = new javax.swing.JButton();
        jSpinnerPrecio = new javax.swing.JSpinner();
        jComboBoxMarca = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setTitle("Registro Producto");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripción:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stock:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Precio:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Marca:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Proveedor:");

        jTextFieldStock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldStockKeyTyped(evt);
            }
        });

        jComboBoxProvee.setBackground(new java.awt.Color(0, 0, 51));
        jComboBoxProvee.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxProvee.setForeground(new java.awt.Color(255, 255, 255));

        jbtGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jbtGuardar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jbtGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardaa.png"))); // NOI18N
        jbtGuardar.setText("Guardar");
        jbtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtGuardarActionPerformed(evt);
            }
        });

        jbtCancelar.setBackground(java.awt.Color.red);
        jbtCancelar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jbtCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelar.png"))); // NOI18N
        jbtCancelar.setText("Cancelar");
        jbtCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCancelarActionPerformed(evt);
            }
        });

        jbtSalir.setBackground(new java.awt.Color(0, 0, 0));
        jbtSalir.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtSalir.setForeground(new java.awt.Color(255, 255, 255));
        jbtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salida-de-emergencia.png"))); // NOI18N
        jbtSalir.setText("Salir");
        jbtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalirActionPerformed(evt);
            }
        });

        jComboBoxMarca.setBackground(new java.awt.Color(0, 0, 51));
        jComboBoxMarca.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jComboBoxMarca.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProvee, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(jTextFieldStock, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jbtSalir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jSpinnerPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBoxMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxProvee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtGuardar)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldStockKeyTyped
        this.validar_llenado(evt);
    }//GEN-LAST:event_jTextFieldStockKeyTyped

    private void jbtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtGuardarActionPerformed
        if (this.validar() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor!!!\nComplete todos los campos", "Validar Llenado", JOptionPane.WARNING_MESSAGE);
        } else {
            Producto_Proveedor objPP = new Producto_Proveedor(
                    this.jComboBoxProvee.getItemAt(this.jComboBoxProvee.getSelectedIndex()), new Producto(
                    this.jTextFieldCodigo.getText(), this.jTextFieldNombre.getText(),
                    Integer.parseInt(this.jTextFieldStock.getText()),
                    Float.parseFloat(this.jSpinnerPrecio.getValue().toString()),
                    this.jComboBoxMarca.getItemAt(this.jComboBoxMarca.getSelectedIndex())));
            try {
                InsertarBD ins = new InsertarBD();
                ins.agregar_Produc_Provee(objPP);
                Escritorio.cargar_datos_Producto();
                JOptionPane.showMessageDialog(null, "Inserción exitosa!!!\n", "Inserción", JOptionPane.INFORMATION_MESSAGE);
                this.limpiar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR: \n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtGuardarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.limpiar();
    }//GEN-LAST:event_jbtCancelarActionPerformed

    private void jbtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbtSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Marca> jComboBoxMarca;
    private javax.swing.JComboBox<Proveedor> jComboBoxProvee;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerPrecio;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldStock;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtGuardar;
    private javax.swing.JButton jbtSalir;
    // End of variables declaration//GEN-END:variables

    private void cargar_combos() {
        this.jComboBoxMarca.removeAllItems();
        this.jComboBoxProvee.removeAllItems();
        //Cargar combo Marca
        Marca objM = new Marca();
        objM.setNomb_mar("-Seleccione-");
        this.jComboBoxMarca.addItem(objM);
        try {
            objM.mostrar_Marca(this.jComboBoxMarca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!!!\n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
        }
        //Cargar combo Proveedor
        Proveedor objP = new Proveedor();
        objP.setNomb_provee("-Seleccione-");
        this.jComboBoxProvee.addItem(objP);
        try {
            objP.mostrar_Proveedor(this.jComboBoxProvee);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR!!!\n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void validar_tamañoTexto() {
        this.jTextFieldCodigo.setDocument(new Tamaño_TextField(this.jTextFieldCodigo, 20));
        this.jTextFieldNombre.setDocument(new Tamaño_TextField(this.jTextFieldNombre, 50));
        this.jTextFieldStock.setDocument(new Tamaño_TextField(this.jTextFieldStock, 3));
    }

    private void validar_llenado(java.awt.event.KeyEvent evt) {
        char validar = evt.getKeyChar();
        if (Character.isLetter(validar)) {
            getToolkit().beep();
            evt.consume();
        }
    }

    private int validar() {
        int lleno = 0;
        if (this.jTextFieldNombre.getText().trim().equals("")
                || this.jTextFieldStock.getText().trim().equals("")
                || this.jTextFieldCodigo.getText().trim().equals("")
                || this.jSpinnerPrecio.getValue().toString().equals("0")
                || this.jComboBoxMarca.getSelectedIndex() == 0
                || this.jComboBoxProvee.getSelectedIndex() == 0) {
            return lleno;
        } else {
            lleno = 1;
        }
        return lleno;
    }

    private void limpiar() {
        this.jTextFieldNombre.setText("");
        this.jTextFieldStock.setText("");
        this.jTextFieldCodigo.setText("");
        this.jSpinnerPrecio.setValue(0);
        this.jComboBoxMarca.setSelectedIndex(0);
        this.jComboBoxProvee.setSelectedIndex(0);
    }
}
