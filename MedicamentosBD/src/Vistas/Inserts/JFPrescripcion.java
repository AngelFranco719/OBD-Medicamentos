
package Vistas.Inserts;

import Confirmacion.JFConfirmaPrescripcion;
import Controlador.Modelo_Paciente;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Prescripcion;
import Controlador.Modelo_Lista;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class JFPrescripcion extends javax.swing.JFrame {

    Modelo_Prescripcion Prescripcion;
    Modelo_Paciente Paciente; 
    Modelo_Personal Personal; 
    Modelo_Lista Lista;
    JCalendar Calendario; 
    public JFPrescripcion(Modelo_Prescripcion Prescripcion,Modelo_Paciente Paciente, Modelo_Personal Personal, Modelo_Lista Lista){
        initComponents();
        this.Prescripcion=Prescripcion;
        this.Paciente=Paciente;
        this.InicializarPaciente();
        this.Personal=Personal;
        this.InicializarPersonal();
        this.Lista = Lista;
        this.InicializarLista();
        this.InicializarCalendario();
    }
    public JFPrescripcion(Modelo_Prescripcion Prescripcion,Modelo_Paciente Paciente, Modelo_Personal Personal, Modelo_Lista Lista, List<String>Atributos){
        initComponents();
        this.Prescripcion=Prescripcion;
        this.Paciente=Paciente;
        this.InicializarPaciente();
        this.Personal=Personal;
        this.InicializarPersonal();
        this.Lista = Lista;
        this.InicializarLista();
        this.InicializarCalendario();
        this.pre_codigo.setText(Atributos.get(0));
        try{
            SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy");
            this.Calendario.setDate(Formato.parse(Atributos.get(1)));
        }catch(Exception e){}
        this.pre_cantidad.setText(Atributos.get(2));
        this.pre_intrucciones.setText(Atributos.get(3));
        this.cb_paciente.setSelectedItem(this.getElementInCombo(Atributos.get(4), cb_paciente));
        this.cb_personal.setSelectedItem(this.getElementInCombo(Atributos.get(5), cb_personal));
    }
    private Object getElementInCombo(String ID, JComboBox Combo){
         for(int i=0; i<Combo.getItemCount(); i++){
             if(Combo.getItemAt(i).equals(ID)){
                 return Combo.getItemAt(i);
             }
         }
         return null; 
     }
    private void InicializarCalendario(){
        Calendario = new JCalendar(); 
        this.P_Calendario.setLayout(new BorderLayout());
        this.P_Calendario.add(Calendario, BorderLayout.CENTER);
        this.P_Calendario.repaint();
        this.P_Calendario.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblInstrucciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pre_intrucciones = new javax.swing.JTextArea();
        lblUsos = new javax.swing.JLabel();
        pre_codigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pre_cantidad = new javax.swing.JTextField();
        Button_Enviar = new javax.swing.JButton();
        Button_Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_paciente = new javax.swing.JComboBox<>();
        cb_personal = new javax.swing.JComboBox<>();
        cb_lista = new javax.swing.JComboBox<>();
        P_Calendario = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblCodigo.setText("Código: ");

        lblFecha.setText("Fecha: ");

        lblInstrucciones.setText("Instrucciones:  ");

        pre_intrucciones.setColumns(20);
        pre_intrucciones.setRows(5);
        jScrollPane1.setViewportView(pre_intrucciones);

        lblUsos.setText("Usos (cantidad):");

        jLabel5.setText("Datos de la Prescripción");

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

        jLabel1.setText("Paciente:");

        jLabel2.setText("Lista:");

        jLabel3.setText("Personal:");

        cb_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_personal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cb_lista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout P_CalendarioLayout = new javax.swing.GroupLayout(P_Calendario);
        P_Calendario.setLayout(P_CalendarioLayout);
        P_CalendarioLayout.setHorizontalGroup(
            P_CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 141, Short.MAX_VALUE)
        );
        P_CalendarioLayout.setVerticalGroup(
            P_CalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInstrucciones, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUsos, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pre_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(pre_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(P_Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(33, 33, 33)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(cb_lista, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_personal, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cb_paciente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 64, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Button_Enviar)
                        .addGap(41, 41, 41)
                        .addComponent(Button_Cancelar)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cb_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cb_personal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cb_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigo)
                            .addComponent(pre_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(P_Calendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstrucciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsos)
                    .addComponent(pre_cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button_Cancelar)
                    .addComponent(Button_Enviar))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Button_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_EnviarActionPerformed
        
        String Codigo=this.pre_codigo.getText();
        String Fecha=new String(); 
        try{
            SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy"); 
            Fecha=Formato.format(Calendario.getDate()+" 00:00:00");
        }catch(Exception  e){}
        String Paciente=this.cb_paciente.getSelectedItem().toString();
        String Personal=this.cb_personal.getSelectedItem().toString();
        String Lista=this.cb_lista.getSelectedItem().toString();
        String Instrucciones=this.pre_intrucciones.getText();
        String Cantidad=this.pre_cantidad.getText();
        JFConfirmaPrescripcion n_c=new JFConfirmaPrescripcion(Prescripcion,Codigo, Fecha, Paciente, Personal, Lista ,Instrucciones, Cantidad);
        n_c.setVisible(true);
    }//GEN-LAST:event_Button_EnviarActionPerformed

    private void Button_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button_CancelarActionPerformed
        if(JOptionPane.OK_OPTION==JOptionPane.showConfirmDialog(this, "Los cambios se perderán ¿Desea salir?")){
            this.dispose();
        }
    }//GEN-LAST:event_Button_CancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFPrescripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrescripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrescripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrescripcion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JFPrescripcion().setVisible(true);
            }
        });
    }
    
    private void InicializarPersonal(){
        List<String>RPersonal=Personal.getListAttribute("per_nombre");
        cb_personal.removeAllItems();
        for(String personal : RPersonal){
            cb_personal.addItem(personal);
        }
    }
    
    private void InicializarPaciente(){
        List<String>RPaciente=Paciente.getListAttribute("pac_nombre");
        cb_paciente.removeAllItems();
        for(String paciente : RPaciente){
            cb_paciente.addItem(paciente);
        }
    }
    
    private void InicializarLista(){
       List<String>RLista=Lista.getListAttribute("lis_codigo");
        cb_lista.removeAllItems();
        for(String lista : RLista){
            cb_lista.addItem(lista);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button_Cancelar;
    private javax.swing.JButton Button_Enviar;
    private javax.swing.JPanel P_Calendario;
    private javax.swing.JComboBox<String> cb_lista;
    private javax.swing.JComboBox<String> cb_paciente;
    private javax.swing.JComboBox<String> cb_personal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblUsos;
    private javax.swing.JTextField pre_cantidad;
    private javax.swing.JTextField pre_codigo;
    private javax.swing.JTextArea pre_intrucciones;
    // End of variables declaration//GEN-END:variables

}
