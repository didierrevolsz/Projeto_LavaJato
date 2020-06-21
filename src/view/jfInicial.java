package view;

public class jfInicial extends javax.swing.JFrame {

    public jfInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btCliente = new javax.swing.JButton();
        btFuncionario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btVeiculo = new javax.swing.JButton();
        btLavagem = new javax.swing.JButton();
        btAgendar = new javax.swing.JButton();
        btPagamento = new javax.swing.JButton();
        btServicos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jmFuncionario = new javax.swing.JMenuItem();
        jmCliente = new javax.swing.JMenuItem();
        jmVeiculo = new javax.swing.JMenuItem();
        jmServico = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/addcontact_113615 (1).png"))); // NOI18N
        btCliente.setText("Cliente");
        btCliente.setPreferredSize(new java.awt.Dimension(183, 73));
        btCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClienteActionPerformed(evt);
            }
        });

        btFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/contactcard_contactcard_tarjetadecontacto_4815.png"))); // NOI18N
        btFuncionario.setText("Funcionário");
        btFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionarioActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("LavaJato");

        btVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/front-car_icon-icons.com_72745.png"))); // NOI18N
        btVeiculo.setText("Veículo");
        btVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVeiculoActionPerformed(evt);
            }
        });

        btLavagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/car-wash_icon-icons.com_68574.png"))); // NOI18N
        btLavagem.setText("Lavagem");
        btLavagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLavagemActionPerformed(evt);
            }
        });

        btAgendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calendar-with-a-clock-time-tools_icon-icons.com_56831.png"))); // NOI18N
        btAgendar.setText("Agendar");

        btPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/banknotespaymentmoney_billetesdebanco_pag_3773.png"))); // NOI18N
        btPagamento.setText("Pagamento");
        btPagamento.setPreferredSize(new java.awt.Dimension(183, 73));

        btServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/settings-cogwheel-button_icon-icons.com_72559.png"))); // NOI18N
        btServicos.setText("Serviços");
        btServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btServicosActionPerformed(evt);
            }
        });

        jMenuCadastros.setText("Cadastro");

        jmFuncionario.setText("Funcionário");
        jmFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmFuncionario);

        jmCliente.setText("Cliente");
        jmCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmCliente);

        jmVeiculo.setText("Veículo");
        jmVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmVeiculoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmVeiculo);

        jmServico.setText("Servico");
        jmServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmServicoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmServico);

        jMenuBar1.add(jMenuCadastros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btServicos, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btAgendar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btLavagem, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVeiculo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFuncionario)
                    .addComponent(btLavagem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAgendar)
                    .addComponent(btPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btServicos)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFuncionarioActionPerformed
        // TODO add your handling code here:
        new FuncionarioView().setVisible(true);
    }//GEN-LAST:event_jmFuncionarioActionPerformed

    private void jmClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmClienteActionPerformed
        // TODO add your handling code here:
        new ClienteView().setVisible(true);
    }//GEN-LAST:event_jmClienteActionPerformed

    private void jmVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmVeiculoActionPerformed
        // TODO add your handling code here:
        new VeiculoView().setVisible(true);
    }//GEN-LAST:event_jmVeiculoActionPerformed

    private void btClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClienteActionPerformed
        // TODO add your handling code here:
        ClienteView consultar = new ClienteView();
        consultar.setVisible(true);
    }//GEN-LAST:event_btClienteActionPerformed

    private void btFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionarioActionPerformed
        // TODO add your handling code here:
        FuncionarioView consultar = new FuncionarioView();
        consultar.setVisible(true);
    }//GEN-LAST:event_btFuncionarioActionPerformed

    private void jmServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmServicoActionPerformed
        // TODO add your handling code here:
        new ServicoView().setVisible(true);
    }//GEN-LAST:event_jmServicoActionPerformed

    private void btLavagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLavagemActionPerformed
        // TODO add your handling code here:
        LavagemView lavagem = new LavagemView();
        lavagem.setVisible(true);
    }//GEN-LAST:event_btLavagemActionPerformed

    private void btServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btServicosActionPerformed
        // TODO add your handling code here:
        ServicoView consultar = new ServicoView();
        consultar.setVisible(true);
    }//GEN-LAST:event_btServicosActionPerformed

    private void btVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVeiculoActionPerformed
        // TODO add your handling code here:
        VeiculoView consultar = new VeiculoView();
        consultar.setVisible(true);
    }//GEN-LAST:event_btVeiculoActionPerformed

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
            java.util.logging.Logger.getLogger(jfInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAgendar;
    private javax.swing.JButton btCliente;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btLavagem;
    private javax.swing.JButton btPagamento;
    private javax.swing.JButton btServicos;
    private javax.swing.JButton btVeiculo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenuItem jmCliente;
    private javax.swing.JMenuItem jmFuncionario;
    private javax.swing.JMenuItem jmServico;
    private javax.swing.JMenuItem jmVeiculo;
    // End of variables declaration//GEN-END:variables
}
