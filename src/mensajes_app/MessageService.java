package mensajes_app;

import sun.misc.resources.Messages;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MessageService {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message!");
        String mes = sc.nextLine();
        System.out.println("Author please");
        String author = sc.nextLine();
        Message message = new Message();
        message.setMessage(mes);
        message.setMessage_author(author);
        MessageDAO.createMessage(message);
        System.out.println("Message sent!");
    }
    public static void listMessage(){
        MessageDAO.readMessage();
    }
    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id the message to delete");
        int id = sc.nextInt();
        MessageDAO.deleteMessage(id);
    }
    public static void updateMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the new message");
        String message = sc.nextLine();
        System.out.println("Enter the id the message to update");
        int id = sc.nextInt();
        Message update = new Message();
        update.setMessage(message);
        update.setId_message(id);
        MessageDAO.updateMessage(update);
    }
}
