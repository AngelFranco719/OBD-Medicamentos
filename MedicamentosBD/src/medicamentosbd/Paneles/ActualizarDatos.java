package medicamentosbd.Paneles;

import BD.ConexionBD;
import Controlador.*;
import Vistas.Inserts.*;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;

public class ActualizarDatos extends javax.swing.JPanel {
    TablaDatos Tabla; 
    ConexionBD Conexion_Actual=new ConexionBD(); 
    Modelo_Administracion M_Adm; 
    Modelo_Composicion M_Comp; 
    Modelo_Ingreso M_Ing; 
    Modelo_Lista M_Lis; 
    Modelo_Medicamento M_Medicamento; 
    Modelo_Paciente M_Pac;
    Modelo_Personal M_Per;
    Modelo_Prescripcion M_Pres;
    Modelo_PrincipioActivo M_Pri;
    String ID_Seleccionado; 
    String Entidad_Seleccionada; 
    public ActualizarDatos(Modelo_Administracion M_Adm, Modelo_Composicion M_Comp, Modelo_Ingreso M_Ing, 
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
        this.setVisible(true);
        Tabla=new TablaDatos(M_Adm, M_Comp, M_Ing, M_Lis, M_Medicamento, M_Pac, M_Per, M_Pres, M_Pri, this); 
        this.P_Tabla.setLayout(new BorderLayout());
        this.P_Tabla.add(Tabla, BorderLayout.CENTER);
        this.P_Tabla.repaint();
        this.P_Tabla.revalidate();
        
    }
    
    public void ObtenerSeleccion(String ID, String Entidad){
        this.ID_Seleccionado=ID; 
        this.Entidad_Seleccionada=Entidad; 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_Tabla = new javax.swing.JPanel();
        B_editar = new javax.swing.JButton();

        javax.swing.GroupLayout P_TablaLayout = new javax.swing.GroupLayout(P_Tabla);
        P_Tabla.setLayout(P_TablaLayout);
        P_TablaLayout.setHorizontalGroup(
            P_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );
        P_TablaLayout.setVerticalGroup(
            P_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        B_editar.setText("Actualizar Registro");
        B_editar.setToolTipText("");
        B_editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(P_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(B_editar)
                .addGap(188, 188, 188))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(P_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(B_editar)
                .addContainerGap(12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_editarActionPerformed
        if(this.ID_Seleccionado!=null){
            List<String>Atributos;
            switch(this.Entidad_Seleccionada){
                case "PrincipioActivo":
                    Atributos=M_Pri.getAllAtributesFromInstance(this.ID_Seleccionado);
                    Formulario_Insert_Activos V_Act=new Formulario_Insert_Activos(M_Pri, M_Comp, Atributos); 
                    V_Act.setVisible(true);
                    break; 
                case "Administracion":
                    Atributos=M_Adm.getAllAtributesFromInstance(ID_Seleccionado);
                    Formulario_Insert_Administracion V_Adm=new Formulario_Insert_Administracion(M_Adm,M_Per,M_Lis, Atributos); 
                    V_Adm.setVisible(true);
                    break;
                case "Composicion":
                    Atributos=M_Comp.getAllAtributesFromInstance(ID_Seleccionado);
                    Formulario_Insert_Composicion V_Comp=new Formulario_Insert_Composicion(M_Comp,M_Medicamento,M_Pri,Atributos); 
                    V_Comp.setVisible(true);
                    break;
                case "Lista":
                    Atributos=M_Lis.getAllAtributesFromInstance(ID_Seleccionado);
                    Formulario_Insert_Lista V_Lis=new Formulario_Insert_Lista(M_Lis,M_Medicamento,M_Pres,M_Adm,Atributos); 
                    V_Lis.setVisible(true);
                    break;
                case "Medicamento":
                    Atributos=M_Medicamento.getAllAtributesFromInstance(ID_Seleccionado);
                    Formulario_Insert_Medicamento V_Med=new Formulario_Insert_Medicamento(M_Medicamento, M_Comp,Atributos); 
                    V_Med.setVisible(true);
                    break;
                case "Ingreso":
                    Atributos=M_Ing.getAllAtributesFromInstance(ID_Seleccionado);
                    JFIngreso V_Ing=new JFIngreso(M_Ing,M_Pac,Atributos); 
                    V_Ing.setVisible(true);
                    break;
                case "Paciente":
                    Atributos=M_Pac.getAllAtributesFromInstance(ID_Seleccionado);
                    JFPaciente V_Pac=new JFPaciente(M_Pac,M_Ing,Atributos); 
                    V_Pac.setVisible(true);
                    break;
                case "Personal":
                    Atributos=M_Per.getAllAtributesFromInstance(ID_Seleccionado);
                    JFPersonal V_Per=new JFPersonal(M_Per,M_Adm,Atributos); 
                    V_Per.setVisible(true);
                    break;
                case "Prescripcion":
                    Atributos=M_Pres.getAllAtributesFromInstance(ID_Seleccionado);
                    JFPrescripcion V_Pres=new JFPrescripcion(M_Pres,M_Pac,M_Per,M_Lis,Atributos); 
                    V_Pres.setVisible(true);
                    break; 
            }
        }else{
            JOptionPane.showMessageDialog(this,"Selecciona un Registro","Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_B_editarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_editar;
    private javax.swing.JPanel P_Tabla;
    // End of variables declaration//GEN-END:variables
}
