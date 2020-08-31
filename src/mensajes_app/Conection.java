package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conection {
    public Connection get_connection(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajesjava?serverTimezone=UTC","root","admin");
            if(conn != null){
                System.out.println("Succesful Connection");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }
}
