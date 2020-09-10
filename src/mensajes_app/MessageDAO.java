package mensajes_app;

import com.mysql.cj.result.SqlDateValueFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MessageDAO {
    static Connection conn = Conn.getConnection();
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    public static void createMessage(Message message){
        try {
            String query = "INSERT INTO messages (message, message_author) VALUES (?,?)";
            ps = conn.prepareStatement(query);
            ps.setString(1, message.getMessage());
            ps.setString(2, message.getMessage_author());
            ps.executeUpdate();
        }catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void readMessage(){
        try {
            String query = "SELECT * FROM messages";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while(rs.next()){
                System.out.println("Message: " + rs.getString("message"));
                System.out.println("Author: " + rs.getString("message_author"));
                System.out.println("Date: " + rs.getString("posting_date"));
            }
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void deleteMessage(int id_message){
        try {
            String query = "DELETE FROM messages WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setInt(1,id_message);
            ps.executeUpdate();
            System.out.println("Message deleted");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }

    public static void updateMessage(Message message){
        try {
            String query = "UPDATE messages SET message = ? WHERE id = ?";
            ps = conn.prepareStatement(query);
            ps.setString(1,message.getMessage());
            ps.setInt(2,message.getId_message());
            ps.executeUpdate();
            System.out.println("Message updated");
        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
