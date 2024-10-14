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
import javax.swing.BoxLayout;
import javax.swing.JOptionPane;
import medicamentosbd.Paneles.ActualizarDatos;
import medicamentosbd.Paneles.BorrarDatos;
import medicamentosbd.Paneles.Insertar;
import medicamentosbd.Paneles.TablaDatos;

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
        this.M_Adm=M_Adm; 
        this.M_Comp=M_Comp;
        this.M_Ing=M_Ing; 
        this.M_Lis=M_Lis;
        this.M_Medicamento=M_Medicamento;
        this.M_Pac=M_Pac; 
        this.M_Per=M_Per;
        this.M_Pres=M_Pres;
        this.M_Pri=M_Pri;
        JP_Contenido.setLayout(new BoxLayout(this.JP_Contenido, BoxLayout.Y_AXIS));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        B_Insertar = new javax.swing.JToggleButton();
        B_VerDatos = new javax.swing.JToggleButton();
        B_Actualizar = new javax.swing.JToggleButton();
        B_Borrar = new javax.swing.JToggleButton();
        JP_Contenido = new javax.swing.JPanel();

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

        B_VerDatos.setText("Ver Datos");
        B_VerDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_VerDatosActionPerformed(evt);
            }
        });

        B_Actualizar.setText("Actualizar Datos");
        B_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_ActualizarActionPerformed(evt);
            }
        });

        B_Borrar.setText("Borrar Datos");
        B_Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JP_ContenidoLayout = new javax.swing.GroupLayout(JP_Contenido);
        JP_Contenido.setLayout(JP_ContenidoLayout);
        JP_ContenidoLayout.setHorizontalGroup(
            JP_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 488, Short.MAX_VALUE)
        );
        JP_ContenidoLayout.setVerticalGroup(
            JP_ContenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 423, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JP_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(B_Insertar)
                                .addGap(18, 18, 18)
                                .addComponent(B_VerDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(B_Actualizar)
                                .addGap(18, 18, 18)
                                .addComponent(B_Borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                    .addComponent(B_VerDatos)
                    .addComponent(B_Actualizar)
                    .addComponent(B_Borrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JP_Contenido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B_InsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InsertarActionPerformed
        JP_Contenido.removeAll();
        if(this.B_Insertar.isSelected()){
            JP_Contenido.add(new Insertar(M_Adm,M_Comp,M_Ing,M_Lis,M_Medicamento,M_Pac,M_Per,M_Pres,M_Pri));
        }
        
        JP_Contenido.revalidate();
        JP_Contenido.repaint();
    }//GEN-LAST:event_B_InsertarActionPerformed

    private void B_VerDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_VerDatosActionPerformed
        JP_Contenido.removeAll();
        if(this.B_VerDatos.isSelected()){
            this.JP_Contenido.add(new TablaDatos(M_Adm,M_Comp,M_Ing,M_Lis,M_Medicamento,M_Pac,M_Per,M_Pres,M_Pri));
        }
        JP_Contenido.revalidate();
        JP_Contenido.repaint();
    }//GEN-LAST:event_B_VerDatosActionPerformed

    private void B_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_ActualizarActionPerformed
        JP_Contenido.removeAll();
        if(this.B_Actualizar.isSelected()){
            this.JP_Contenido.add(new ActualizarDatos(M_Adm, M_Comp, M_Ing, M_Lis, M_Medicamento, M_Pac, M_Per, M_Pres, M_Pri));
        }
        JP_Contenido.revalidate();
        JP_Contenido.repaint();
    }//GEN-LAST:event_B_ActualizarActionPerformed

    private void B_BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BorrarActionPerformed
        JP_Contenido.removeAll();
        if(this.B_Borrar.isSelected()){
            this.JP_Contenido.add(new BorrarDatos(M_Adm, M_Comp, M_Ing, M_Lis, M_Medicamento, M_Pac, M_Per, M_Pres, M_Pri));
        }
        JP_Contenido.revalidate();
        JP_Contenido.repaint();
    }//GEN-LAST:event_B_BorrarActionPerformed

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
    private javax.swing.JToggleButton B_Actualizar;
    private javax.swing.JToggleButton B_Borrar;
    private javax.swing.JToggleButton B_Insertar;
    private javax.swing.JToggleButton B_VerDatos;
    private javax.swing.JPanel JP_Contenido;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
