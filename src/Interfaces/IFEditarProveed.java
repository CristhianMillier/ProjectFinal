package Interfaces;

import Clases.Proveedor;
import Coneccion_BD.EditarBD;
import Modelo.Tamaño_TextField;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumnModel;



public class IFEditarProveed extends javax.swing.JInternalFrame {

    private Proveedor objP = null;
    
    public IFEditarProveed() {
        initComponents();
        this.validar_tamañoTexto();
        this.definir_tamaño_columna();
        this.activar_controles(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCiudad = new javax.swing.JTextField();
        jTextFieldTelef = new javax.swing.JTextField();
        jbtActualizar = new javax.swing.JButton();
        jbtCancelar = new javax.swing.JButton();
        jTextFieldDirecc = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProveed = new javax.swing.JTable();
        jTextFieldBuscar = new javax.swing.JTextField();
        jbtBuscar = new javax.swing.JButton();
        jbtEditar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Editar Proveedor");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel2.setText("Dirección:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel3.setText("Teléfono:");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel4.setText("Ciudad:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N
        jLabel5.setText("Compañia:");

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });

        jTextFieldCiudad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldCiudad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCiudadKeyTyped(evt);
            }
        });

        jTextFieldTelef.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextFieldTelef.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldTelefKeyTyped(evt);
            }
        });

        jbtActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jbtActualizar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jbtActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        jbtActualizar.setText("Actualizar");
        jbtActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtActualizarActionPerformed(evt);
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

        jTextFieldDirecc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTelef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCiudad)
                            .addComponent(jTextFieldDirecc))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jbtCancelar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldTelef, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtCancelar)
                    .addComponent(jbtActualizar))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista Proveedor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jTableProveed.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTableProveed.setModel(Escritorio.MTP);
        jTableProveed.getTableHeader().setResizingAllowed(false);
        jTableProveed.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableProveed);

        jTextFieldBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextFieldBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBuscarKeyTyped(evt);
            }
        });

        jbtBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jbtBuscar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jbtBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar.png"))); // NOI18N
        jbtBuscar.setText("Buscar");
        jbtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBuscarActionPerformed(evt);
            }
        });

        jbtEditar.setBackground(new java.awt.Color(0, 0, 0));
        jbtEditar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jbtEditar.setForeground(new java.awt.Color(255, 255, 255));
        jbtEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        jbtEditar.setText("Editar");
        jbtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(jbtEditar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtBuscar)
                    .addComponent(jbtEditar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        this.validar_llenado(evt, 2);
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

    private void jTextFieldCiudadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCiudadKeyTyped
        this.validar_llenado(evt, 2);
    }//GEN-LAST:event_jTextFieldCiudadKeyTyped

    private void jTextFieldTelefKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldTelefKeyTyped
        this.validar_llenado(evt, 1);
    }//GEN-LAST:event_jTextFieldTelefKeyTyped

    private void jTextFieldBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBuscarKeyTyped
        this.validar_llenado(evt, 2);
    }//GEN-LAST:event_jTextFieldBuscarKeyTyped

    private void jbtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBuscarActionPerformed
        boolean existe = false;
        String buscar = this.jTextFieldBuscar.getText().trim();
        if (buscar.equals("")) {
            JOptionPane.showMessageDialog(this, "Ingrese el nombre de la Compañia!!", "Buscar Proveedor", JOptionPane.WARNING_MESSAGE);
        }else{
            for (int i = 0; i < Escritorio.MTP.getRowCount(); i++) {
                if (Escritorio.MTP.getValueAt(i, 0).equals(buscar)) {
                    existe = true;
                    this.jTableProveed.changeSelection(i, 1, false, false);
                    this.jTextFieldBuscar.setText("");
                }
            }
            if (existe == false) {
                JOptionPane.showMessageDialog(this, "La Compañia ingresada no existe.", "Buscar Proveedor", JOptionPane.INFORMATION_MESSAGE);
                this.jTextFieldBuscar.setText("");
            }
        }
    }//GEN-LAST:event_jbtBuscarActionPerformed

    private void jbtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtEditarActionPerformed
        int fila = this.jTableProveed.getSelectedRow();
        if (fila != -1) {
            this.objP = Escritorio.MTP.getProveedor(fila);
            this.cargarFormulario(objP);
            this.activar_controles(true);
            try {
                Escritorio.cargar_datos_Proveedor();
            } catch (Exception ex) {
                Logger.getLogger(IFEditarProveed.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un elemento de la tabla", "Editar Proveedor", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jbtEditarActionPerformed

    private void jbtActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtActualizarActionPerformed
        if (this.validar() == 0) {
            JOptionPane.showMessageDialog(this, "Porfavor!!!\nComplete todos los campos", "Validar Llenado", JOptionPane.WARNING_MESSAGE);
        } else {
            Proveedor objPro = new Proveedor(this.jTextFieldNombre.getText(),
                    this.jTextFieldDirecc.getText(),
                    this.jTextFieldTelef.getText(),
                    this.jTextFieldCiudad.getText());
            int id = this.objP.getCod_provee();
            objPro.setCod_provee(id);
            try {
                EditarBD edit = new EditarBD();
                edit.editar_Proveed(objP);
                Escritorio.cargar_datos_Proveedor();
                JOptionPane.showMessageDialog(null, "Edicción exitosa!!!\n", "Editar Proveedor", JOptionPane.INFORMATION_MESSAGE);
                this.limpiar();
                this.activar_controles(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR: \n" + e.getMessage(), "Error BD", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbtActualizarActionPerformed

    private void jbtCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCancelarActionPerformed
        this.limpiar();
        this.activar_controles(false);
    }//GEN-LAST:event_jbtCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProveed;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCiudad;
    private javax.swing.JTextField jTextFieldDirecc;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelef;
    private javax.swing.JButton jbtActualizar;
    private javax.swing.JButton jbtBuscar;
    private javax.swing.JButton jbtCancelar;
    private javax.swing.JButton jbtEditar;
    // End of variables declaration//GEN-END:variables

    private void validar_llenado(java.awt.event.KeyEvent evt, int opc) {
        //opc: 1 es para ingresar solo números
        //opc: 2 es para ingresar solo letras
        if (opc == 1) {
            char validar = evt.getKeyChar();
            if (Character.isLetter(validar)) {
                getToolkit().beep(); //sonido de alerta
                evt.consume();
            }
        }
        if (opc == 2) {
            char validar = evt.getKeyChar();
            if (Character.isDigit(validar)) {
                getToolkit().beep(); //sonido de alerta
                evt.consume();
            }
        }
    }
    private void validar_tamañoTexto() {
        this.jTextFieldNombre.setDocument(new Tamaño_TextField(this.jTextFieldNombre, 50));
        this.jTextFieldDirecc.setDocument(new Tamaño_TextField(this.jTextFieldDirecc, 50));
        this.jTextFieldTelef.setDocument(new Tamaño_TextField(this.jTextFieldTelef, 9));
        this.jTextFieldCiudad.setDocument(new Tamaño_TextField(jTextFieldCiudad, 20));
    }
    private void limpiar() {
        this.jTextFieldNombre.setText("");
        this.jTextFieldDirecc.setText("");
        this.jTextFieldTelef.setText("");
        this.jTextFieldCiudad.setText("");
        
        this.objP = null;
    }
    private int validar() {
        int lleno = 0;
        if (this.jTextFieldNombre.getText().trim().equals("")
                || this.jTextFieldDirecc.getText().trim().equals("")
                || this.jTextFieldTelef.getText().trim().equals("")
                || this.jTextFieldCiudad.getText().trim().equals("")) {

            return lleno;

        } else {
            lleno = 1;
        }
        return lleno;
    }
    private void definir_tamaño_columna() {
        TableColumnModel columnModel = this.jTableProveed.getColumnModel();

        columnModel.getColumn(0).setPreferredWidth(400);
        columnModel.getColumn(1).setPreferredWidth(500);
        columnModel.getColumn(2).setPreferredWidth(200);
        columnModel.getColumn(3).setPreferredWidth(150);
    }
    public void activar_controles(boolean estado){
        this.jTextFieldNombre.setEnabled(estado);
        this.jTextFieldDirecc.setEnabled(estado);
        this.jTextFieldTelef.setEnabled(estado);
        this.jTextFieldCiudad.setEnabled(estado);
        this.jbtActualizar.setEnabled(estado);
        this.jbtCancelar.setEnabled(estado);
        
        this.jbtEditar.setEnabled(!estado);
        this.jTextFieldBuscar.setEnabled(!estado);
        this.jbtBuscar.setEnabled(!estado);
        this.jTableProveed.setEnabled(!estado);
    }

    private void cargarFormulario(Proveedor objP) {
        this.jTextFieldNombre.setText(objP.getNomb_provee());
        this.jTextFieldDirecc.setText(objP.getDirec_provee());
        this.jTextFieldTelef.setText(objP.getTelef_provee());
        this.jTextFieldCiudad.setText(objP.getCiud_provee());
    }
}