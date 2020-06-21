package dao;

import model.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioDAO {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
    
public FuncionarioDAO(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Funcionario funcionario) {
    String sql = "INSERT INTO funcionario_tb (nome_funcionario, cpf_funcionario, telefone_funcionario, email_funcionario) VALUES (? , ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getNome_funcionario());
        stmt.setString(2, funcionario.getCpf_funcionario());
        stmt.setString(3, funcionario.getTelefone_funcionario());
        stmt.setString(4, funcionario.getEmail_funcionario());
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("ERRO 2: " + erro);
    }
}
    
    public void alterar(Funcionario funcionario) {
        String sql = "UPDATE funcionario_tb SET nome_funcionario = ?, cpf_funcionario = ?, telefone_funcionario = ?, email_funcionario = ? WHERE id_funcionario = ? ";
        try{
            stmt = conn.prepareStatement (sql);
            stmt.setString(1, funcionario.getNome_funcionario());
            stmt.setString(2, funcionario.getCpf_funcionario());
            stmt.setString(3, funcionario.getTelefone_funcionario());
            stmt.setString(4, funcionario.getEmail_funcionario());
            stmt.setInt(5, funcionario.getId_funcionario());
            stmt.execute();
            stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("ERRO 3: " + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM funcionario_tb WHERE id_funcionario = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("ERRO 4: " + erro);
        }
    }

    public ArrayList <Funcionario> Listartodos(){
        String sql = "SELECT * FROM funcionario_tb";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(rs.getInt("id_funcionario"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCpf_funcionario(rs.getString("cpf_funcionario"));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                funcionario.setEmail_funcionario(rs.getString("email_funcionario"));
                lista.add(funcionario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Funcionario> ListartodosDescricao(String valor){
        String sql = "SELECT * FROM funcionario_tb WHERE nome_funcionario like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Funcionario funcionario = new Funcionario();
                funcionario.setId_funcionario(rs.getInt("if_funcionario"));
                funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
                funcionario.setCpf_funcionario(rs.getString("cpf_funcionario"));
                funcionario.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                funcionario.setEmail_funcionario(rs.getString("email_funcionario"));
                lista.add(funcionario);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}



    
 