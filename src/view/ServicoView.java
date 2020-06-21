package view;

import dao.ServicoDAO;
import model.Servico;
import table.ServicoTableModel;

public class ServicoView extends javax.swing.JFrame {
    
    Servico pro = new Servico();
    ServicoDAO prd = new ServicoDAO();

    public ServicoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbServico.setModel(new ServicoTableModel(new ServicoDAO().Listartodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisaDescricaoServico = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbServico = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btLimparServico = new javax.swing.JButton();
        btExcluirServico = new javax.swing.JButton();
        btSalvarServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdServico = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        btCancelarServico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tfPreco_servicos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel4.setText("Pesquisar");

        tfPesquisaDescricaoServico.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaDescricaoServicoKeyPressed(evt);
            }
        });

        tbServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbServicoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbServico);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfPesquisaDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfPesquisaDescricaoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar | Alterar | Excluir"));

        btLimparServico.setText("Limpar");
        btLimparServico.setPreferredSize(new java.awt.Dimension(93, 29));
        btLimparServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparServicoActionPerformed(evt);
            }
        });

        btExcluirServico.setText("Excluir");
        btExcluirServico.setPreferredSize(new java.awt.Dimension(93, 29));
        btExcluirServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirServicoActionPerformed(evt);
            }
        });

        btSalvarServico.setText("Salvar");
        btSalvarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarServicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        tfIdServico.setEditable(false);

        btCancelarServico.setText("Cancelar");
        btCancelarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarServicoActionPerformed(evt);
            }
        });

        jLabel3.setText("Preço");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btCancelarServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btLimparServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluirServico, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvarServico, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDescricao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(tfIdServico)
                            .addComponent(tfPreco_servicos))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPreco_servicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarServico)
                    .addComponent(btCancelarServico))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarServicoActionPerformed
        // TODO add your handling code here:
        if (tfIdServico.getText().equals("")){
            pro.setDescricao(tfDescricao.getText());
            pro.setPreco_servico((Double.parseDouble(tfPreco_servicos.getText())));
            prd.inserir(pro);
        } else {
            pro.setDescricao(tfDescricao.getText());
            pro.setPreco_servico((Double.parseDouble(tfPreco_servicos.getText())));
            pro.setId_servico((Integer.parseInt(tfIdServico.getText())));
            prd.alterar (pro);
        }
        tbServico.setModel(new ServicoTableModel(new ServicoDAO().Listartodos()));
        tfIdServico.setText("");
        tfDescricao.setText("");
        tfPesquisaDescricaoServico.setText("");
        tfPreco_servicos.setText("");
    }//GEN-LAST:event_btSalvarServicoActionPerformed

    private void tbServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbServicoMouseClicked
        // TODO add your handling code here:
        tfIdServico.setText(tbServico.getValueAt(tbServico.getSelectedRow(), ServicoTableModel.COL_ID_SERVICOS).toString());
        tfDescricao.setText(tbServico.getValueAt(tbServico.getSelectedRow(), ServicoTableModel.COL_DESCRICAO).toString());
        tfPreco_servicos.setText(tbServico.getValueAt(tbServico.getSelectedRow(), ServicoTableModel.COL_PRECO_SERVICOS).toString());
    }//GEN-LAST:event_tbServicoMouseClicked

    private void btLimparServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparServicoActionPerformed
        tbServico.setModel(new ServicoTableModel(new ServicoDAO().Listartodos()));
        tfIdServico.setText("");
        tfDescricao.setText("");
        tfPesquisaDescricaoServico.setText("");
        tfPreco_servicos.setText("");
    }//GEN-LAST:event_btLimparServicoActionPerformed

    private void btExcluirServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirServicoActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfIdServico.getText());
        prd.excluir(codigo);
        tbServico.setModel(new ServicoTableModel(new ServicoDAO().Listartodos()));
        tfIdServico.setText("");
        tfDescricao.setText("");
        tfPesquisaDescricaoServico.setText("");
        tfPreco_servicos.setText("");
    }//GEN-LAST:event_btExcluirServicoActionPerformed

    private void tfPesquisaDescricaoServicoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoServicoKeyPressed
        String pesquisa = tfPesquisaDescricaoServico.getText();
        tbServico.setModel(new ServicoTableModel(new ServicoDAO().ListartodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisaDescricaoServicoKeyPressed

    private void btCancelarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarServicoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarServicoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarServico;
    private javax.swing.JButton btExcluirServico;
    private javax.swing.JButton btLimparServico;
    private javax.swing.JButton btSalvarServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbServico;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfIdServico;
    private javax.swing.JTextField tfPesquisaDescricaoServico;
    private javax.swing.JTextField tfPreco_servicos;
    // End of variables declaration//GEN-END:variables
}