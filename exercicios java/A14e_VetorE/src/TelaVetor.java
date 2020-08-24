import java.util.Arrays;
import javax.swing.DefaultListModel;
public class TelaVetor extends javax.swing.JFrame {

    int vetor[] = new int[5];
    DefaultListModel lista = new DefaultListModel();
    int selecionado = 0;

    public TelaVetor() {
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNum = new javax.swing.JSpinner();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSelecionado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVetor = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAdd.setText("Adicionar");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remover");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnOrder.setText("Ordenar");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        jLabel1.setText("Vetor");

        lblSelecionado.setText("0");

        lstVetor.setModel(lista);
        lstVetor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstVetorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstVetor);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrder)
                    .addComponent(btnRemove)
                    .addComponent(btnAdd))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSelecionado)
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelecionado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRemove)
                            .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnOrder)
                        .addGap(27, 27, 27)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    private void lstVetorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstVetorMouseClicked
        selecionado = lstVetor.getSelectedIndex();
        lblSelecionado.setText("[" + selecionado + "]");
    }//GEN-LAST:event_lstVetorMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        vetor[selecionado] = 0;
        lista.removeAllElements();
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        lista.removeAllElements();
        Arrays.sort(vetor);
        for (int c = 0; c < vetor.length; c++) {
            lista.addElement(vetor[c]);
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaVetor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSelecionado;
    private javax.swing.JList<String> lstVetor;
    private javax.swing.JSpinner txtNum;
    // End of variables declaration//GEN-END:variables
}
