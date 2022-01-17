/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Aan
 */
public class c_login {
    Database db = new Database();
    ResultSet rs;
    
    public boolean formLogin(String username, String password) throws SQLException {
        rs = db.getData("select username, password from user");
        
        boolean bool = false;
        
        while (rs.next()) {
            if (username.equalsIgnoreCase(rs.getString("username")) && password.equals(rs.getString("password")))
                bool = true;
        }
        return bool;
    }
    
    public void storeLogin(String username) throws SQLException {
        db.Query("insert into logged_in values ('"+username+"')");
    }
}
