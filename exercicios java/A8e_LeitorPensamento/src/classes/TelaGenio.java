package classes;

import java.awt.Font;
import static javafx.scene.text.Font.font;

public class TelaGenio extends javax.swing.JFrame {

    public TelaGenio() {
        initComponents();
        lblFrase.setText("<html>Vou pensar em um valor entre <strong>1 e 5</strong>. Tente advinhar!</html>");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNum = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("jLabel1");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 160, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aula 8 - balão de pensamento.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, -30, 257, 225));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/aula 8 - genio pensando.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, -1, -1));

        jLabel4.setText("Valor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));

        txtNum.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(txtNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 40, 30));

        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPalpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        double n = (1 - Math.random() * (1 - 6));
        int num = (int) n;

        int numU = Integer.parseInt(txtNum.getValue().toString());
        String f1 = "<html> ACERTOU! </html>";
        String f2 = "<html> ERROU! eu pensei no valor " + num + "</html>";
        String res = (num == numU) ? f1 : f2;
        lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 14));
        lblFrase.setText(res);
    }//GEN-LAST:event_btnPalpiteActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
