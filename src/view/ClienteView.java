package view;

import dao.ClienteDAO;

import model.Cliente;
import table.ClienteTableModel;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.JOptionPane;

public class ClienteView extends javax.swing.JFrame {
    
     String logradouro;      
     String bairro;
     String cidade;
     String uf;
    //
    public void buscarCep(String cep) {
        
        String json;        

        try {
            URL url = new URL("http://viacep.com.br/ws/"+ cep +"/json");
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            StringBuilder jsonSb = new StringBuilder();

            br.lines().forEach(l -> jsonSb.append(l.trim()));
            json = jsonSb.toString();
            
            // JOptionPane.showMessageDialog(null, json);
            
            json = json.replaceAll("[{},:]", "");
            json = json.replaceAll("\"", "\n");                       
            String array[] = new String[30];
            array = json.split("\n");
            
            //JOptionPane.showMessageDialog(null, array);
            
            logradouro = array[7];            
            bairro = array[15];
            cidade = array[19]; 
            uf = array[23];
            
            jTxtLogradouro.setText(logradouro);
            jTxtBairro.setText(bairro);
            jTxtCidade.setText(cidade);
            jTxtEstado.setText(uf);
            //JOptionPane.showMessageDialog(null, logradouro + " " + bairro + " " + cidade + " " + uf);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    Cliente pro = new Cliente();
    ClienteDAO prd = new ClienteDAO();

    public ClienteView() {
        initComponents();
        setLocationRelativeTo(null);
        tbCliente.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisaDescricaoCliente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCliente = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        btLimparCliente = new javax.swing.JButton();
        btExcluirCliente = new javax.swing.JButton();
        btSalvarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfIdCliente = new javax.swing.JTextField();
        tfNomeCliente = new javax.swing.JTextField();
        tfCpfCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btCancelarCliente = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfTelefoneCliente = new javax.swing.JTextField();
        tfEmailCliente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTxtCep = new javax.swing.JTextField();
        jTxtLogradouro = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jTxtBairro = new javax.swing.JTextField();
        jTxtCidade = new javax.swing.JTextField();
        jTxtEstado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));

        jLabel4.setText("Pesquisar");

        tfPesquisaDescricaoCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaDescricaoClienteKeyPressed(evt);
            }
        });

        tbCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbCliente);

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
                        .addComponent(tfPesquisaDescricaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 448, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(tfPesquisaDescricaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Cadastrar | Alterar | Excluir"));

        btLimparCliente.setText("Limpar");
        btLimparCliente.setPreferredSize(new java.awt.Dimension(93, 29));
        btLimparCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparClienteActionPerformed(evt);
            }
        });

        btExcluirCliente.setText("Excluir");
        btExcluirCliente.setPreferredSize(new java.awt.Dimension(93, 29));
        btExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteActionPerformed(evt);
            }
        });

        btSalvarCliente.setText("Salvar");
        btSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarClienteActionPerformed(evt);
            }
        });

        jLabel1.setText("Código");

        jLabel2.setText("Nome");

        tfIdCliente.setEditable(false);

        tfNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeClienteActionPerformed(evt);
            }
        });

        tfCpfCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfClienteActionPerformed(evt);
            }
        });

        jLabel3.setText("CPF");

        btCancelarCliente.setText("Cancelar");
        btCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarClienteActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefone");

        jLabel6.setText("E-mail");

        jLabel7.setText("CEP:");

        jLabel8.setText("Logradouro:");

        jLabel9.setText("Número:");

        jLabel10.setText("Bairro:");

        jLabel11.setText("Cidade:");

        jLabel12.setText("UF:");

        jButton1.setText("Pesquisar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

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
                                .addComponent(tfNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addComponent(tfCpfCliente)
                                .addComponent(tfIdCliente)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(btCancelarCliente)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btSalvarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                                .addComponent(tfEmailCliente)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(54, 54, 54))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel12))
                                    .addGap(31, 31, 31)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTxtLogradouro)
                                .addComponent(jTxtEstado)
                                .addComponent(jTxtCidade)
                                .addComponent(jTxtBairro)
                                .addComponent(jTextNumero)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jButton1)
                                    .addGap(0, 0, Short.MAX_VALUE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tfEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTxtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTxtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTxtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTxtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTxtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btLimparCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btSalvarCliente)
                    .addComponent(btCancelarCliente))
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

    private void tfCpfClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfClienteActionPerformed

    private void btSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarClienteActionPerformed
        // TODO add your handling code here:
            if (tfIdCliente.getText().equals("")){
            pro.setNome_cliente(tfNomeCliente.getText());
            pro.setCpf_cliente(tfCpfCliente.getText());
            pro.setTelefone_cliente(tfTelefoneCliente.getText());
            pro.setEmail_cliente(tfEmailCliente.getText());
            
            pro.setCep(jTxtCep.getText());
            pro.setLogradouro(jTxtLogradouro.getText());
            pro.setNumero(jTextNumero.getText());
            pro.setBairro(jTxtBairro.getText());
            pro.setCidade(jTxtCidade.getText());
            pro.setUf(jTxtEstado.getText());
             
            prd.inserir(pro);
            
        } else {
            pro.setNome_cliente(tfNomeCliente.getText());
            pro.setCpf_cliente(tfCpfCliente.getText());
            pro.setTelefone_cliente(tfTelefoneCliente.getText());
            pro.setEmail_cliente(tfEmailCliente.getText());
            pro.setId_cliente((Integer.parseInt(tfIdCliente.getText())));
            
            pro.setCep(jTxtCep.getText());
            pro.setLogradouro(jTxtLogradouro.getText());
            pro.setNumero(jTextNumero.getText());
            pro.setBairro(jTxtBairro.getText());
            pro.setCidade(jTxtCidade.getText());
            pro.setUf(jTxtEstado.getText());
           
            prd.alterar (pro);
            
        }
        tbCliente.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
        tfIdCliente.setText("");
        tfNomeCliente.setText("");
        tfCpfCliente.setText("");
        tfTelefoneCliente.setText("");
        tfEmailCliente.setText("");
        tfPesquisaDescricaoCliente.setText("");
        
        jTxtCep.setText("");
        jTxtLogradouro.setText("");
        jTextNumero.setText("");
        jTxtBairro.setText("");
        jTxtCidade.setText("");
        jTxtEstado.setText("");
    }//GEN-LAST:event_btSalvarClienteActionPerformed

    private void tbClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClienteMouseClicked
        // TODO add your handling code here:
        tfIdCliente.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_ID_CLIENTE).toString());
        tfNomeCliente.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_NOME_CLIENTE).toString());
        tfCpfCliente.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_CPF_CLIENTE).toString());
        tfTelefoneCliente.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_TELEFONE_CLIENTE).toString());
        tfEmailCliente.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_EMAIL_CLIENTE).toString());
        
        jTxtCep.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_CEP).toString());
        jTxtLogradouro.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_LOGRADOURO).toString());
        jTextNumero.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_NUMERO).toString());
        jTxtBairro.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_BAIRRO).toString());
        jTxtCidade.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_CIDADE).toString());
        jTxtEstado.setText(tbCliente.getValueAt(tbCliente.getSelectedRow(), ClienteTableModel.COL_UF).toString());
    }//GEN-LAST:event_tbClienteMouseClicked

    private void btLimparClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparClienteActionPerformed
        tbCliente.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
        tfIdCliente.setText("");
        tfNomeCliente.setText("");
        tfCpfCliente.setText("");
        tfTelefoneCliente.setText("");
        tfEmailCliente.setText("");
        tfPesquisaDescricaoCliente.setText("");
        
        jTxtCep.setText("");
        jTxtLogradouro.setText("");
        jTextNumero.setText("");
        jTxtBairro.setText("");
        jTxtCidade.setText("");
        jTxtEstado.setText("");
    }//GEN-LAST:event_btLimparClienteActionPerformed

    private void btExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteActionPerformed
        // TODO add your handling code here:
        int codigo = Integer.parseInt(tfIdCliente.getText());
        prd.excluir(codigo);
        tbCliente.setModel(new ClienteTableModel(new ClienteDAO().Listartodos()));
        tfIdCliente.setText("");
        tfNomeCliente.setText("");
        tfCpfCliente.setText("");
        tfTelefoneCliente.setText("");
        tfEmailCliente.setText("");
        tfPesquisaDescricaoCliente.setText("");
        
        jTxtCep.setText("");
        jTxtLogradouro.setText("");
        jTextNumero.setText("");
        jTxtBairro.setText("");
        jTxtCidade.setText("");
        jTxtEstado.setText("");
    }//GEN-LAST:event_btExcluirClienteActionPerformed

    private void tfPesquisaDescricaoClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoClienteKeyPressed
        String pesquisa = tfPesquisaDescricaoCliente.getText();
        tbCliente.setModel(new ClienteTableModel(new ClienteDAO().ListartodosDescricao(pesquisa)));
    }//GEN-LAST:event_tfPesquisaDescricaoClienteKeyPressed

    private void btCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarClienteActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btCancelarClienteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        buscarCep(jTxtCep.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tfNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeClienteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarCliente;
    private javax.swing.JButton btExcluirCliente;
    private javax.swing.JButton btLimparCliente;
    private javax.swing.JButton btSalvarCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextField jTxtBairro;
    private javax.swing.JTextField jTxtCep;
    private javax.swing.JTextField jTxtCidade;
    private javax.swing.JTextField jTxtEstado;
    private javax.swing.JTextField jTxtLogradouro;
    private javax.swing.JTable tbCliente;
    private javax.swing.JTextField tfCpfCliente;
    private javax.swing.JTextField tfEmailCliente;
    private javax.swing.JTextField tfIdCliente;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfPesquisaDescricaoCliente;
    private javax.swing.JTextField tfTelefoneCliente;
    // End of variables declaration//GEN-END:variables
}
