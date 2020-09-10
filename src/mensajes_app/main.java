package mensajes_app;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int option = 0;



        do {
            System.out.println("Welcome!");
            System.out.println("1: Create message");
            System.out.println("2: List message");
            System.out.println("3: Update message");
            System.out.println("4: Delete message");
            System.out.println("5: Exit");
            option = sc.nextInt();

            switch (option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessage();
                    break;
                case 3:
                    MessageService.updateMessage();
                    break;
                case 4:
                    MessageService.deleteMessage();
                    break;
                default:
                    break;
            }
        }
        while(option != 5);
    }
}
