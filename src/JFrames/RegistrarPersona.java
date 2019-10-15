/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Enumeraciones.TipoDoc;
import javax.swing.JOptionPane;
import Usuarios.Asistente;
import Usuarios.Estudiante;
import labpoo.Login;
import Usuarios.Profesor;
import labpoo.datos;

/**
 *
 * @author Estudiante
 */
public class RegistrarPersona extends javax.swing.JFrame {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistrarPersona() {
        initComponents();
        llenarCMB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        rdb_estudiante = new javax.swing.JRadioButton();
        rdb_profesor = new javax.swing.JRadioButton();
        rdb_auxiliar = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JToggleButton();
        btn_salir = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        txt_contraseña = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_reContraseña = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmb_tipoDocumento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Apellido:");

        buttonGroup1.add(rdb_estudiante);
        rdb_estudiante.setSelected(true);
        rdb_estudiante.setText("Estudiante");

        buttonGroup1.add(rdb_profesor);
        rdb_profesor.setText("Profesor");

        buttonGroup1.add(rdb_auxiliar);
        rdb_auxiliar.setText("Auxiliar");

        jLabel3.setText("Num. doc:");

        btn_registrar.setBackground(new java.awt.Color(0, 0, 0));
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(0, 0, 0));
        btn_salir.setForeground(new java.awt.Color(255, 255, 255));
        btn_salir.setText("Atras");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        jLabel4.setText("Contraseña:");

        jLabel5.setText("Confirme contraseña");

        jLabel6.setText("Tipo Documento");

        cmb_tipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_reContraseña))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb_estudiante)
                                        .addGap(27, 27, 27)
                                        .addComponent(rdb_profesor))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(44, 44, 44)
                                            .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addComponent(jLabel3))
                                                .addComponent(jLabel1))
                                            .addGap(32, 32, 32)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_tipoDocumento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(rdb_auxiliar))
                            .addComponent(btn_salir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cmb_tipoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_reContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdb_estudiante)
                    .addComponent(rdb_profesor)
                    .addComponent(rdb_auxiliar))
                .addGap(11, 11, 11)
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        // TODO add your handling code here:
        if(!(txt_nombre.getText().isEmpty() || txt_contraseña.getText().isEmpty() || txt_apellido.getText().isEmpty() || txt_cedula.getText().isEmpty())){
            String numDoc = txt_cedula.getText();
            String codigo = String.valueOf(datos.numUsuarios);
            TipoDoc tipoDoc = identificar(cmb_tipoDocumento.getSelectedItem().toString());
            String nombre = txt_nombre.getText();
            String apellido = txt_apellido.getText();
            String contraseña = txt_contraseña.getText();
            String reContraseña = txt_reContraseña.getText();
            String email = nombre + apellido + String.valueOf((int) Math.random());
            
            txt_nombre.setText("");
            txt_apellido.setText("");
            txt_cedula.setText("");
            txt_contraseña.setText("");
            txt_reContraseña.setText("");
            
            
            //email = email + "@unibersidad.edu.p";
            if (contraseña.equals(reContraseña)) {

                if (rdb_estudiante.isSelected()) {
                    Estudiante nuevo = new Estudiante(numDoc,tipoDoc,codigo,nombre,apellido,email,contraseña);
                    datos.estudiantes.add(nuevo);
                    datos.personas.add(nuevo);
                    datos.numUsuarios++;
                }else{
                    if (rdb_profesor.isSelected()) {
                        Profesor nuevo = new Profesor(numDoc,tipoDoc,codigo,nombre,apellido,email,contraseña);
                        datos.profesores.add(nuevo);
                        datos.personas.add(nuevo);
                        datos.numUsuarios++;
                    }else{
                       //rdb_ayudante.isSelected() = true;
                       Asistente nuevo = new Asistente(numDoc,tipoDoc,codigo,nombre,apellido,email,contraseña);
                       datos.asistentes.add(nuevo);
                       datos.personas.add(nuevo);
                       datos.numUsuarios++;
                    }
                }
                JOptionPane.showMessageDialog(rootPane,"su codigo es : " + codigo +"\n"
                + "su correo es " + (email + "@unibersidad.edu.p"));
            }else{
                JOptionPane.showMessageDialog(rootPane, "La verificacion de la contraseña debe coinsidir con la contraseña");
            
            }
        }

        
    }//GEN-LAST:event_btn_registrarActionPerformed

    private TipoDoc identificar(String elemento){
        if (elemento.equals("Cedula de ciudadania")) {
            return TipoDoc.CC;
        }else{
            if (elemento.equals("Cedula de ciudadania foranea")) {
                return TipoDoc.CeduladeExtranjeria;
            }else{
                if (elemento.equals("Pasaporte")) {
                    return TipoDoc.Pasaporte;
                }else{
                    //elemento.equals("Tarjeta de identidad")
                    return TipoDoc.TarjetadeIdentidad;
                }
            }
        }
    }
   
    private void llenarCMB(){
        cmb_tipoDocumento.removeAllItems();
        cmb_tipoDocumento.addItem("Cedula de ciudadania");
        cmb_tipoDocumento.addItem("Cedula de ciudadania foranea");
        cmb_tipoDocumento.addItem("Pasaporte");
        cmb_tipoDocumento.addItem("Tarjeta de identidad");
    
    }
 
    
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        login.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_registrar;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmb_tipoDocumento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton rdb_auxiliar;
    private javax.swing.JRadioButton rdb_estudiante;
    private javax.swing.JRadioButton rdb_profesor;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_contraseña;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_reContraseña;
    // End of variables declaration//GEN-END:variables
}