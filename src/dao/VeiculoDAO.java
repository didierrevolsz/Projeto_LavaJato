package dao;

import model.Veiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class VeiculoDAO {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Veiculo> lista = new ArrayList<Veiculo>();
    
public VeiculoDAO(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Veiculo veiculo) {
    String sql = "INSERT INTO veiculo_tb (placa_veiculo, marca_veiculo, modelo_veiculo, tipo_veiculo, ano_veiculo, id_cliente) VALUES (? , ?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, veiculo.getPlaca_veiculo());
        stmt.setString(2, veiculo.getMarca_veiculo());
        stmt.setString(3, veiculo.getModelo_veiculo());
        stmt.setString(4, veiculo.getTipo_veiculo());
        stmt.setInt(5, veiculo.getAno_veiculo());

        stmt.setInt(6, veiculo.getId_cliente());
        
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Veiculo veiculo) {
        String sql = "UPDATE veiculo_tb SET placa_veiculo = ?, marca_veiculo = ?, modelo_veiculo = ?, tipo_veiculo = ?, ano_veiculo = ?, id_cliente = ? WHERE id_veiculo = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, veiculo.getPlaca_veiculo());
            stmt.setString(2, veiculo.getMarca_veiculo());
            stmt.setString(3, veiculo.getModelo_veiculo());
            stmt.setString(4, veiculo.getTipo_veiculo());
            stmt.setInt(5, veiculo.getAno_veiculo());
            stmt.setInt(6, veiculo.getId_veiculo());
            
            stmt.setInt(7, veiculo.getId_cliente());
            
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM veiculo_tb WHERE id_veiculo = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Veiculo> Listartodos(){
        String sql = "SELECT * FROM veiculo_tb";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId_veiculo(rs.getInt("id_veiculo"));
                veiculo.setPlaca_veiculo(rs.getString("placa_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setTipo_veiculo(rs.getString("tipo_veiculo"));
                veiculo.setAno_veiculo(rs.getInt("ano_veiculo"));
                lista.add(veiculo);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Veiculo> ListartodosDescricao(String valor){
        String sql = "SELECT * FROM veiculo_tb WHERE placa_veiculo like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Veiculo veiculo = new Veiculo();
                veiculo.setId_veiculo(rs.getInt("id_veiculo"));
                veiculo.setPlaca_veiculo(rs.getString("placa_veiculo"));
                veiculo.setMarca_veiculo(rs.getString("marca_veiculo"));
                veiculo.setModelo_veiculo(rs.getString("modelo_veiculo"));
                veiculo.setTipo_veiculo(rs.getString("tipo_veiculo"));
                veiculo.setAno_veiculo(rs.getInt("ano_veiculo"));
                lista.add(veiculo);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}
