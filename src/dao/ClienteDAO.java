package dao;

import model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ClienteDAO {
    
private Connection conn;
private PreparedStatement stmt;
private Statement st;
private ResultSet rs;
private ArrayList<Cliente> lista = new ArrayList<Cliente>();
    
public ClienteDAO(){
 conn = new ConnectionFactory().getConexao();
}

public void inserir(Cliente cliente) {
    String sql = "INSERT INTO cliente_tb (nome_cliente, cpf_cliente, "
            + "telefone_cliente, email_cliente, cep, logradouro, numero, bairro, cidade, uf) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
    try {
        stmt = conn.prepareStatement(sql);
        stmt.setString(1, cliente.getNome_cliente());
        stmt.setString(2, cliente.getCpf_cliente());
        stmt.setString(3, cliente.getTelefone_cliente());
        stmt.setString(4, cliente.getEmail_cliente());
        stmt.setString(5, cliente.getCep());
        stmt.setString(6, cliente.getLogradouro());
        stmt.setString(7, cliente.getNumero());
        stmt.setString(8, cliente.getBairro());
        stmt.setString(9, cliente.getCidade());
        stmt.setString(10, cliente.getUf());
        
        stmt.execute();
        stmt.close();
        }
    catch(Exception erro){
        throw new RuntimeException("Erro ao Inserir " + erro);
    }
}
    
    public void alterar(Cliente cliente) {
        String sql = "UPDATE cliente_tb SET nome_cliente = ?, cpf_cliente = ?, telefone_cliente = ?, email_cliente = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, uf = ?  WHERE id_cliente = ? ";
        try{
        stmt = conn.prepareStatement(sql);
        
        stmt.setString(1, cliente.getNome_cliente());
        stmt.setString(2, cliente.getCpf_cliente());
        stmt.setString(3, cliente.getTelefone_cliente());
        stmt.setString(4, cliente.getEmail_cliente());
        stmt.setString(5, cliente.getCep());
        stmt.setString(6, cliente.getLogradouro());
        stmt.setString(7, cliente.getNumero());
        stmt.setString(8, cliente.getBairro());
        stmt.setString(9, cliente.getCidade());
        stmt.setString(10, cliente.getUf());
        stmt.setInt(11, cliente.getId_cliente());
        
        stmt.execute();
        stmt.close();
        }
        catch(Exception erro){
            throw new RuntimeException ("Erro no update" + erro);
        }
    }
    
    public void excluir (int valor) {
        String sql = "DELETE FROM cliente_tb WHERE id_cliente = " + valor ;
        try{
            st = conn.createStatement();
            st.execute(sql);
            st.close();
        } 
        catch(Exception erro){
            throw new RuntimeException ("Erro no Deletar " + erro);
        }
    }

    public ArrayList <Cliente> Listartodos(){
        String sql = "SELECT * FROM cliente_tb";
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNome_cliente(rs.getString("nome_cliente"));
                cliente.setCpf_cliente(rs.getString("cpf_cliente"));
                cliente.setTelefone_cliente(rs.getString("telefone_cliente"));
                cliente.setEmail_cliente(rs.getString("email_cliente"));
                cliente.setCep(rs.getString("cep"));
                cliente.setLogradouro(rs.getString("logradouro"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                
                lista.add(cliente);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    }
    
     public ArrayList <Cliente> ListartodosDescricao(String valor){
        String sql = "SELECT * FROM cliente_tb WHERE nome_cliente like '%"+valor+"%' " ;
        try{
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next ()){
                Cliente cliente = new Cliente();
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNome_cliente(rs.getString("nome_cliente"));
                cliente.setCpf_cliente(rs.getString("cpf_cliente"));
                cliente.setTelefone_cliente(rs.getString("telefone_cliente"));
                cliente.setEmail_cliente(rs.getString("email_cliente"));
                cliente.setCep(rs.getString("cep"));
                cliente.setLogradouro(rs.getString("logradouro"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setUf(rs.getString("uf"));
                
                lista.add(cliente);
            }
        }    
        catch(Exception erro){
            throw new RuntimeException ("Erro 5: " + erro);
        }
        return lista;
    } 
}