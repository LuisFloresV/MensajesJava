package mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {
    //Singleton pattern
    private static Connection myConnection = null;
    private Conn(){
        try {
            myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajesjava?serverTimezone=UTC", "root", "admin");
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        if(myConnection == null){
            new Conn();
        }
        return myConnection;
    }

}
