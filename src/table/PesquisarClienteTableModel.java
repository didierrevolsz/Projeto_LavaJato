package table;

import model.Cliente;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class PesquisarClienteTableModel extends AbstractTableModel{
    
    public static final int COL_ID_CLIENTE = 0;
    public static final int COL_NOME_CLIENTE = 1;
    public static final int COL_CPF_CLIENTE = 2;
    
    public ArrayList <Cliente> lista;

    public PesquisarClienteTableModel (ArrayList<Cliente> l){
        lista = new ArrayList<Cliente> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Cliente cliente = lista.get(linhas);
        if (colunas == COL_ID_CLIENTE) return cliente.getId_cliente();
        if (colunas == COL_NOME_CLIENTE) return cliente.getNome_cliente();
        if (colunas == COL_CPF_CLIENTE) return cliente.getCpf_cliente();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_CLIENTE) return "Codigo";
        if (colunas == COL_NOME_CLIENTE) return "Nome";
        if (colunas == COL_CPF_CLIENTE) return "CPF";
        return "";
    } 

}