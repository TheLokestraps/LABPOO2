/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JFrames;

import Usuarios.Profesor;
import labpoo.datos;

/**
 *
 * @author usuario
 */
public class interfazProfesor extends javax.swing.JFrame {

    /**
     * Creates new form interfazProfesor
     */
    Profesor profesor;
    public interfazProfesor() {
        initComponents();
    }

    public interfazProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_verCursos = new javax.swing.JButton();
        btn_eliminarCuenta = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_crearCurso = new javax.swing.JButton();
        btn_editarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_verCursos.setBackground(new java.awt.Color(0, 0, 0));
        btn_verCursos.setForeground(new java.awt.Color(255, 255, 255));
        btn_verCursos.setText("Ver Cursos");
        btn_verCursos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_eliminarCuenta.setBackground(new java.awt.Color(0, 0, 0));
        btn_eliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminarCuenta.setText("Eliminar Cuenta");
        btn_eliminarCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_eliminar.setBackground(new java.awt.Color(0, 0, 0));
        btn_eliminar.setForeground(new java.awt.Color(255, 255, 255));
        btn_eliminar.setText("Salir");
        btn_eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btn_crearCurso.setBackground(new java.awt.Color(0, 0, 0));
        btn_crearCurso.setForeground(new java.awt.Color(255, 255, 255));
        btn_crearCurso.setText("Crear Curso");
        btn_crearCurso.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_crearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearCursoActionPerformed(evt);
            }
        });

        btn_editarDatos.setBackground(new java.awt.Color(0, 0, 0));
        btn_editarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btn_editarDatos.setText("Editar Datos");
        btn_editarDatos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_editarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_eliminarCuenta)
                    .addComponent(btn_crearCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_verCursos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_editarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_verCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_crearCurso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btn_editarDatos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_eliminar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_editarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editarDatosActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        editarPersona edit = new editarPersona(datos.personas.get(profesor.indiceCargo()));
        edit.setVisible(true);
        
    }//GEN-LAST:event_btn_editarDatosActionPerformed

    private void btn_crearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearCursoActionPerformed
        // TODO add your handling code here:
        CrearCurso crearCurso = new CrearCurso();
        crearCurso.setVisible(true);
    }//GEN-LAST:event_btn_crearCursoActionPerformed

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
            java.util.logging.Logger.getLogger(interfazProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazProfesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazProfesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_crearCurso;
    private javax.swing.JButton btn_editarDatos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_eliminarCuenta;
    private javax.swing.JButton btn_verCursos;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}