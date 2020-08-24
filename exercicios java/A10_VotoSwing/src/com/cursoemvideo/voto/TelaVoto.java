package com.cursoemvideo.voto;

public class TelaVoto extends javax.swing.JFrame {

    public TelaVoto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtAN = new javax.swing.JTextField();
        tbnCalc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblSit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ano de Nascimento");

        tbnCalc.setText("Posso Votar?");
        tbnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbnCalcActionPerformed(evt);
            }
        });

        jLabel2.setText("Idade");

        lblIdade.setText("0");

        lblSit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSit.setForeground(new java.awt.Color(255, 0, 0));
        lblSit.setText("Situação");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAN, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIdade))
                            .addComponent(tbnCalc)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(lblSit)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(tbnCalc)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblIdade))
                .addGap(27, 27, 27)
                .addComponent(lblSit)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbnCalcActionPerformed
        int AN = Integer.parseInt(txtAN.getText());
        int idade = 2020 - AN;
        lblIdade.setText(Integer.toString(idade));
        if (idade < 16) {
            lblSit.setText("NÃO VOTA!");
        } else {
            if ((idade >= 16 && idade < 18) || (idade > 70)) {
                lblSit.setText("OPCIONAL!");
            } else {
                lblSit.setText("OBRIGATÓRIO!");
            }
        }

    }//GEN-LAST:event_tbnCalcActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVoto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblSit;
    private javax.swing.JButton tbnCalc;
    private javax.swing.JTextField txtAN;
    // End of variables declaration//GEN-END:variables
}
