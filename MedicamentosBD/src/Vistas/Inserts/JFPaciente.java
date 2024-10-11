
package Vistas.Inserts;

import Confirmacion.JFConfirmaPaciente;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Paciente;
import javax.swing.*;
import java.util.List;

public class JFPaciente extends javax.swing.JFrame {

    Modelo_Paciente Paciente;
    Modelo_Ingreso Ingreso;
    public JFPaciente(Modelo_Paciente Paciente, Modelo_Ingreso Ingreso) {
        initComponents();
        this.Paciente = Paciente;
        this.Ingreso = Ingreso;
        this.InicializarIngresos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ContenedorPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNSS = new javax.swing.JTextField();
        txtNombre_Pact = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNomPaterno_Pac = new javax.swing.JTextField();
        lblPaterno = new javax.swing.JLabel();
        lblMaterno = new javax.swing.JLabel();
        txtNomMaterno_Pac = new javax.swing.JTextField();
        txtPeso = new javax.swing.JTextField();
        lblPeso = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        txtEstatura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbIngreso = new javax.swing.JComboBox<>();
        Btncontinuar = new javax.swing.JButton();
        BtnCancelar = new javax.swing.JButton();
        lblPeso1 = new javax.swing.JLabel();
        lblPeso2 = new javax.swing.JLabel();
        lblErrorNombre = new javax.swing.JLabel();
        lblErrorNss = new javax.swing.JLabel();
        lblErrorEstat = new javax.swing.JLabel();
        lblErrorPeso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario del Paciente");
        setResizable(false);

        ContenedorPanel.setBackground(new java.awt.Color(254, 254, 254));
        ContenedorPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Datos del Paciente");

        jLabel2.setText("NSS: ");

        txtNSS.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        txtNombre_Pact.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblNombre.setText("Nombre");

        txtNomPaterno_Pac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPaterno.setText("Apellido Paterno");

        lblMaterno.setText("Apellido Materno");

        txtNomMaterno_Pac.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtPeso.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblPeso.setText("Peso: ");

        lblEstatura.setText("Estatura: ");

        txtEstatura.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Ingreso correspondiente:");

        cbIngreso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Btncontinuar.setText("Continuar");
        Btncontinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtncontinuarActionPerformed(evt);
            }
        });

        BtnCancelar.setText("Cancelar");
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });

        lblPeso1.setText("(kg)");

        lblPeso2.setText("(mts)");

        lblErrorNombre.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorNombre.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorNss.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorNss.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorNss.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorEstat.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorEstat.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorEstat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblErrorPeso.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorPeso.setForeground(new java.awt.Color(255, 51, 51));
        lblErrorPeso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout ContenedorPanelLayout = new javax.swing.GroupLayout(ContenedorPanel);
        ContenedorPanel.setLayout(ContenedorPanelLayout);
        ContenedorPanelLayout.setHorizontalGroup(
            ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContenedorPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btncontinuar)
                        .addGap(9, 9, 9)
                        .addComponent(BtnCancelar))
                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                        .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPeso)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                        .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNSS, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(lblPeso1)))
                                        .addGap(0, 30, Short.MAX_VALUE))
                                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                        .addComponent(lblErrorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, 0)
                                        .addComponent(lblEstatura)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblErrorEstat, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                                .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPeso2))))
                                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(lblErrorNss, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(192, 192, 192))
                    .addGroup(ContenedorPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(47, 47, 47)
                        .addComponent(cbIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorPanelLayout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ContenedorPanelLayout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(lblNombre))
                        .addComponent(txtNombre_Pact, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ContenedorPanelLayout.createSequentialGroup()
                            .addGap(16, 16, 16)
                            .addComponent(lblPaterno)
                            .addGap(50, 50, 50)
                            .addComponent(lblMaterno))
                        .addGroup(ContenedorPanelLayout.createSequentialGroup()
                            .addComponent(txtNomPaterno_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNomMaterno_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(50, Short.MAX_VALUE)))
        );
        ContenedorPanelLayout.setVerticalGroup(
            ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContenedorPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(lblErrorNss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblErrorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPeso)
                    .addComponent(txtEstatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstatura)
                    .addComponent(lblPeso1)
                    .addComponent(lblPeso2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrorEstat, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btncontinuar)
                    .addComponent(BtnCancelar))
                .addContainerGap())
            .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(ContenedorPanelLayout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNombre_Pact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomPaterno_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNomMaterno_Pac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(ContenedorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNombre)
                        .addComponent(lblPaterno)
                        .addComponent(lblMaterno))
                    .addContainerGap(133, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContenedorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ContenedorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtncontinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtncontinuarActionPerformed
        if (!validarCamposVacios()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String pac_nss = this.txtNSS.getText();
        String pac_nombre = this.txtNombre_Pact.getText().toUpperCase() + " " +
                            this.txtNomPaterno_Pac.getText().toUpperCase()+ " " + 
                            this.txtNomMaterno_Pac.getText().toUpperCase();
        String pac_estatura = this.txtEstatura.getText();
        String pac_peso = this.txtPeso.getText();
        String ingresoSeleccionado = this.cbIngreso.getSelectedItem().toString();

        // Validaciones
        if (!validarTexto(txtNombre_Pact.getText()) || !validarTexto(txtNomPaterno_Pac.getText()) || !validarTexto(txtNomMaterno_Pac.getText())) {
            mostrarError(lblErrorNombre, "Nombre inválido, solo letras.");
            return;
        }
        if (!validarEntero(txtNSS.getText())) {
            mostrarError(lblErrorNss, "NSS inválido, solo números.");
            return;
        }
        if (!validarFlotante(txtEstatura.getText())) {
            mostrarError(lblErrorEstat, "Estatura inválida");
            return;
        }
        if (!validarFlotante(txtPeso.getText())) {
            mostrarError(lblErrorPeso, "Peso inválido");
            return;
        }
        
        lblErrorNombre.setVisible(false);
        lblErrorNss.setVisible(false);
        lblErrorEstat.setVisible(false);
        lblErrorPeso.setVisible(false);
        
        JFConfirmaPaciente ventanaConfirmacion = new JFConfirmaPaciente(Paciente, pac_nombre, pac_nss, pac_estatura, pac_peso, ingresoSeleccionado);
        ventanaConfirmacion.setVisible(true);
    }//GEN-LAST:event_BtncontinuarActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelarActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    
    private void InicializarIngresos() {
        List<String>Ingresos=Ingreso.getListAttribute("ing_codigo");
        cbIngreso.removeAllItems();;
        for (String ingreso : Ingresos){
            cbIngreso.addItem(ingreso);
        }
    }
    
    public boolean validarTexto(String texto) {
        return texto.matches("[a-zA-Z\\s]+");
    }
    
    public boolean validarFlotante(String texto) {
        try {
            Double.parseDouble(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
            }   
    }
    
    public boolean validarEntero(String texto) {
        try {
            Integer.parseInt(texto);
            return true;
        } catch (NumberFormatException e) {
            return false;
            }
    }

    public void mostrarError(JLabel label, String mensaje) {
        label.setText(mensaje);
        label.setVisible(true);
    }
    
   public boolean validarCamposVacios() {       
       if (txtNombre_Pact.getText().trim().isEmpty() || 
           txtNomPaterno_Pac.getText().trim().isEmpty() ||
           txtNomMaterno_Pac.getText().trim().isEmpty() ||
           txtNSS.getText().trim().isEmpty() || 
           txtEstatura.getText().trim().isEmpty() || 
           txtPeso.getText().trim().isEmpty()) {
           return false;
       }
       return true;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton Btncontinuar;
    private javax.swing.JPanel ContenedorPanel;
    private javax.swing.JComboBox<String> cbIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblErrorEstat;
    private javax.swing.JLabel lblErrorNombre;
    private javax.swing.JLabel lblErrorNss;
    private javax.swing.JLabel lblErrorPeso;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblPeso;
    private javax.swing.JLabel lblPeso1;
    private javax.swing.JLabel lblPeso2;
    private javax.swing.JTextField txtEstatura;
    private javax.swing.JTextField txtNSS;
    private javax.swing.JTextField txtNomMaterno_Pac;
    private javax.swing.JTextField txtNomPaterno_Pac;
    private javax.swing.JTextField txtNombre_Pact;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    
}
