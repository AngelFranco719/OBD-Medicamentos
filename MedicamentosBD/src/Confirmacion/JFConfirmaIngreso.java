
package Confirmacion;
import Controlador.Modelo_Ingreso;

public class JFConfirmaIngreso extends javax.swing.JFrame {

    Modelo_Ingreso Ingreso;
    String codigo;
    String numero;
    String Sintomas;
    String Diagnostico;
    String fechaEntrada;
    String fechaSalida;
    String paciente;

    public JFConfirmaIngreso(Modelo_Ingreso ingreso, String codigo,String numero, String Sintomas, String diagnostico ,String fechaEntrada, String fechaSalida, String paciente) {
        initComponents();
        this.Ingreso = ingreso;
        this.codigo = codigo;
        this.numero = numero;
        this.Sintomas = Sintomas;
        this.Diagnostico = diagnostico;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.paciente = paciente;
        
        this.NumIngresoConfirma.setText(numero);
        this.SintomasConfirma.setText(Sintomas);
        this.DiagnosticosConfirma.setText(Diagnostico);
        this.FechaEntradaConfirma.setText(fechaEntrada);
        this.FechaSalidaConfirma.setText(fechaSalida);
        this.pacienteConfirma.setText(paciente);
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SintomasConfirma = new javax.swing.JTextArea();
        NumIngresoConfirma = new javax.swing.JLabel();
        FechaEntradaConfirma = new javax.swing.JLabel();
        FechaSalidaConfirma = new javax.swing.JLabel();
        lblPaciente = new javax.swing.JLabel();
        pacienteConfirma = new javax.swing.JLabel();
        ConfirmaBtn = new javax.swing.JButton();
        RegresarBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        DiagnosticosConfirma = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelContenedor.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Confirma Datos del Ingreso");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Numero de ingreso: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sintomas: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de Entrada: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de Salida: ");

        SintomasConfirma.setEditable(false);
        SintomasConfirma.setColumns(20);
        SintomasConfirma.setRows(5);
        jScrollPane1.setViewportView(SintomasConfirma);

        NumIngresoConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NumIngresoConfirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NumIngresoConfirma.setText("labelNI");

        FechaEntradaConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaEntradaConfirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaEntradaConfirma.setText("labelFE");

        FechaSalidaConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaSalidaConfirma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FechaSalidaConfirma.setText("labelFS");

        lblPaciente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPaciente.setText("Paciente:");

        pacienteConfirma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pacienteConfirma.setText("labelpac");

        ConfirmaBtn.setText("Confirmar");
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

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Diagnóstico:");

        DiagnosticosConfirma.setEditable(false);
        DiagnosticosConfirma.setColumns(20);
        DiagnosticosConfirma.setRows(5);
        jScrollPane2.setViewportView(DiagnosticosConfirma);

        javax.swing.GroupLayout PanelContenedorLayout = new javax.swing.GroupLayout(PanelContenedor);
        PanelContenedor.setLayout(PanelContenedorLayout);
        PanelContenedorLayout.setHorizontalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(RegresarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ConfirmaBtn))
                    .addGroup(PanelContenedorLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(PanelContenedorLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addGroup(PanelContenedorLayout.createSequentialGroup()
                                            .addComponent(jLabel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(NumIngresoConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6)
                                        .addGroup(PanelContenedorLayout.createSequentialGroup()
                                            .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(FechaEntradaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(PanelContenedorLayout.createSequentialGroup()
                                                    .addGap(22, 22, 22)
                                                    .addComponent(jLabel4)))
                                            .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel5)
                                                    .addGap(75, 75, 75))
                                                .addGroup(PanelContenedorLayout.createSequentialGroup()
                                                    .addGap(66, 66, 66)
                                                    .addComponent(FechaSalidaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(PanelContenedorLayout.createSequentialGroup()
                                            .addComponent(lblPaciente)
                                            .addGap(31, 31, 31)
                                            .addComponent(pacienteConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 40, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelContenedorLayout.setVerticalGroup(
            PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelContenedorLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NumIngresoConfirma))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelContenedorLayout.createSequentialGroup()
                        .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelContenedorLayout.createSequentialGroup()
                                .addGroup(PanelContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FechaEntradaConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FechaSalidaConfirma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(pacienteConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPaciente, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(42, 42, 42)
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
        Ingreso.InitializeInstance(codigo, Integer.parseInt(numero), Sintomas, Diagnostico, fechaEntrada, fechaSalida);
        Ingreso.RelationshipIngreso_Paciente(codigo, paciente);
        Ingreso.InsertToBD(codigo);
    }//GEN-LAST:event_ConfirmaBtnActionPerformed

    private void RegresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarBtnActionPerformed
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
            java.util.logging.Logger.getLogger(JFConfirmaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFConfirmaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
    private javax.swing.JTextArea DiagnosticosConfirma;
    private javax.swing.JLabel FechaEntradaConfirma;
    private javax.swing.JLabel FechaSalidaConfirma;
    private javax.swing.JLabel NumIngresoConfirma;
    private javax.swing.JPanel PanelContenedor;
    private javax.swing.JButton RegresarBtn;
    private javax.swing.JTextArea SintomasConfirma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblPaciente;
    private javax.swing.JLabel pacienteConfirma;
    // End of variables declaration//GEN-END:variables
}
