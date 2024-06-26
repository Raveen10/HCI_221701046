/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.sortnumbers;
import java.util.Arrays;
/**
 *
 * @author ipssh
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Input = new javax.swing.JTextField();
        Ascending = new javax.swing.JButton();
        Descending = new javax.swing.JButton();
        Output = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(Input);
        Input.setBounds(202, 100, 181, 22);

        Ascending.setText("Ascending");
        Ascending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AscendingActionPerformed(evt);
            }
        });
        getContentPane().add(Ascending);
        Ascending.setBounds(375, 173, 85, 23);

        Descending.setText("Descending");
        Descending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DescendingActionPerformed(evt);
            }
        });
        getContentPane().add(Descending);
        Descending.setBounds(99, 139, 92, 23);

        Output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OutputActionPerformed(evt);
            }
        });
        getContentPane().add(Output);
        Output.setBounds(181, 227, 190, 22);

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset);
        Reset.setBounds(402, 261, 72, 23);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Number Sorting ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(141, 26, 266, 56);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Ravee\\AppData\\Local\\Temp\\vector-abstract-background-texture-design.jpg")); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 560, 330);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AscendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AscendingActionPerformed
          // Get the input text, parse and sort in ascending order
        String inputText = Input.getText();
        String[] inputArray = inputText.split(" ");
        int[] numbers = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        String outputText = Arrays.stream(numbers)
                                  .mapToObj(String::valueOf)
                                  .reduce((a, b) -> a + " " + b)
                                  .orElse("");
        Output.setText(outputText);   // TODO add your handling code here:
    }//GEN-LAST:event_AscendingActionPerformed

    private void OutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OutputActionPerformed
           // TODO add your handling code here:
    }//GEN-LAST:event_OutputActionPerformed

    private void DescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DescendingActionPerformed
          String inputText = Input.getText();
        String[] inputArray = inputText.split(" ");
        int[] numbers = Arrays.stream(inputArray).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(numbers);
        int[] descendingNumbers = Arrays.stream(numbers).boxed()
                                        .sorted((a, b) -> b - a)
                                        .mapToInt(Integer::intValue)
                                        .toArray();
        String outputText = Arrays.stream(descendingNumbers)
                                  .mapToObj(String::valueOf)
                                  .reduce((a, b) -> a + " " + b)
                                  .orElse("");
        Output.setText(outputText);        // TODO add your handling code here:
    }//GEN-LAST:event_DescendingActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
              Input.setText("");
              Output.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Ascending;
    private javax.swing.JButton Descending;
    private javax.swing.JTextField Input;
    private javax.swing.JTextField Output;
    private javax.swing.JButton Reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
