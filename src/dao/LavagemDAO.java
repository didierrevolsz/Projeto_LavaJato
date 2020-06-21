package dao;

import model.Lavagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LavagemDAO {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Lavagem> lista = new ArrayList<Lavagem>();
    
public LavagemDAO(){
 conn = new ConnectionFactory().getConexao();
}

    public void inserir(Lavagem lavagem) {
        String sql = "INSERT INTO lavagem (id_servicos) VALUES (? ) ";
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, lavagem.getId_servico());
            stmt.setInt(2, lavagem.getId_servico());
            stmt.setInt(3, lavagem.getId_servico());
            stmt.setInt(4, lavagem.getId_servico());
            stmt.execute();
            stmt.close();
            }
        catch(Exception erro){
            throw new RuntimeException("ERRO 2: " + erro);
        }
    }
       
}