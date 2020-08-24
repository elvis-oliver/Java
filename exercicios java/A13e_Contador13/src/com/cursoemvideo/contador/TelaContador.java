package com.cursoemvideo.contador;

import javax.swing.DefaultListModel;

public class TelaContador extends javax.swing.JFrame {

    public TelaContador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sliInicio = new javax.swing.JSlider();
        sliFim = new javax.swing.JSlider();
        sliPasso = new javax.swing.JSlider();
        lblInicio = new javax.swing.JLabel();
        lblFim = new javax.swing.JLabel();
        lblPasso = new javax.swing.JLabel();
        btnContar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCont = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("INICIO");

        jLabel2.setText("FIM");

        jLabel3.setText("PASSO");

        sliInicio.setMaximum(5);
        sliInicio.setValue(0);
        sliInicio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliInicioStateChanged(evt);
            }
        });

        sliFim.setMaximum(20);
        sliFim.setMinimum(6);
        sliFim.setValue(6);
        sliFim.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliFimStateChanged(evt);
            }
        });

        sliPasso.setMaximum(4);
        sliPasso.setMinimum(1);
        sliPasso.setMinorTickSpacing(1);
        sliPasso.setValue(1);
        sliPasso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliPassoStateChanged(evt);
            }
        });

        lblInicio.setText("0");

        lblFim.setText("0");

        lblPasso.setText("0");

        btnContar.setText("CONTAR");
        btnContar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstCont);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sliPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblPasso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel2)
                                    .addGap(18, 18, 18)
                                    .addComponent(sliFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblFim, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sliInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnContar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sliInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(lblInicio))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFim, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sliPasso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasso, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(48, 48, 48)
                        .addComponent(btnContar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sliInicioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliInicioStateChanged
        int inicio = sliInicio.getValue();
        lblInicio.setText(Integer.toString(inicio));
    }//GEN-LAST:event_sliInicioStateChanged

    private void sliFimStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliFimStateChanged
        int fim = sliFim.getValue();
        lblFim.setText(Integer.toString(fim));
    }//GEN-LAST:event_sliFimStateChanged

    private void sliPassoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliPassoStateChanged
        int passo = sliPasso.getValue();
        lblPasso.setText(Integer.toString(passo));
    }//GEN-LAST:event_sliPassoStateChanged

    private void btnContarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContarActionPerformed
        int inicio = sliInicio.getValue();
        int fim = sliFim.getValue();
        int passo = sliPasso.getValue();

        DefaultListModel lista = new DefaultListModel();

        for (int cc = inicio; cc <= fim; cc += passo) {
            lista.addElement(cc);
        }
        lstCont.setModel(lista);

    }//GEN-LAST:event_btnContarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFim;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblPasso;
    private javax.swing.JList<String> lstCont;
    private javax.swing.JSlider sliFim;
    private javax.swing.JSlider sliInicio;
    private javax.swing.JSlider sliPasso;
    // End of variables declaration//GEN-END:variables
}
