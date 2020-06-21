package view;

import dao.VeiculoDAO;
import model.Veiculo;
import table.VeiculoTableModel;

import view.PesquisarCliente;

public class VeiculoView extends javax.swing.JFrame {
    
    Veiculo pro = new Veiculo();
    VeiculoDAO prd = new VeiculoDAO();

    public VeiculoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbVeiculo.setModel(new VeiculoTableModel(new VeiculoDAO().Listartodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisaDescricaoVeiculo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbVeiculo = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btLimparVeiculo = new javax.swing.JButton();
        btExcluirVeiculo = new javax.swing.JButton();
        btSalvarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdVeiculo = new javax.swing.JTextField();
        tfMarcaVeiculo = new javax.swing.JTextField();
        tfModeloVeiculo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btCancelarVeiculo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTipoVeiculo = new javax.swing.JTextField();
        tfPlacaVeiculo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tfAnoVeiculo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tfPesquisarCliente = new javax.swing.JTextField();
        btPesquisarCliente = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        tfPesquisarCpf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfIdPesquisar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veículo");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel4.setText("Pesquisar");

        tfPesquisaDescricaoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaDescricaoVeiculoActionPerformed(evt);
            }
        });
        tfPesquisaDescricaoVeiculo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaDescricaoVeiculoKeyPressed(evt);
            }
        });

        tbVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVeiculoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbVeiculo);

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
                        .addComponent(tfPesquisaDescricaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfPesquisaDescricaoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar | Alterar | Excluir"));

        btLimparVeiculo.setText("Limpar");
        btLimparVeiculo.setPreferredSize(new java.awt.Dimension(93, 29));
        btLimparVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparVeiculoActionPerformed(evt);
            }
        });

        btExcluirVeiculo.setText("Excluir");
        btExcluirVeiculo.setPreferredSize(new java.awt.Dimension(93, 29));
        btExcluirVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirVeiculoActionPerformed(evt);
            }
        });

        btSalvarCliente.setText("Salvar");
        btSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Marca");

        tfIdVeiculo.setEditable(false);
        tfIdVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdVeiculoActionPerformed(evt);
            }
        });

        tfModeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfModeloVeiculoActionPerformed(evt);
            }
        });

        jLabel3.setText("Modelo");

        btCancelarVeiculo.setText("Cancelar");
        btCancelarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarVeiculoActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo");

        jLabel6.setText("Placa");

        jLabel7.setText("Ano");

        tfAnoVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAnoVeiculoActionPerformed(evt);
            }
        });

        jLabel8.setText("Dono");

        tfPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisarClienteActionPerformed(evt);
            }
        });

        btPesquisarCliente.setText("Pesquisar");
        btPesquisarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarClienteActionPerformed(evt);
            }
        });

        jLabel9.setText("CPF Dono");

        jLabel10.setText("ID Dono");

        tfIdPesquisar.setEditable(false);
        tfIdPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btCancelarVeiculo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btLimparVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btExcluirVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btSalvarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfModeloVeiculo)
                                            .addComponent(tfIdVeiculo)
                                            .addComponent(tfTipoVeiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfIdPesquisar)
                                    .addComponent(tfAnoVeiculo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btPesquisarCliente))
                                    .addComponent(tfPesquisarCpf, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(57, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPlacaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfModeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTipoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfMarcaVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tfAnoVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tfPesquisarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPesquisarCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tfPesquisarCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tfIdPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarCliente)
                    .addComponent(btCancelarVeiculo))
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

    private void tbVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVeiculoMouseClicked
        // TODO add your handling code here:
        tfIdVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_ID_VEICULO).toString());
        tfPlacaVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_PLACA_VEICULO).toString());
        tfMarcaVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_MARCA_VEICULO).toString());
        tfModeloVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_MODELO_VEICULO).toString());
        tfTipoVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_TIPO_VEICULO).toString());
        tfAnoVeiculo.setText(tbVeiculo.getValueAt(tbVeiculo.getSelectedRow(), VeiculoTableModel.COL_ANO_VEICULO).toString());
    }//GEN-LAST:event_tbVeiculoMouseClicked

    private void tfPesquisaDescricaoVeiculoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoVeiculoKeyPressed
        String pesquisa = tfPesquisaDescricaoVeiculo.getText();
        tbVeiculo.setModel(new VeiculoTableModel(new VeiculoDAO().ListartodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisaDescricaoVeiculoKeyPressed

    private void tfPesquisaDescricaoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaDescricaoVeiculoActionPerformed

    private void btCancelarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarVeiculoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarVeiculoActionPerformed

    private void tfModeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfModeloVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfModeloVeiculoActionPerformed

    private void btSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarClienteActionPerformed
        // TODO add your handling code here:
        if (tfIdVeiculo.getText().equals("")){
            pro.setPlaca_veiculo(tfPlacaVeiculo.getText());
            pro.setMarca_veiculo(tfMarcaVeiculo.getText());
            pro.setModelo_veiculo(tfModeloVeiculo.getText());
            pro.setTipo_veiculo(tfTipoVeiculo.getText());
            pro.setAno_veiculo((Integer.parseInt(tfAnoVeiculo.getText())));
            
            pro.setId_cliente((Integer.parseInt(tfIdPesquisar.getText())));
            
            prd.inserir(pro);
        } else {
            pro.setPlaca_veiculo(tfPlacaVeiculo.getText());
            pro.setMarca_veiculo(tfMarcaVeiculo.getText());
            pro.setModelo_veiculo(tfModeloVeiculo.getText());
            pro.setTipo_veiculo(tfTipoVeiculo.getText());
            pro.setAno_veiculo((Integer.parseInt(tfAnoVeiculo.getText())));
            pro.setId_veiculo((Integer.parseInt(tfIdVeiculo.getText())));
            
            pro.setId_cliente((Integer.parseInt(tfIdPesquisar.getText())));
            
            prd.alterar (pro);
        }
        tbVeiculo.setModel(new VeiculoTableModel(new VeiculoDAO().Listartodos()));
        tfIdVeiculo.setText("");
        tfPlacaVeiculo.setText("");
        tfMarcaVeiculo.setText("");
        tfModeloVeiculo.setText("");
        tfTipoVeiculo.setText("");
        tfAnoVeiculo.setText("");
        tfPesquisaDescricaoVeiculo.setText("");
    }//GEN-LAST:event_btSalvarClienteActionPerformed

    private void btExcluirVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirVeiculoActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfIdVeiculo.getText());
        prd.excluir(codigo);
        tbVeiculo.setModel(new VeiculoTableModel(new VeiculoDAO().Listartodos()));
        tfIdVeiculo.setText("");
        tfMarcaVeiculo.setText("");
        tfModeloVeiculo.setText("");
        tfTipoVeiculo.setText("");
        tfPlacaVeiculo.setText("");
        tfAnoVeiculo.setText("");
        tfPesquisaDescricaoVeiculo.setText("");
        tfIdPesquisar.setText("");
        
    }//GEN-LAST:event_btExcluirVeiculoActionPerformed

    private void btLimparVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparVeiculoActionPerformed
        tbVeiculo.setModel(new VeiculoTableModel(new VeiculoDAO().Listartodos()));
        tfIdVeiculo.setText("");
        tfMarcaVeiculo.setText("");
        tfModeloVeiculo.setText("");
        tfTipoVeiculo.setText("");
        tfPlacaVeiculo.setText("");
        tfAnoVeiculo.setText("");
        tfPesquisaDescricaoVeiculo.setText("");
        tfPesquisarCliente.setText("");
        tfIdPesquisar.setText("");
        tfPesquisarCpf.setText("");
    }//GEN-LAST:event_btLimparVeiculoActionPerformed

    private void tfIdVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdVeiculoActionPerformed

    private void btPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarClienteActionPerformed
        // TODO add your handling code here:
        //PesquisarCliente pesquisarCliente = new PesquisarCliente(this.tfPesquisarCliente);
        PesquisarCliente pesquisarCliente = new PesquisarCliente(this.tfIdPesquisar);
        pesquisarCliente.setLocationRelativeTo(null);
        pesquisarCliente.setVisible(true);
    }//GEN-LAST:event_btPesquisarClienteActionPerformed

    private void tfAnoVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAnoVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfAnoVeiculoActionPerformed

    private void tfPesquisarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisarClienteActionPerformed

    private void tfIdPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdPesquisarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarVeiculo;
    private javax.swing.JButton btExcluirVeiculo;
    private javax.swing.JButton btLimparVeiculo;
    private javax.swing.JButton btPesquisarCliente;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbVeiculo;
    private javax.swing.JTextField tfAnoVeiculo;
    private javax.swing.JTextField tfIdPesquisar;
    private javax.swing.JTextField tfIdVeiculo;
    private javax.swing.JTextField tfMarcaVeiculo;
    private javax.swing.JTextField tfModeloVeiculo;
    private javax.swing.JTextField tfPesquisaDescricaoVeiculo;
    private javax.swing.JTextField tfPesquisarCliente;
    private javax.swing.JTextField tfPesquisarCpf;
    private javax.swing.JTextField tfPlacaVeiculo;
    private javax.swing.JTextField tfTipoVeiculo;
    // End of variables declaration//GEN-END:variables
}