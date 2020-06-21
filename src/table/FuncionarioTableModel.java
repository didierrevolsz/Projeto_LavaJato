package table;

import model.Funcionario;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class FuncionarioTableModel extends AbstractTableModel{
    
    public static final int COL_ID_FUNCIONARIO = 0;
    public static final int COL_NOME_FUNCIONARIO = 1;
    public static final int COL_CPF_FUNCIONARIO = 2;
    public static final int COL_TELEFONE_FUNCIONARIO = 3;
    public static final int COL_EMAIL_FUNCIONARIO = 4;
    public ArrayList <Funcionario> lista;

    public FuncionarioTableModel (ArrayList<Funcionario> l){
        lista = new ArrayList<Funcionario> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Funcionario funcionario = lista.get(linhas);
        if (colunas == COL_ID_FUNCIONARIO) return funcionario.getId_funcionario();
        if (colunas == COL_NOME_FUNCIONARIO) return funcionario.getNome_funcionario();
        if (colunas == COL_CPF_FUNCIONARIO) return funcionario.getCpf_funcionario();
        if (colunas == COL_TELEFONE_FUNCIONARIO) return funcionario.getTelefone_funcionario();
        if (colunas == COL_EMAIL_FUNCIONARIO) return funcionario.getEmail_funcionario();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_FUNCIONARIO) return "Codigo";
        if (colunas == COL_NOME_FUNCIONARIO) return "Nome";
        if (colunas == COL_CPF_FUNCIONARIO) return "CPF";
        if (colunas == COL_TELEFONE_FUNCIONARIO) return "Fone";
        if (colunas == COL_EMAIL_FUNCIONARIO) return "E-mail";
        return "";
    } 

}
