package Vistas.Inserts;

import Confirmacion.Confirmacion_Medicamento;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Medicamento;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Formulario_Insert_Medicamento extends javax.swing.JFrame {

    Modelo_Medicamento Medicamento; 
    Modelo_Composicion Composicion; 
    boolean actualizacion=false; 
    public Formulario_Insert_Medicamento(Modelo_Medicamento Medicamento, Modelo_Composicion Composicion) {
        initComponents();
        this.Medicamento=Medicamento;
        this.Composicion=Composicion; 
        this.InicializarComposiciones();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public Formulario_Insert_Medicamento(Modelo_Medicamento Medicamento, Modelo_Composicion Composicion,
            List<String> Atributos) {
        initComponents();
        this.Medicamento=Medicamento;
        this.Composicion=Composicion; 
        this.InicializarComposiciones();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JOptionPane.showMessageDialog(this, Atributos);
        this.Med_Codigo.setText((Atributos.get(0)));
        this.Med_Nombre.setText(Atributos.get(1));
        this.Med_Cantidad.setText(Atributos.get(2));
        this.Med_Presentacion.setText(Atributos.get(3));
        this.med_desc.setText(Atributos.get(4));
        this.Med_Codigo.setEditable(false);
        this.actualizacion=true; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        Med_Desc = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Med_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Med_Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Med_Cantidad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Med_Presentacion = new javax.swing.JTextField();
        Button_Enviar = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Cb_Composicion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        med_desc = new javax.swing.JTextArea();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("MEDICAMENTO");

        jLabel2.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Cantidad:");

        jLabel5.setText("Presentacion:");

        Button_Enviar.setText("Enviar");
        Button_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EnviarActionPerformed(evt);
            }
        });

        Button_Cancelar.setText("Cancelar");
        Button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Composicion:");

        Cb_Composicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Cb_Composicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_ComposicionActionPerformed(evt);
            }
        });

        jLabel7.setText("Descripcion:");

        med_desc.setColumns(20);
        med_desc.setRows(5);
        jScrollPane1.setViewportView(med_desc);

        javax.swing.GroupLayout Med_DescLayout = new javax.swing.GroupLayout(Med_Desc);
        Med_Desc.setLayout(Med_DescLayout);
        Med_DescLayout.setHorizontalGroup(
            Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Med_DescLayout.createSequentialGroup()
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Med_DescLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel1))
                    .addGroup(Med_DescLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Button_Enviar)
                        .addGap(18, 18, 18)
                        .addComponent(Button_Cancelar))
                    .addGroup(Med_DescLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Med_Presentacion, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                            .addComponent(Med_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Med_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Med_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cb_Composicion, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        Med_DescLayout.setVerticalGroup(
            Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Med_DescLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Med_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Med_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Med_Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Med_Presentacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(Cb_Composicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Med_DescLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addGroup(Med_DescLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(Med_DescLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Cancelar)
                    .addComponent(Button_Enviar))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Med_Desc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Med_Desc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EnviarActionPerformed
       String Codigo=this.Med_Codigo.getText();
       String Nombre=this.Med_Nombre.getText();
       String Presentacion=this.Med_Presentacion.getText();
       String Cantidad=this.Med_Cantidad.getText();
       String Composicion=this.Cb_Composicion.getSelectedItem().toString();
       String Descripcion=this.med_desc.getText();
        if(actualizacion){
           if(JOptionPane.showConfirmDialog(this, "¿Desea Actualizar los Datos?")==JOptionPane.YES_OPTION)
               Medicamento.InitializeAndUpdateInstance(Codigo, Nombre, Integer.parseInt(Cantidad), Presentacion, Descripcion, Composicion);
               
       }else{
           if (!validarCamposVacios()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            Confirmacion_Medicamento n_c=new Confirmacion_Medicamento(Medicamento,Codigo,Nombre,Cantidad,Presentacion, Composicion, Descripcion); 
            n_c.setVisible(true);
       }
        
    }//GEN-LAST:event_Button_EnviarActionPerformed

    private void Cb_ComposicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_ComposicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_ComposicionActionPerformed

    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        if(JOptionPane.OK_OPTION==JOptionPane.showConfirmDialog(this, "Los Cambios se Perderán ¿Desea salir?")){
            this.dispose(); 
        }
    }//GEN-LAST:event_Button_CancelarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario_Insert_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Medicamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }
    
    private void InicializarComposiciones(){
        List<String>Composiciones=Composicion.getListAttribute("comp_codigo");
        Cb_Composicion.removeAllItems();
        for(String composicion : Composiciones){
            Cb_Composicion.addItem(composicion);
        }   
    }
    public boolean validarCamposVacios() {       
       if (Med_Codigo.getText().trim().isEmpty() || 
           Med_Cantidad.getText().trim().isEmpty()||
           med_desc.getText().trim().isEmpty()||
           Med_Nombre.getText().trim().isEmpty() ||
           Med_Presentacion.getText().trim().isEmpty()){
           return false;
       }
       return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JButton Button_Enviar;
    private javax.swing.JComboBox<String> Cb_Composicion;
    private javax.swing.JTextField Med_Cantidad;
    private javax.swing.JTextField Med_Codigo;
    private javax.swing.JPanel Med_Desc;
    private javax.swing.JTextField Med_Nombre;
    private javax.swing.JTextField Med_Presentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea med_desc;
    // End of variables declaration//GEN-END:variables
}
