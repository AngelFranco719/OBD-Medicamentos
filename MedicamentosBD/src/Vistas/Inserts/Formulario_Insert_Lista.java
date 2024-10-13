
package Vistas.Inserts;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Prescripcion;
import Controlador.Modelo_Medicamento;
import Controlador.Modelo_Administracion;
import Confirmacion.Confirmacion_Lista;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Formulario_Insert_Lista extends javax.swing.JFrame {

    Modelo_Lista Lista;
    Modelo_Medicamento Medicamento;
    Modelo_Prescripcion Prescripcion;
    Modelo_Administracion Administracion;
    JCalendar Calendario;
    public Formulario_Insert_Lista(Modelo_Lista Lista, Modelo_Medicamento Medicamento, Modelo_Prescripcion Prescripcion,Modelo_Administracion Administracion) {
        initComponents();
        this.Lista=Lista;
        this.Medicamento=Medicamento;
        this.Prescripcion=Prescripcion;
        this.Administracion=Administracion;
        this.InicializarCombos();
        this.InicializarCalendario();
    }
    public Formulario_Insert_Lista(Modelo_Lista Lista, Modelo_Medicamento Medicamento, Modelo_Prescripcion Prescripcion,Modelo_Administracion Administracion
    , List<String> Atributos) {
        initComponents();
        this.Lista=Lista;
        this.Medicamento=Medicamento;
        this.Prescripcion=Prescripcion;
        this.Administracion=Administracion;
        this.InicializarCombos();
        this.InicializarCalendario();
        JOptionPane.showMessageDialog(this, Atributos);
        this.Lista_Codigo.setText(Atributos.get(0));
        this.Lista_intervalo.setText(Atributos.get(1));
        this.Lista_Dosis.setText(Atributos.get(2));
        this.Lista_Dias.setText(Atributos.get(3));
        try{
            SimpleDateFormat FormatoF=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
            SimpleDateFormat FormatoH=new SimpleDateFormat("hh:mm:ss");
            Date Fecha=FormatoF.parse(Atributos.get(4));
            this.Calendario.setDate(Fecha);
            this.Lis_Hora.setText(FormatoH.format(Fecha));
        }catch(Exception e){}
        this.Lista_Prescripcion.setSelectedItem(this.getElementInCombo(Atributos.get(5), this.Lista_Prescripcion));
        this.Lista_Medicamento.setSelectedItem(this.getElementInCombo(Medicamento.getIDByNombre(Atributos.get(6)), Lista_Medicamento));
        this.Lista_Codigo.setEditable(false);
    }

    private Object getElementInCombo(String ID, JComboBox Combo){
         for(int i=0; i<Combo.getItemCount(); i++){
             if(Combo.getItemAt(i).equals(ID)){
                 return Combo.getItemAt(i);
             }
         }
         return null; 
     }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lista_Codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Lista_Dosis = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Lis_Hora = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Lista_Dias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Lista_Prescripcion = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        Lista_Medicamento = new javax.swing.JComboBox<>();
        Button_Enviar = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Lista_intervalo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Lista_Admi = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        P_Calendario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selecciona la Prescripcion");

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("LISTA");

        jLabel2.setText("Codigo:");

        Lista_Codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_CodigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Dosis: ");

        jLabel4.setText(" Hora:");

        Lis_Hora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lis_HoraActionPerformed(evt);
            }
        });

        jLabel5.setText("Dias:");

        jLabel6.setText("Prescripcion:");

        Lista_Prescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Lista_Prescripcion.setToolTipText("Se");

        jLabel7.setText("Medicamento:");

        Lista_Medicamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        Button_Enviar.setText("Enviar");
        Button_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_EnviarActionPerformed(evt);
            }
        });

        Button_Cancelar.setText("Cancelar");
        Button_Cancelar.setToolTipText("");
        Button_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button_CancelarActionPerformed(evt);
            }
        });

        jLabel8.setText("Intervalo:");

        jLabel9.setText("Administracion:");

        Lista_Admi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("Fecha:");

        javax.swing.GroupLayout P_CalendarioLayout = new javax.swing.GroupLayout(P_Calendario);
        P_Calendario.setLayout(P_CalendarioLayout);
        P_CalendarioLayout.setHorizontalGroup(
            P_CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        P_CalendarioLayout.setVerticalGroup(
            P_CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Button_Enviar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(21, 21, 21)
                            .addComponent(Lista_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(P_Calendario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(51, 51, 51))
                                .addComponent(Lis_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(Lista_Dosis, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                        .addComponent(Lista_intervalo))
                                    .addGap(75, 75, 75))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(Button_Cancelar)
                        .addContainerGap(317, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Lista_Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Lista_Admi, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(Lista_Dias, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Lista_Prescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(344, 344, 344))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Lista_Codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Lista_intervalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Lista_Dosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(P_Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista_Dias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista_Prescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista_Medicamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lista_Admi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(Lis_Hora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Enviar)
                    .addComponent(Button_Cancelar))
                .addGap(26, 26, 26))
        );

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Lista_CodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_CodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lista_CodigoActionPerformed

    private void Lis_HoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lis_HoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Lis_HoraActionPerformed

    private void Button_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EnviarActionPerformed
       if (!validarCamposVacios()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy"); 
        String Codigo =this.Lista_Codigo.getText();
        String Intervalo=this.Lista_intervalo.getText();
        String Dosis=this.Lista_Dosis.getText();
        String Fecha_Hora=this.Lis_Hora.getText();
        String Dias=this.Lista_Dias.getText();
        String Medicamento=this.Lista_Medicamento.getSelectedItem().toString();
        String Prescripcion=this.Lista_Prescripcion.getSelectedItem().toString();
        String Administracion=this.Lista_Admi.getSelectedItem().toString();
        Date Fecha=this.Calendario.getDate();
        String fecha_final=new String(); 
        try{
            fecha_final=Formato.format(Fecha);
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
        String Hora=this.Lis_Hora.getText();
        fecha_final+=" "+Hora; 
        JOptionPane.showMessageDialog(this,fecha_final);                             
        Confirmacion_Lista confirmacion=new Confirmacion_Lista(Lista,Codigo,Intervalo,Dosis,Fecha_Hora,Dias,Medicamento,Prescripcion,Administracion);
        confirmacion.setVisible(true);
        
        
    }//GEN-LAST:event_Button_EnviarActionPerformed

    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario_Insert_Lista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    
    }
    public boolean validarCamposVacios() {       
       if (Lista_Codigo.getText().trim().isEmpty() || 
           Lista_Dias.getText().trim().isEmpty() ||
           Lista_Dosis.getText().trim().isEmpty()||
           Lista_intervalo.getText().trim().isEmpty()){
           return false;
       }
       return true;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JButton Button_Enviar;
    private javax.swing.JTextField Lis_Hora;
    private javax.swing.JComboBox<String> Lista_Admi;
    private javax.swing.JTextField Lista_Codigo;
    private javax.swing.JTextField Lista_Dias;
    private javax.swing.JTextField Lista_Dosis;
    private javax.swing.JComboBox<String> Lista_Medicamento;
    private javax.swing.JComboBox<String> Lista_Prescripcion;
    private javax.swing.JTextField Lista_intervalo;
    private javax.swing.JPanel P_Calendario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

     private void InicializarCalendario(){
        Calendario = new JCalendar(); 
        this.P_Calendario.setLayout(new BorderLayout());
        this.P_Calendario.add(Calendario, BorderLayout.CENTER);
        this.P_Calendario.repaint();
        this.P_Calendario.revalidate();
    }
    private void InicializarCombos() {
        List<String>ListaMedicamento=Medicamento.getListAttribute("med_codigo");
        this.Lista_Medicamento.removeAllItems();
        for(String resultado : ListaMedicamento){
            this.Lista_Medicamento.addItem(resultado);
        }
        List<String>ListaPrescripcion=Prescripcion.getListAttribute("pres_codigo");
        this.Lista_Prescripcion.removeAllItems();
        for(String resultado : ListaPrescripcion){
            this.Lista_Prescripcion.addItem(resultado);
        }
        List<String>ListaAdministracion=Administracion.getListAttribute("adm_codigo");
        this.Lista_Admi.removeAllItems();
        for(String resultado : ListaAdministracion){
            this.Lista_Admi.addItem(resultado);
        }
    }
}
