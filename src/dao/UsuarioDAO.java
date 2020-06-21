package dao;

import dao.ConnectionFactory1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsuarioDAO {

    public boolean checkLogin(String login, String senha) {
       
       Connection con  = ConnectionFactory1.getConnection();
       PreparedStatement stmt = null;
       ResultSet rs = null;
       
       boolean check = false;
        
        try {
            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE login = ? AND senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            
            rs = stmt.executeQuery();
            
           if(rs.next()){
           
              check = true;
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
          ConnectionFactory1.closeConnection(con, stmt, rs);
        }
    
        return check;
        
    }
  
}