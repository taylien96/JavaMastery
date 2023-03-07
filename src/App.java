import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        int[] values;
        values = new int[3];
        System.out.println(values[0]);

        values[0] = 10;
        values[1] = 20;
        values[2] = 30;
        
        // Scanner input = new Scanner(System.in);
        // System.out.println("enter line of text");
        // int line = input.nextInt();
        // System.out.println("you entered: " + line);
        for(int i=0; i < values.length; i++){
            System.out.println(values[i]);
        }
        int[] numbers = {5, 6, 7};
        for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
