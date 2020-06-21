package view;

import dao.FuncionarioDAO;
import model.Funcionario;
import table.FuncionarioTableModel;

public class FuncionarioView extends javax.swing.JFrame {
    
    Funcionario pro = new Funcionario();
    FuncionarioDAO prd = new FuncionarioDAO();

    public FuncionarioView() {
        initComponents();
        setLocationRelativeTo(null);
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().Listartodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfpesquisadescricao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbFuncionario = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btlimpar = new javax.swing.JButton();
        btexcluir = new javax.swing.JButton();
        btsalvar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdFuncionario = new javax.swing.JTextField();
        tfNomeFuncionario = new javax.swing.JTextField();
        tfCpfFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btCancelarFuncionario = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTelefoneFuncionario = new javax.swing.JTextField();
        tfEmailFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionário");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel4.setText("Pesquisar");

        tfpesquisadescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfpesquisadescricaoKeyPressed(evt);
            }
        });

        tbFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbFuncionario);

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
                        .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfpesquisadescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar | Alterar | Excluir"));

        btlimpar.setText("Limpar");
        btlimpar.setPreferredSize(new java.awt.Dimension(93, 29));
        btlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlimparActionPerformed(evt);
            }
        });

        btexcluir.setText("Excluir");
        btexcluir.setPreferredSize(new java.awt.Dimension(93, 29));
        btexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btexcluirActionPerformed(evt);
            }
        });

        btsalvar.setText("Salvar");
        btsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btsalvarActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        tfIdFuncionario.setEditable(false);

        tfCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfFuncionarioActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        btCancelarFuncionario.setText("Cancelar");
        btCancelarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarFuncionarioActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone");

        jLabel6.setText("E-mail");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel1))
                            .addGap(29, 29, 29)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addComponent(tfCpfFuncionario)
                                .addComponent(tfIdFuncionario)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btCancelarFuncionario)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btsalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfTelefoneFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(tfEmailFuncionario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btlimpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btsalvar)
                    .addComponent(btCancelarFuncionario))
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

    private void tfCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfFuncionarioActionPerformed

    private void btsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btsalvarActionPerformed
        // TODO add your handling code here:
        if (tfIdFuncionario.getText().equals("")){
            pro.setNome_funcionario(tfNomeFuncionario.getText());
            pro.setCpf_funcionario(tfCpfFuncionario.getText());
            pro.setTelefone_funcionario(tfTelefoneFuncionario.getText());
            pro.setEmail_funcionario(tfEmailFuncionario.getText());
            prd.inserir(pro);
        } else {
            pro.setNome_funcionario(tfNomeFuncionario.getText());
            pro.setCpf_funcionario(tfCpfFuncionario.getText());
            pro.setTelefone_funcionario(tfTelefoneFuncionario.getText());
            pro.setEmail_funcionario(tfEmailFuncionario.getText());
            pro.setId_funcionario((Integer.parseInt(tfIdFuncionario.getText())));
            prd.alterar (pro);
        }
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().Listartodos()));
        tfIdFuncionario.setText("");
        tfNomeFuncionario.setText("");
        tfCpfFuncionario.setText("");
        tfTelefoneFuncionario.setText("");
        tfEmailFuncionario.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btsalvarActionPerformed

    private void tbFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionarioMouseClicked
        // TODO add your handling code here:
        tfIdFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_ID_FUNCIONARIO).toString());
        tfNomeFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_NOME_FUNCIONARIO).toString());
        tfCpfFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_CPF_FUNCIONARIO).toString());
        tfTelefoneFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_TELEFONE_FUNCIONARIO).toString());
        tfEmailFuncionario.setText(tbFuncionario.getValueAt(tbFuncionario.getSelectedRow(), FuncionarioTableModel.COL_EMAIL_FUNCIONARIO).toString());
    }//GEN-LAST:event_tbFuncionarioMouseClicked

    private void btlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlimparActionPerformed
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().Listartodos()));
        tfIdFuncionario.setText("");
        tfNomeFuncionario.setText("");
        tfCpfFuncionario.setText("");
        tfTelefoneFuncionario.setText("");
        tfEmailFuncionario.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btlimparActionPerformed

    private void btexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btexcluirActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfIdFuncionario.getText());
        prd.excluir(codigo);
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().Listartodos()));
        tfIdFuncionario.setText("");
        tfNomeFuncionario.setText("");
        tfCpfFuncionario.setText("");
        tfTelefoneFuncionario.setText("");
        tfEmailFuncionario.setText("");
        tfpesquisadescricao.setText("");
    }//GEN-LAST:event_btexcluirActionPerformed

    private void tfpesquisadescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfpesquisadescricaoKeyPressed
        String pesquisa = tfpesquisadescricao.getText();
        tbFuncionario.setModel(new FuncionarioTableModel(new FuncionarioDAO().ListartodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfpesquisadescricaoKeyPressed

    private void btCancelarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarFuncionarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarFuncionarioActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarFuncionario;
    private javax.swing.JButton btexcluir;
    private javax.swing.JButton btlimpar;
    private javax.swing.JButton btsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbFuncionario;
    private javax.swing.JTextField tfCpfFuncionario;
    private javax.swing.JTextField tfEmailFuncionario;
    private javax.swing.JTextField tfIdFuncionario;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfTelefoneFuncionario;
    private javax.swing.JTextField tfpesquisadescricao;
    // End of variables declaration//GEN-END:variables
}
