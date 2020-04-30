package getions_de_pations;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class connexion {
    
    Connection cnx = null;

    public static Connection connexionDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:8889/Getion_Dentaire", "root", "root");
            return cnx;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }    
}
