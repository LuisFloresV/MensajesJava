package mensajes_app;

public class Message {
    int id_message;
    String message;
    String message_author;
    String date;

    public Message(){

    }

    public Message(String message, String message_author, String date) {
        this.message = message;
        this.message_author = message_author;
        this.date = date;
    }

    public int getId_message() {
        return id_message;
    }

    public void setId_message(int id_message) {
        this.id_message = id_message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage_author() {
        return message_author;
    }

    public void setMessage_author(String message_author) {
        this.message_author = message_author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
