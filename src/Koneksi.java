
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    String host_namadb  = "jdbc:mysql://localhost:3306/crud-java";
    String username     = "root";
    String password     = "";
    
    public Connection con;
    
    public void open() {
        try {
            con = (Connection) DriverManager.getConnection(host_namadb, username, password);
            System.out.println("Sukses");
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void close() throws SQLException {
        con.close();
    }
    
}
