
package notasestudiantes;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Ventana extends javax.swing.JFrame {

    ArrayList list = new ArrayList ();
    int impresiondoble=0;
    boolean iguales;
    int i=0;

    public Ventana() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Titulo = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Apellido = new javax.swing.JLabel();
        nota1 = new javax.swing.JLabel();
        nota2 = new javax.swing.JLabel();
        nota3 = new javax.swing.JLabel();
        Ingresar = new javax.swing.JButton();
        MostrarDatos = new javax.swing.JButton();
        Reiniciar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtn1 = new javax.swing.JTextField();
        txtn2 = new javax.swing.JTextField();
        txtn3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Area = new javax.swing.JTextArea();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        mensaje = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Titulo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Titulo.setText("ESTUDIANTES");
        getContentPane().add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        Nombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Nombre.setText("Nombre: ");
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        Apellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Apellido.setText("Apellido:");
        getContentPane().add(Apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        nota1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nota1.setText("Nota1:");
        getContentPane().add(nota1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        nota2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nota2.setText("Nota2:");
        getContentPane().add(nota2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        nota3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        nota3.setText("Nota3:");
        getContentPane().add(nota3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        Ingresar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Ingresar.setText("Ingresar");
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });
        getContentPane().add(Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        MostrarDatos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        MostrarDatos.setText("Mostrar Promedios");
        MostrarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(MostrarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, -1, -1));

        Reiniciar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Reiniciar.setText("Reiniciar");
        Reiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReiniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Reiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 520, -1, -1));

        txtNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 220, 30));

        txtApellido.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 220, 30));

        txtn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 220, 30));

        txtn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 220, 30));

        txtn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 220, 30));

        Area.setColumns(20);
        Area.setRows(5);
        jScrollPane1.setViewportView(Area);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 510, 220));

        l1.setText("Nombre");
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        l2.setText("Apellido");
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        l3.setText("N1");
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        l4.setText("N2");
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, -1, -1));

        l5.setText("N3");
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, -1, -1));

        l6.setText("Promedio");
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, 20));

        borrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        getContentPane().add(borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        mensaje.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 510, 20));

        Fondo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azul.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        
        Area.setText("");
        impresiondoble =0;
    
        if (!txtNombre.getText().equals("")&&!txtApellido.getText().equals("")&&!txtn1.getText().equals("")&&!txtn2.getText().equals("")&&!txtn3.getText().equals("")){
            
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();            
            
            double not1 = Double.parseDouble(txtn1.getText());
            double not2 = Double.parseDouble(txtn2.getText());
            double not3 = Double.parseDouble(txtn3.getText());
            
            double promedio = (not1+not2+not3)/3;
            iguales =true;
            
            
            Estudiantes estu = new Estudiantes (nombre,apellido,not1,not2,not3,promedio);
            
            this.list.add(estu);
            txtNombre.setText("");
            txtApellido.setText("");
            txtn1.setText("");
            txtn2.setText("");
            txtn3.setText("");
            
            for (int j = 0; j < i; j++) {
                
                if(list.get(j).equals(list.get(i))){
                    JOptionPane.showMessageDialog(rootPane, "El NOMBRE y APELLIDO ingresados ya existen, por favor ingrese otro nombre u apellido ");
                    iguales =false;
                    list.remove(i);
                    break;          
                }
                             
            }
            
                if (iguales == true){
                    i++;
            
                    mensaje.setText("La informacion del estudiante se ha ingresado con exito");                    
                }            
                 
         
        }else{
            JOptionPane.showMessageDialog(rootPane, "Por favor, Ingrese todos los datos");
        }
        
    }//GEN-LAST:event_IngresarActionPerformed

    private void MostrarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarDatosActionPerformed

            mensaje.setText("");        
        if(impresiondoble==0){
        for (Object item: list){
            
            
            
            Area.setText(Area.getText()+item);
            
        }
        }
        impresiondoble =1;
        
    }//GEN-LAST:event_MostrarDatosActionPerformed

    private void ReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReiniciarActionPerformed

        mensaje.setText("Se ha eliminado la informacion");        
        impresiondoble =0;
            txtNombre.setText("");
            txtApellido.setText("");
            txtn1.setText("");
            txtn2.setText("");
            txtn3.setText("");
            list.removeAll(list);
            Area.setText("");
            i=0;
        
    }//GEN-LAST:event_ReiniciarActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        txtNombre.setText("");
            txtApellido.setText("");
            txtn1.setText("");
            txtn2.setText("");
            txtn3.setText("");
            list.removeAll(list);
    }//GEN-LAST:event_borrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellido;
    private javax.swing.JTextArea Area;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Ingresar;
    private javax.swing.JButton MostrarDatos;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Reiniciar;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton borrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel mensaje;
    private javax.swing.JLabel nota1;
    private javax.swing.JLabel nota2;
    private javax.swing.JLabel nota3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtn1;
    private javax.swing.JTextField txtn2;
    private javax.swing.JTextField txtn3;
    // End of variables declaration//GEN-END:variables
}
