
package Confirmacion;

import Controlador.Modelo_Paciente;


public class JFConfirmaPaciente extends javax.swing.JFrame {

    Modelo_Paciente Paciente;
    String Nombre;
    String Nss;
    String Estatura;
    String Peso;
    String Ingreso;
    
    public JFConfirmaPaciente(Modelo_Paciente Paciente, String nombre, String nss, String estatura, String peso, String Ingreso) {
        initComponents();
        this.Nombre = nombre;
        this.Nss = nss;
        this.Estatura = estatura;
        this.Peso = peso;
        
        this.NombreConfirma.setText(nombre);
        this.NSSConfirma.setText(nss);
        this.EstaturaConfirma.setText(estatura + " mts");
        this.PesoConfirma.setText(peso +" kg");
        this.IngresoConfirma.setText(Ingreso);
   }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblPeso = new javax.swing.JLabel();
        lblEstatura = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        NSSConfirma = new javax.swing.JLabel();
        NombreConfirma = new javax.swing.JLabel();
        PesoConfirma = new javax.swing.JLabel();
        EstaturaConfirma = new javax.swing.JLabel();
        ConfirmaBtn = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();
        lblIngreso = new javax.swing.JLabel();
        IngresoConfirma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Confirmar Datos del Paciente");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("NSS: ");

        lblPeso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPeso.setText("Peso: ");

        lblEstatura.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblEstatura.setText("Estatura: ");

        lblNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblNombre.setText("Nombre del Paciente:");

        NSSConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NSSConfirma.setText("lbalenss");

        NombreConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreConfirma.setText("label name");

        PesoConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PesoConfirma.setText("labelpeso");

        EstaturaConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EstaturaConfirma.setText("labelEstat");

        ConfirmaBtn.setText("Enviar");
        ConfirmaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaBtnActionPerformed(evt);
            }
        });

        RegresarBtn.setText("Regresar");
        RegresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarBtnActionPerformed(evt);
            }
        });

        lblIngreso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblIngreso.setText("Ingreso correspondiente:");

        IngresoConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IngresoConfirma.setText("labelIng");

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelContenedorLayout.createSequentialGroup()
                                .addComponent(lblEstatura)
                                .addGap(18, 18, 18)
                                .addComponent(EstaturaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addComponent(RegresarBtn))
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmaBtn))
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContenedorLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel1))
                            .addGroup(PanelContenedorLayout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NombreConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                                        .addComponent(lblPeso)
                                        .addGap(18, 18, 18)
                                        .addComponent(PesoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                                        .addComponent(lblIngreso)
                                        .addGap(29, 29, 29)
                                        .addComponent(IngresoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(48, 48, 48)
                                        .addComponent(NSSConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 33, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(NombreConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NSSConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPeso)
                    .addComponent(EstaturaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PesoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstatura))
                .addGap(27, 27, 27)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIngreso)
                    .addComponent(IngresoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConfirmaBtn)
                    .addComponent(RegresarBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelContenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfirmaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaBtnActionPerformed
        // TODO add your handling code here:
        Paciente.InitializeInstance(Integer.parseInt(Nss), Nombre, Integer.parseInt(Estatura), Integer.parseInt(Peso));
        Paciente.RelationshipPaciente_Ingreso(Nombre, Ingreso);
    }//GEN-LAST:event_ConfirmaBtnActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_RegresarBtnActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFConfirmaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConfirmaBtn;
    private javax.swing.JLabel EstaturaConfirma;
    private javax.swing.JLabel IngresoConfirma;
    private javax.swing.JLabel NSSConfirma;
    private javax.swing.JLabel NombreConfirma;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JLabel PesoConfirma;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblEstatura;
    private javax.swing.JLabel lblIngreso;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPeso;
    // End of variables declaration//GEN-END:variables
}
