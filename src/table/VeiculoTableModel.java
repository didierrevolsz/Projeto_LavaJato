package table;

import model.Veiculo;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class VeiculoTableModel extends AbstractTableModel{
    
    public static final int COL_ID_VEICULO = 0;
    public static final int COL_PLACA_VEICULO = 1;
    public static final int COL_MARCA_VEICULO = 2;
    public static final int COL_MODELO_VEICULO = 3;
    public static final int COL_TIPO_VEICULO = 4;
    public static final int COL_ANO_VEICULO = 5;
    public ArrayList <Veiculo> lista;

    public VeiculoTableModel (ArrayList<Veiculo> l){
        lista = new ArrayList<Veiculo> (l);
    }
    
    @Override
    public int getRowCount() {
      return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int linhas, int colunas) {
        Veiculo veiculo = lista.get(linhas);
        if (colunas == COL_ID_VEICULO) return veiculo.getId_veiculo();
        if (colunas == COL_PLACA_VEICULO) return veiculo.getPlaca_veiculo();
        if (colunas == COL_MARCA_VEICULO) return veiculo.getMarca_veiculo();
        if (colunas == COL_MODELO_VEICULO) return veiculo.getModelo_veiculo();
        if (colunas == COL_TIPO_VEICULO) return veiculo.getTipo_veiculo();
        if (colunas == COL_ANO_VEICULO) return veiculo.getAno_veiculo();
        return "";
    }
    
    @Override
    public String getColumnName(int colunas){
        if (colunas == COL_ID_VEICULO) return "Codigo";
        if (colunas == COL_PLACA_VEICULO) return "Placa";
        if (colunas == COL_MARCA_VEICULO) return "Marca";
        if (colunas == COL_MODELO_VEICULO) return "Modelo";
        if (colunas == COL_TIPO_VEICULO) return "Tipo";
        if (colunas == COL_ANO_VEICULO) return "Ano";
        return "";
    } 

}
