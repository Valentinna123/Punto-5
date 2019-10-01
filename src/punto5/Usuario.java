/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto5;

import javax.swing.JOptionPane;

/**
 *
 * @author valenthina
 */
public class Usuario extends javax.swing.JFrame {

   Productos ob,ob2,ob3,ob4;
   int cont=0,cont2=0,cont3=0,cont4=0;
   float ing,ing2;
   
    public Usuario() {
        initComponents();
        
        ob = new Productos();
        ob.setPro(l6.getText());
        ob.setCant(Integer.parseInt(l7.getText()));
        ob.setPrec(Float.parseFloat(l9.getText()));
        ob.setIva(0.16);
        
        ob2 = new Productos();
        ob2.setPro(l10.getText());
        ob2.setCant(Integer.parseInt(l11.getText()));
        ob2.setPrec(Float.parseFloat(l13.getText()));
        ob2.setIva(0.16);
        
        ob3 = new Productos();
        ob3.setPro(l14.getText());
        ob3.setCant(Integer.parseInt(l15.getText()));
        ob3.setPrec(Float.parseFloat(l17.getText()));
        ob3.setIva(0.12);
        
        ob4 = new Productos();
        ob4.setPro(l18.getText());
        ob4.setCant(Integer.parseInt(l19.getText()));
        ob4.setPrec(Float.parseFloat(l21.getText()));
        ob4.setIva(0.04);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setText("Productos");

        l2.setText("Producto");

        l3.setText("Cantidad");

        l4.setText("IVA");

        l5.setText("Precio");

        l6.setText("Borrador");

        l10.setText("Cartulina");

        l14.setText("Corrector");

        l18.setText("Foami");

        l7.setText("50");

        l11.setText("50");

        l15.setText("50");

        l19.setText("50");

        l8.setText("16%");

        l12.setText("16%");

        l16.setText("12%");

        l20.setText("4%");

        l9.setText("500");

        l13.setText("200");

        l17.setText("3000");

        l21.setText("1500");

        l22.setText("Operaciones");

        b1.setText("Vender producto");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b2.setText("Pedir producto");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        l23.setText("Calculos");

        l24.setText("Ingresos");

        l26.setText("Producto +vendido");

        l28.setText("Producto - vendido");

        l25.setText("0");

        l27.setText("------");

        l29.setText("------");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l1)
                    .addComponent(l22)
                    .addComponent(l23))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(l28)
                    .addComponent(l26)
                    .addComponent(l24)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l2)
                        .addComponent(l6)
                        .addComponent(l18)
                        .addComponent(l14)
                        .addComponent(l10)))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l3)
                            .addComponent(l7)
                            .addComponent(l11)
                            .addComponent(l15)
                            .addComponent(l19))
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                                .addComponent(l5)
                                .addGap(37, 37, 37))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(l9)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l12)
                                    .addComponent(l16)
                                    .addComponent(l20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(l21, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(26, 26, 26))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b2)
                            .addComponent(b1)
                            .addComponent(l25)
                            .addComponent(l27)
                            .addComponent(l29))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(l1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(l3)
                    .addComponent(l4)
                    .addComponent(l5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l6)
                    .addComponent(l7)
                    .addComponent(l8)
                    .addComponent(l9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l10)
                    .addComponent(l11)
                    .addComponent(l12)
                    .addComponent(l13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l14)
                    .addComponent(l15)
                    .addComponent(l16)
                    .addComponent(l17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l18)
                    .addComponent(l19)
                    .addComponent(l20)
                    .addComponent(l21))
                .addGap(26, 26, 26)
                .addComponent(l22)
                .addGap(18, 18, 18)
                .addComponent(b1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(l23)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l24)
                    .addComponent(l25))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l26)
                    .addComponent(l27))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l28)
                    .addComponent(l29))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Producto que desea pedir\n 1. Borrador \n 2.Cartulina \n 3.Corrector \n 4. Foami"));
        if(opc==1){
         do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos borradores desea pedir"));
         }while(opc<0);
        int res=ob.getCant()+opc;
         ob.setCant(res);
         l7.setText(String.valueOf(res));
         
        }else if(opc==2){
         do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantas cartulinas desea pedir"));
         }while(opc<0);
        int res=ob2.getCant()+opc;
         ob2.setCant(res);
         l11.setText(String.valueOf(res));
         
        }else if(opc==3){
         do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Correctores desea pedir"));
         }while(opc<0);
         int res=ob3.getCant()+opc;
         ob3.setCant(res);
         l15.setText(String.valueOf(res));
         
        }else if(opc==4){
          do{
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos foami desea pedir"));
          }while(opc<0);
        int res=ob4.getCant()+opc;
         ob4.setCant(res);
         l19.setText(String.valueOf(res));
         
        }
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        int opc=Integer.parseInt(JOptionPane.showInputDialog("Producto que desea vender\n 1. Borrador \n 2.Cartulina \n 3.Corrector \n 4. Foami"));
        double caliva;
        
        if(opc==1){
          
         do{
             opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos borradores desea vender"));
         }while(opc>ob.getCant());
        int res=ob.getCant()-opc;
         ob.setCant(res);
         l7.setText(String.valueOf(res));
         ing=(opc*ob.getPrec());
         caliva= ing*ob.getIva();
         ing+=caliva;
         ing2+=ing;
         l25.setText(String.valueOf(ing2));
         cont+=opc;
        }else if(opc==2){
          do{
              opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantas cartulinas desea vender"));
          }while(opc>ob2.getCant());
         
        int res=ob2.getCant()-opc;
         ob2.setCant(res);
         l11.setText(String.valueOf(res));
         ing=(opc*ob2.getPrec());
         caliva= ing*ob2.getIva();
         ing+=caliva;
         ing2+=ing;
         l25.setText(String.valueOf(ing2));
         cont2+=opc;
        }else if(opc==3){
         do{ 
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos Correctores desea vender"));
         }while(opc>ob3.getCant());
         int res=ob3.getCant()-opc;
         ob3.setCant(res);
         l15.setText(String.valueOf(res));
         ing=(opc*ob3.getPrec());
         caliva= ing*ob3.getIva();
         ing+=caliva;
         ing2+=ing;
         l25.setText(String.valueOf(ing2));
         cont3+=opc;
        }else if(opc==4){
         do{ 
         opc=Integer.parseInt(JOptionPane.showInputDialog("Cuantos foami desea vender"));
         }while(opc>ob4.getCant());
        int res=ob4.getCant()-opc;
         ob4.setCant(res);
         l19.setText(String.valueOf(res));
         ing=(opc*ob4.getPrec());
         caliva= ing*ob4.getIva();
         ing+=caliva;
         ing2+=ing;
         l25.setText(String.valueOf(ing2));
         cont4+=opc;
        }
        
        if(cont>=cont2 && cont>=cont3 && cont>=cont4){
            l27.setText(ob.getPro());
        }else if(cont2>=cont && cont2>=cont3 && cont2>=cont4){
            l27.setText(ob2.getPro());
        }else if(cont3>=cont && cont3>=cont2 && cont3>=cont4){
            l27.setText(ob3.getPro());
        }else if(cont4>=cont && cont4>=cont2 && cont4>=cont3){
            l27.setText(ob4.getPro());
        }
        
        if(cont<=cont2 && cont<=cont3 && cont<=cont4){
            l29.setText(ob.getPro());
        }else if(cont2<=cont && cont2<=cont3 && cont2<=cont4){
            l29.setText(ob2.getPro());
        }else if(cont3<=cont && cont3<=cont2 && cont3<=cont4){
            l29.setText(ob3.getPro());
        }else if(cont4<=cont && cont4<=cont2 && cont4<=cont3){
            l29.setText(ob4.getPro());
        }
        
        
    }//GEN-LAST:event_b1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}
