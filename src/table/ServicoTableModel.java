package table;

import model.Servico;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ServicoTableModel extends AbstractTableModel{
    
    public static final int COL_ID_SERVICOS = 0;
    public static final int COL_DESCRICAO = 1;
    public static final int COL_PRECO_SERVICOS = 2;
    public ArrayList <Servico> lista;

    public ServicoTableModel (ArrayList<Servico> l){
        lista = new ArrayList<Servico> (l);
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
        Servico cliente = lista.get(linhas);
        if (colunas == COL_ID_SERVICOS) return cliente.getId_servico();
        if (colunas == COL_DESCRICAO) return cliente.getDescricao();
        if (colunas == COL_PRECO_SERVICOS) return cliente.getPreco_servicos();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_SERVICOS) return "Codigo";
        if (colunas == COL_DESCRICAO) return "Descrição";
        if (colunas == COL_PRECO_SERVICOS) return "Preço";
        return "";
    } 

}
