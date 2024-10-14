package medicamentosbd.Paneles;

import BD.ConexionBD;
import Controlador.*;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;

public class BorrarDatos extends javax.swing.JPanel {
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
    public BorrarDatos(Modelo_Administracion M_Adm, Modelo_Composicion M_Comp, Modelo_Ingreso M_Ing, 
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
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout P_TablaLayout = new javax.swing.GroupLayout(P_Tabla);
        P_Tabla.setLayout(P_TablaLayout);
        P_TablaLayout.setHorizontalGroup(
            P_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        P_TablaLayout.setVerticalGroup(
            P_TablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );

        jButton1.setText("Borrar Instancia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Tabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jButton1)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(P_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.ID_Seleccionado!=null && JOptionPane.showConfirmDialog(this, "¿Desea Eliminar el Registro?")==JOptionPane.YES_OPTION){
            switch(this.Entidad_Seleccionada){
                case "PrincipioActivo":
                    M_Pri.DeleteAnInstance(ID_Seleccionado);
                    break; 
                case "Administracion":
                    M_Adm.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Composicion":
                    M_Comp.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Lista":
                    M_Lis.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Medicamento":
                    M_Medicamento.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Ingreso":
                    M_Ing.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Paciente":
                    M_Pac.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Personal":
                    M_Per.DeleteAnInstance(ID_Seleccionado);
                    break;
                case "Prescripcion":
                    M_Pres.DeleteAnInstance(ID_Seleccionado);
                    break; 
            }
        }else{
            JOptionPane.showMessageDialog(this,"Selecciona un Registro","Error", JOptionPane.ERROR_MESSAGE);
        }
        P_Tabla.repaint();
        P_Tabla.revalidate();       
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel P_Tabla;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
