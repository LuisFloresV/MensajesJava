package mensajes_app;

import java.sql.Connection;

public class Inicio {

    public static void main(String[] args) {
        Conection con = new Conection();
        try(Connection cnx = con.get_connection()){
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
