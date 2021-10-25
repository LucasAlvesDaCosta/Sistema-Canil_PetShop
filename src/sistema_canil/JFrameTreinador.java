package sistema_canil;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JFrameTreinador extends javax.swing.JFrame {

    public JFramePrincipal jfp = new JFramePrincipal();
    public ArrayList<Treinador> lstt = new ArrayList<Treinador>();
    
    public JFrameTreinador(ArrayList<Treinador> lstt, JFramePrincipal jfp) {
        this.jfp = jfp;
        this.lstt = lstt;
        jfp.setEnabled(false);
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

        jLabel1 = new javax.swing.JLabel();
        btnTreinadorCad = new javax.swing.JButton();
        btnTreinadorLimpar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtNomeTreinadorCad = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCPFTreinadorCad = new javax.swing.JTextField();
        txtTelefoneTreinadorCad = new javax.swing.JTextField();
        txtEnderecoTreinadorCad = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Treinadores");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Cadastro de Treinadores");

        btnTreinadorCad.setText("Cadastrar!");
        btnTreinadorCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinadorCadActionPerformed(evt);
            }
        });

        btnTreinadorLimpar.setText("Limpar!");
        btnTreinadorLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTreinadorLimparActionPerformed(evt);
            }
        });

        jLabel12.setText("Nome:");

        jLabel13.setText("CPF:");

        jLabel14.setText("Endereço:");

        jLabel15.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTreinadorLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTreinadorCad))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(jLabel1)
                        .addGap(0, 164, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel13)
                        .addComponent(jLabel14))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNomeTreinadorCad, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtCPFTreinadorCad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtTelefoneTreinadorCad))
                        .addComponent(txtEnderecoTreinadorCad))
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnTreinadorCad, btnTreinadorLimpar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTreinadorCad)
                    .addComponent(btnTreinadorLimpar))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(txtNomeTreinadorCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtCPFTreinadorCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)
                        .addComponent(txtTelefoneTreinadorCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtEnderecoTreinadorCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(55, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        jfp.setEnabled(true);
        jfp.setVisible(true);
    }//GEN-LAST:event_formWindowClosed

    private void btnTreinadorLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinadorLimparActionPerformed
        txtNomeTreinadorCad.setText("");
        txtCPFTreinadorCad.setText("");
        txtEnderecoTreinadorCad.setText("");
        txtTelefoneTreinadorCad.setText("");
    }//GEN-LAST:event_btnTreinadorLimparActionPerformed

    private void btnTreinadorCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTreinadorCadActionPerformed
        if(txtNomeTreinadorCad.getText().trim().equals("") || txtCPFTreinadorCad.getText().trim().equals("")
                || txtEnderecoTreinadorCad.getText().trim().equals("") || txtTelefoneTreinadorCad.getText().trim().equals("")){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        else{
            Treinador t = new Treinador();
            t.setNome(txtNomeTreinadorCad.getText());
            t.setCpf(txtCPFTreinadorCad.getText());
            t.setEndereco(txtEnderecoTreinadorCad.getText());
            t.setTelefone(txtTelefoneTreinadorCad.getText());
            lstt.add(t);
            JOptionPane.showMessageDialog(this, "Treinador Cadastrado com Sucesso!", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
            txtNomeTreinadorCad.setText("");
            txtCPFTreinadorCad.setText("");
            txtEnderecoTreinadorCad.setText("");
            txtTelefoneTreinadorCad.setText("");
            jfp.recarregarTreinador(lstt.size()-1);
        }
    }//GEN-LAST:event_btnTreinadorCadActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTreinador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameTreinador(null, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTreinadorCad;
    private javax.swing.JButton btnTreinadorLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JTextField txtCPFTreinadorCad;
    private javax.swing.JTextField txtEnderecoTreinadorCad;
    private javax.swing.JTextField txtNomeTreinadorCad;
    private javax.swing.JTextField txtTelefoneTreinadorCad;
    // End of variables declaration//GEN-END:variables
}