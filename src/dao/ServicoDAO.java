package dao;

import model.Servico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ServicoDAO {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Servico> lista = new ArrayList<Servico>();
    
public ServicoDAO(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Servico servico) {
    String sql = "INSERT INTO servicos_tb (descricao, preco_servicos) VALUES (?, ? ) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, servico.getDescricao());
        stmt.setDouble(2, servico.getPreco_servicos());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Servico servico) {
        String sql = "UPDATE servicos_tb SET descricao = ?, preco_servicos = ? WHERE id_servicos = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, servico.getDescricao());
            stmt.setDouble(2, servico.getPreco_servicos());
            stmt.setInt(3, servico.getId_servico());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM servicos_tb WHERE id_servicos = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Servico> Listartodos(){
        String sql = "SELECT * FROM servicos_tb";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Servico servico = new Servico();
                servico.setId_servico(rs.getInt("id_servicos"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setPreco_servico(rs.getDouble("preco_servicos"));
                lista.add(servico);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Servico> ListartodosDescricao(String valor){
        String sql = "SELECT * FROM servicos_tb WHERE descricao like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Servico servico = new Servico();
                servico.setId_servico(rs.getInt("id_servicos"));
                servico.setDescricao(rs.getString("descricao"));
                servico.setPreco_servico(rs.getDouble("preco_servicos"));
                lista.add(servico);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}