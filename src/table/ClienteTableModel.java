package table;

import model.Cliente;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ClienteTableModel extends AbstractTableModel{
    
    public static final int COL_ID_CLIENTE = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_CPF_CLIENTE = 2;
    public static final int COL_TELEFONE_CLIENTE = 3;
    public static final int COL_EMAIL_CLIENTE = 4;
    
    public static final int COL_CEP = 5;
    public static final int COL_LOGRADOURO = 6;
    public static final int COL_NUMERO = 7;
    public static final int COL_BAIRRO = 8;
    public static final int COL_CIDADE = 9;
    public static final int COL_UF = 10;
    
    public ArrayList <Cliente> lista;

    public ClienteTableModel (ArrayList<Cliente> l){
        lista = new ArrayList<Cliente> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
   
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Cliente cliente = lista.get(linhas);
        if (colunas == COL_ID_CLIENTE) return cliente.getId_cliente();
        if (colunas == COL_NOME_CLIENTE) return cliente.getNome_cliente();
        if (colunas == COL_CPF_CLIENTE) return cliente.getCpf_cliente();
        if (colunas == COL_TELEFONE_CLIENTE) return cliente.getTelefone_cliente();
        if (colunas == COL_EMAIL_CLIENTE) return cliente.getEmail_cliente();
        
        if (colunas == COL_CEP) return cliente.getCep();
        if (colunas == COL_LOGRADOURO) return cliente.getLogradouro();
        if (colunas == COL_NUMERO) return cliente.getNumero();
        if (colunas == COL_BAIRRO) return cliente.getBairro();
        if (colunas == COL_CIDADE) return cliente.getCidade();
        if (colunas == COL_UF) return cliente.getUf();
        
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_CLIENTE) return "Codigo";
        if (colunas == COL_NOME_CLIENTE) return "Nome";
        if (colunas == COL_CPF_CLIENTE) return "CPF";
        if (colunas == COL_TELEFONE_CLIENTE) return "Fone";
        if (colunas == COL_EMAIL_CLIENTE) return "E-mail";
        
        if (colunas == COL_CEP) return "Cep";
        if (colunas == COL_LOGRADOURO) return "Rua";
        if (colunas == COL_NUMERO) return "Numero";
        if (colunas == COL_BAIRRO) return "Bairro";
        if (colunas == COL_CIDADE) return "Cidade";
        if (colunas == COL_UF) return "Uf";
        
        return "";
    } 

}
