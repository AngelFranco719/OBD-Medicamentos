package medicamentosbd;
import Vistas.Inserts.*;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Medicamento;
import Controlador.Modelo_Paciente;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Prescripcion;
import Controlador.Modelo_PrincipioActivo;

public class MenuPrincipal extends javax.swing.JFrame {
    Modelo_Administracion M_Adm; 
    Modelo_Composicion M_Comp; 
    Modelo_Ingreso M_Ing; 
    Modelo_Lista M_Lis; 
    Modelo_Medicamento M_Medicamento; 
    Modelo_Paciente M_Pac;
    Modelo_Personal M_Per;
    Modelo_Prescripcion M_Pres;
    Modelo_PrincipioActivo M_Pri; 
    public MenuPrincipal(Modelo_Administracion M_Adm, Modelo_Composicion M_Comp, Modelo_Ingreso M_Ing, 
            Modelo_Lista M_Lis,Modelo_Medicamento M_Medicamento,Modelo_Paciente M_Pac,Modelo_Personal M_Per,
            Modelo_Prescripcion M_Pres,Modelo_PrincipioActivo M_Pri) {
        initComponents();
        this.P_Insertar.setVisible(false);
        this.M_Adm=M_Adm; 
        this.M_Comp=M_Comp;
        this.M_Ing=M_Ing; 
        this.M_Lis=M_Lis;
        this.M_Medicamento=M_Medicamento;
        this.M_Pac=M_Pac; 
        this.M_Per=M_Per;
        this.M_Pres=M_Pres;
        this.M_Pri=M_Pri;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        B_Insertar = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        P_Insertar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cb_Tablas = new javax.swing.JComboBox<>();
        B_Formulario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(5, 22, 130));
        jLabel1.setText("Sistema de Gestión de Medicamentos: ");

        B_Insertar.setText("Insertar Datos");
        B_Insertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InsertarActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Ver Datos");

        jToggleButton3.setText("Actualizar Datos");

        jToggleButton4.setText("Borrar Datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Selecciona una Tabla:");

        Cb_Tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        B_Formulario.setText("Ver Formulario");
        B_Formulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_FormularioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout P_InsertarLayout = new javax.swing.GroupLayout(P_Insertar);
        P_Insertar.setLayout(P_InsertarLayout);
        P_InsertarLayout.setHorizontalGroup(
            P_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_InsertarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cb_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(B_Formulario)
                .addContainerGap(70, Short.MAX_VALUE))
        );
        P_InsertarLayout.setVerticalGroup(
            P_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(P_InsertarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(P_InsertarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Cb_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Formulario))
                .addContainerGap(123, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_Insertar)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(P_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B_Insertar)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jToggleButton4))
                .addGap(18, 18, 18)
                .addComponent(P_Insertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InsertarActionPerformed
        String[] Tablas={
            "Administracion", "Composicion", "Ingreso", "Lista", "Medicamento",
            "Paciente", "Personal", "Prescripcion", "PrincipioActivo"
        };
        this.Cb_Tablas.removeAllItems();
        for(String tabla : Tablas){
            Cb_Tablas.addItem(tabla);
        }
        this.P_Insertar.setVisible(true);
    }//GEN-LAST:event_B_InsertarActionPerformed

    private void B_FormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_FormularioActionPerformed
        String Tabla_Seleccionada=this.Cb_Tablas.getSelectedItem().toString();
        switch (Tabla_Seleccionada){
            case "Administracion":
                Formulario_Insert_Administracion Administracion=new Formulario_Insert_Administracion(M_Adm,M_Per,M_Lis);
                Administracion.setVisible(true);
                break; 
            case "Composicion":
                Formulario_Insert_Composicion Composicion=new Formulario_Insert_Composicion(M_Comp,M_Medicamento,M_Pri);
                Composicion.setVisible(true);
                break;
            case "Ingreso":
                JFIngreso Ingreso=new JFIngreso();
                Ingreso.setVisible(true);
                break;
            case "Lista":
                Formulario_Insert_Lista Lista=new Formulario_Insert_Lista(M_Lis, M_Medicamento,M_Pres,M_Adm); 
                Lista.setVisible(true);
                break; 
            case "Medicamento":
                Formulario_Insert_Medicamento Medicamento=new Formulario_Insert_Medicamento(M_Medicamento,M_Comp);
                Medicamento.setVisible(true);
                break; 
            case "Paciente":
                JFPaciente Paciente=new JFPaciente(); 
                Paciente.setVisible(true);
                break;
            case "Personal":
                JFPersonal Personal=new JFPersonal();
                Personal.setVisible(true);
                break; 
            case "Prescripcion":
                JFPrescripcion Prescripcion=new JFPrescripcion();
                Prescripcion.setVisible(true);
                break;
            case "PrincipioActivo":
                Formulario_Insert_Activos Activos=new Formulario_Insert_Activos(M_Pri,M_Comp); 
                Activos.setVisible(true);
                break; 
               
        }
    }//GEN-LAST:event_B_FormularioActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Formulario;
    private javax.swing.JToggleButton B_Insertar;
    private javax.swing.JComboBox<String> Cb_Tablas;
    private javax.swing.JPanel P_Insertar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    // End of variables declaration//GEN-END:variables
}
