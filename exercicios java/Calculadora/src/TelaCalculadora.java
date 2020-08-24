
public class TelaCalculadora extends javax.swing.JFrame {

    public TelaCalculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        lblDisplay = new javax.swing.JLabel();
        btnIgual = new javax.swing.JButton();
        btnAd = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnMult = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        btnPorc = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnPonto = new javax.swing.JButton();
        btnNeg = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn1.setBackground(new java.awt.Color(102, 255, 102));
        btn1.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn1.setForeground(new java.awt.Color(51, 102, 0));
        btn1.setText("1");
        btn1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn2.setBackground(new java.awt.Color(102, 255, 102));
        btn2.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn2.setForeground(new java.awt.Color(51, 102, 0));
        btn2.setText("2");
        btn2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.setBackground(new java.awt.Color(102, 255, 102));
        btn3.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn3.setForeground(new java.awt.Color(51, 102, 0));
        btn3.setText("3");
        btn3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.setBackground(new java.awt.Color(102, 255, 102));
        btn4.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn4.setForeground(new java.awt.Color(51, 102, 0));
        btn4.setText("4");
        btn4.setMargin(new java.awt.Insets(1, 1, 1, 1));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn5.setBackground(new java.awt.Color(102, 255, 102));
        btn5.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn5.setForeground(new java.awt.Color(51, 102, 0));
        btn5.setText("5");
        btn5.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btn7.setBackground(new java.awt.Color(102, 255, 102));
        btn7.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn7.setForeground(new java.awt.Color(51, 102, 0));
        btn7.setText("7");
        btn7.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btn6.setBackground(new java.awt.Color(102, 255, 102));
        btn6.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn6.setForeground(new java.awt.Color(51, 102, 0));
        btn6.setText("6");
        btn6.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btn8.setBackground(new java.awt.Color(102, 255, 102));
        btn8.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn8.setForeground(new java.awt.Color(51, 102, 0));
        btn8.setText("8");
        btn8.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btn9.setBackground(new java.awt.Color(102, 255, 102));
        btn9.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn9.setForeground(new java.awt.Color(51, 102, 0));
        btn9.setText("9");
        btn9.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btn0.setBackground(new java.awt.Color(102, 255, 102));
        btn0.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btn0.setForeground(new java.awt.Color(51, 102, 0));
        btn0.setText("0");
        btn0.setMargin(new java.awt.Insets(1, 1, 1, 1));

        lblDisplay.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDisplay.setText("DISPLAY");

        btnIgual.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnIgual.setText("=");
        btnIgual.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnAd.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnAd.setText("+");
        btnAd.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnSub.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnSub.setText("-");
        btnSub.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnMult.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnMult.setText("X");
        btnMult.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnDiv.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnDiv.setText("/");
        btnDiv.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnApagar.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnApagar.setText("C");
        btnApagar.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnPorc.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnPorc.setText("%");
        btnPorc.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnExp.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnExp.setText("<html>X<sup>2</sup></html>");
        btnExp.setAlignmentY(0.0F);
        btnExp.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnPonto.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnPonto.setText(".");
        btnPonto.setMargin(new java.awt.Insets(1, 1, 1, 1));

        btnNeg.setFont(new java.awt.Font("Agency FB", 1, 15)); // NOI18N
        btnNeg.setText("+/-");
        btnNeg.setMargin(new java.awt.Insets(1, 1, 1, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnNeg, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnPonto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnAd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnMult, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPorc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnApagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnMult, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn5, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnAd, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnIgual, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnPonto, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(btnNeg, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    String numAntigo = "";
    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String numNovo = numAntigo + "1";
        lblDisplay.setText(numNovo);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String numNovo = numAntigo + "2";
        lblDisplay.setText(numNovo);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String numNovo = numAntigo + "3";
        lblDisplay.setText(numNovo);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed

    }//GEN-LAST:event_btn4ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAd;
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnIgual;
    private javax.swing.JButton btnMult;
    private javax.swing.JButton btnNeg;
    private javax.swing.JButton btnPonto;
    private javax.swing.JButton btnPorc;
    private javax.swing.JButton btnSub;
    private javax.swing.JLabel lblDisplay;
    // End of variables declaration//GEN-END:variables
}
