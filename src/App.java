import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do{
            System.out.println("Enter a number: ");
            value = scanner.nextInt();

        }while(value != 5);

        // Scanner input = new Scanner(System.in);
        // System.out.println("enter line of text");
        // int line = input.nextInt();
        // System.out.println("you entered: " + line);

    }
}
