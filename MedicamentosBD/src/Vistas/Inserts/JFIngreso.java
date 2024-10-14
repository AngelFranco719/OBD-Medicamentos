
package Vistas.Inserts;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Paciente;
import java.util.Date;
import java.text.SimpleDateFormat;
import Confirmacion.JFConfirmaIngreso;
import com.toedter.calendar.JCalendar;
import java.awt.BorderLayout;
import java.awt.event.*;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class JFIngreso extends javax.swing.JFrame {
    
    Modelo_Ingreso Ingreso;
    Modelo_Paciente Paciente;
    JCalendar nuevoCalendario= new JCalendar(); 
    JCalendar nuevoCalendario2=new JCalendar(); 
    boolean actualizacion=false;
    public JFIngreso(Modelo_Ingreso ingreso, Modelo_Paciente paciente) {
        initComponents();
        this.Ingreso = ingreso;
        this.Paciente= paciente;
        InicializarPac();
        lblErrorNum.setText("");
        lblErrorCodigo.setText("");
        agregarValidaciones();
        this.InicializarCalendario();
        
    }
    public JFIngreso(Modelo_Ingreso ingreso, Modelo_Paciente paciente, List<String> Atributos) {
        initComponents();
        this.Ingreso = ingreso;
        this.Paciente= paciente;
        InicializarPac();
        lblErrorNum.setText("");
        lblErrorCodigo.setText("");
        agregarValidaciones();
        this.InicializarCalendario();
        JOptionPane.showMessageDialog(this, Atributos);   
        this.txtcodigo.setText(Atributos.get(0));
        this.txtid.setText(Atributos.get(1));
        this.txtSintomas.setText(Atributos.get(2));
        this.txtDiagnostico.setText(Atributos.get(3));
        try{
            SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy");
            this.nuevoCalendario.setDate(Formato.parse(Atributos.get(4)));
            this.nuevoCalendario2.setDate(Formato.parse(Atributos.get(5)));
        }catch(Exception e){}
        this.PacienteCb.setSelectedItem(this.getElementInCombo(Atributos.get(6), PacienteCb));
        this.txtcodigo.setEditable(false);
        this.actualizacion=true; 
        
    }
    private Object getElementInCombo(String ID, JComboBox Combo){
         for(int i=0; i<Combo.getItemCount(); i++){
             if(Combo.getItemAt(i).equals(ID)){
                 return Combo.getItemAt(i);
             }
         }
         return null; 
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCOntenedor = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSintomas = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        PacienteCb = new javax.swing.JComboBox<>();
        continuarBtn = new javax.swing.JButton();
        CancelarBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDiagnostico = new javax.swing.JTextArea();
        lblDiagnostico = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcodigo = new javax.swing.JTextField();
        lblErrorNum = new javax.swing.JLabel();
        lblErrorCodigo = new javax.swing.JLabel();
        P_FechaE = new javax.swing.JPanel();
        P_FechaS = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Formulario del Ingreso");
        setLocation(new java.awt.Point(50, 0));
        setName("frameFormularioIngreso"); // NOI18N
        setResizable(false);

        panelCOntenedor.setBackground(new java.awt.Color(204, 204, 204));
        panelCOntenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelCOntenedor.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Datos del Ingreso");

        jLabel2.setText("Número de ingreso: ");

        txtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Sintomas: ");

        txtSintomas.setColumns(20);
        txtSintomas.setRows(5);
        txtSintomas.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(txtSintomas);

        jLabel4.setText("Fecha de Entrada: ");

        jLabel5.setText("Fecha de Salida: ");

        jLabel6.setText("Seleccionar Paciente: ");

        PacienteCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        continuarBtn.setText("Continuar");
        continuarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarBtnActionPerformed(evt);
            }
        });

        CancelarBtn.setText("Cancelar");
        CancelarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarBtnActionPerformed(evt);
            }
        });

        txtDiagnostico.setColumns(20);
        txtDiagnostico.setRows(5);
        jScrollPane2.setViewportView(txtDiagnostico);

        lblDiagnostico.setText("Diagnóstico:");

        jLabel7.setText("Código:");

        txtcodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblErrorNum.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorNum.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorNum.setText("jLabel8");

        lblErrorCodigo.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        lblErrorCodigo.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorCodigo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorCodigo.setText("jLabel8");

        javax.swing.GroupLayout P_FechaELayout = new javax.swing.GroupLayout(P_FechaE);
        P_FechaE.setLayout(P_FechaELayout);
        P_FechaELayout.setHorizontalGroup(
            P_FechaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 261, Short.MAX_VALUE)
        );
        P_FechaELayout.setVerticalGroup(
            P_FechaELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout P_FechaSLayout = new javax.swing.GroupLayout(P_FechaS);
        P_FechaS.setLayout(P_FechaSLayout);
        P_FechaSLayout.setHorizontalGroup(
            P_FechaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
        );
        P_FechaSLayout.setVerticalGroup(
            P_FechaSLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 113, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelCOntenedorLayout = new javax.swing.GroupLayout(panelCOntenedor);
        panelCOntenedor.setLayout(panelCOntenedorLayout);
        panelCOntenedorLayout.setHorizontalGroup(
            panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblErrorNum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblErrorCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(P_FechaE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                                .addComponent(lblDiagnostico)
                                .addGap(310, 310, 310)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P_FechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCOntenedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCOntenedorLayout.createSequentialGroup()
                        .addComponent(CancelarBtn)
                        .addGap(18, 18, 18)
                        .addComponent(continuarBtn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCOntenedorLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(PacienteCb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(225, 225, 225))))
            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelCOntenedorLayout.setVerticalGroup(
            panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCOntenedorLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblErrorNum)
                    .addComponent(lblErrorCodigo))
                .addGap(1, 1, 1)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(P_FechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(lblDiagnostico))
                    .addGroup(panelCOntenedorLayout.createSequentialGroup()
                        .addComponent(P_FechaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PacienteCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(9, 9, 9)
                .addGroup(panelCOntenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(continuarBtn)
                    .addComponent(CancelarBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCOntenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelCOntenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void agregarValidaciones() {
               
        txtid.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (!txtid.getText().matches("\\d+")) {
                    lblErrorNum.setText("Solo se permiten números.");
                } else {
                    lblErrorNum.setText("");
                }
            }
        });
        
        txtcodigo.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (!txtcodigo.getText().matches("[a-zA-Z0-9_-]+")) {
                    lblErrorCodigo.setText("Formato invalido. ");
                } else {
                    lblErrorCodigo.setText("");
                }
            }
        });
    }
    private void InicializarCalendario(){
        this.P_FechaE.setLayout(new BorderLayout());
        this.P_FechaE.add(nuevoCalendario, BorderLayout.CENTER);
        this.P_FechaE.repaint();
        this.P_FechaE.revalidate();
        this.P_FechaS.setLayout(new BorderLayout());
        this.P_FechaS.add(nuevoCalendario2, BorderLayout.CENTER);
        this.P_FechaS.repaint();
        this.P_FechaS.revalidate();
    }
    
    private void continuarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarBtnActionPerformed
        if(actualizacion){
            if(JOptionPane.showConfirmDialog(this, "¿Quiere Actualizar los Datos?")==JOptionPane.YES_OPTION){
                SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy hh:mm:ss");
                String FechaE=Formato.format(this.nuevoCalendario.getDate());
                String FechaS=Formato.format(this.nuevoCalendario2.getDate());
                Ingreso.InitializeAndUpdateInstance(this.txtcodigo.getText(), Integer.parseInt(this.txtid.getText()), this.txtSintomas.getText(), this.txtDiagnostico.getText(), 
                       FechaE, FechaS, this.PacienteCb.getSelectedItem().toString());
            }
        }else{
            if (!validarCamposVacios()) {
                JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            } 
            if (!txtcodigo.getText().matches("[a-zA-Z0-9_-]+")) {
                lblErrorCodigo.setText("Código inválido");
                return;
            }
            if (!txtid.getText().matches("\\d+")) {
                lblErrorNum.setText("Id inválido");
                return;
            }
            String codigo = this.txtcodigo.getText();
            String numero = this.txtid.getText();
            String sintomas =this.txtSintomas.getText();
            String diagnostico = this.txtDiagnostico.getText();
            SimpleDateFormat Formato=new SimpleDateFormat("dd-MM-yy"); 
            Date FechaE=this.nuevoCalendario.getDate();
            Date FechaS=this.nuevoCalendario2.getDate();
            String FechaEF=new String(); 
            String FechaSF=new String(); 
            try{
                FechaEF=Formato.format(FechaE);
                FechaSF=Formato.format(FechaS);
            }catch(Exception e){
                System.out.println(e.toString());
            }
            String pacienteSeleccionado = this.PacienteCb.getSelectedItem().toString();        

            JFConfirmaIngreso confirma = new JFConfirmaIngreso(Ingreso, codigo, numero, sintomas, diagnostico, FechaEF, FechaSF, pacienteSeleccionado);
            confirma.setVisible(true);
        }
        
    }//GEN-LAST:event_continuarBtnActionPerformed

    private void CancelarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarBtnActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_CancelarBtnActionPerformed
    
    public boolean validarCamposVacios() {       
       if (txtid.getText().trim().isEmpty() || 
           txtSintomas.getText().trim().isEmpty() ||
           this.nuevoCalendario.getDate().toString().trim().isEmpty() ||
           this.nuevoCalendario2.getDate().toString().trim().isEmpty() || 
           txtDiagnostico.getText().trim().isEmpty() || 
           PacienteCb.equals("")){  
           return false;
           }
       return true;
       }   
    
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
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    
    private void InicializarPac(){
        List<String>Pacientes=Paciente.getListAttribute("pac_nombre");
        PacienteCb.removeAllItems();
        for(String paciente : Pacientes){
            PacienteCb.addItem(paciente);
        }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarBtn;
    private javax.swing.JPanel P_FechaE;
    private javax.swing.JPanel P_FechaS;
    private javax.swing.JComboBox<String> PacienteCb;
    private javax.swing.JButton continuarBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDiagnostico;
    private javax.swing.JLabel lblErrorCodigo;
    private javax.swing.JLabel lblErrorNum;
    private javax.swing.JPanel panelCOntenedor;
    private javax.swing.JTextArea txtDiagnostico;
    private javax.swing.JTextArea txtSintomas;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtid;
    // End of variables declaration//GEN-END:variables
}
