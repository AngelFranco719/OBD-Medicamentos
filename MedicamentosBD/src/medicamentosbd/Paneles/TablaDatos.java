/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package medicamentosbd.Paneles;

import BD.ConexionBD;
import Controlador.Modelo_Administracion;
import Controlador.Modelo_Composicion;
import Controlador.Modelo_Ingreso;
import Controlador.Modelo_Lista;
import Controlador.Modelo_Medicamento;
import Controlador.Modelo_Paciente;
import Controlador.Modelo_Personal;
import Controlador.Modelo_Prescripcion;
import Controlador.Modelo_PrincipioActivo;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TablaDatos <T> extends javax.swing.JPanel {

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
    int cantidad_atributos=0; 
    public TablaDatos(Modelo_Administracion M_Adm, Modelo_Composicion M_Comp, Modelo_Ingreso M_Ing, 
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
        this.InicializarCombos();
        
    }

    
    private void setModelo(){
        String Seleccionado=this.Cb_Tablas.getSelectedItem().toString();
        int instancias; 
        DefaultTableModel ModeloTabla=new DefaultTableModel();
        switch (Seleccionado){
            case "Administracion":
                ModeloTabla.setColumnIdentifiers(M_Adm.getAttributes());
                instancias=M_Adm.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Adm.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }
               
                this.T_Instancias.setModel(ModeloTabla);
                break; 
            case "Composicion":
                ModeloTabla.setColumnIdentifiers(M_Comp.getAttributes());
                instancias=M_Comp.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Comp.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break; 
            case "Ingreso":
                ModeloTabla.setColumnIdentifiers(M_Ing.getAttributes());
                instancias=M_Ing.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Ing.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "Lista":
                ModeloTabla.setColumnIdentifiers(M_Lis.getAttributes());
                instancias=M_Lis.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Lis.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "Medicamento":
                ModeloTabla.setColumnIdentifiers(M_Medicamento.getAttributes());
                instancias=M_Medicamento.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Medicamento.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "Paciente":
                ModeloTabla.setColumnIdentifiers(M_Pac.getAttributes());
                instancias=M_Pac.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Pac.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "Personal":
                ModeloTabla.setColumnIdentifiers(M_Per.getAttributes());
                instancias=M_Per.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Per.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "Prescripcion":
                ModeloTabla.setColumnIdentifiers(M_Pres.getAttributes());
                instancias=M_Pres.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Pres.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
            case "PrincipioActivo":
                ModeloTabla.setColumnIdentifiers(M_Pri.getAttributes());
                instancias=M_Pri.getListCount();
                for(int i=0; i<instancias; i++){
                     ModeloTabla.addRow(M_Pri.getAllAtributesFromInstance(i).toArray(new Object[0]));
                }              
                this.T_Instancias.setModel(ModeloTabla);
                break;
        }
    }
    
    private Object[][] getDatos(List<T>Lista){
        Object[][] datos=new Object[Lista.size()][this.cantidad_atributos];
        int aux=0; 
        
        return datos; 
    }
    private void InicializarCombos(){
        String[] Entidades={"Administracion", "Composicion", "Ingreso", "Lista", "Medicamento",
                             "Paciente","Personal", "Prescripcion", "PrincipioActivo"};
        cantidad_atributos=Entidades.length;
        this.Cb_Tablas.removeAllItems();
        for(String entidad : Entidades){
            this.Cb_Tablas.addItem(entidad);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Cb_Tablas = new javax.swing.JComboBox<>();
        B_Buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        T_Instancias = new javax.swing.JTable();

        jLabel1.setText("Seleccionar Tabla:");

        Cb_Tablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        B_Buscar.setText("Buscar");
        B_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_BuscarActionPerformed(evt);
            }
        });

        T_Instancias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(T_Instancias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cb_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B_Buscar)))
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Cb_Tablas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B_Buscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void B_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_BuscarActionPerformed
        // TODO add your handling code here:
        this.setModelo();
    }//GEN-LAST:event_B_BuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B_Buscar;
    private javax.swing.JComboBox<String> Cb_Tablas;
    private javax.swing.JTable T_Instancias;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
