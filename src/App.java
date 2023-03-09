import java.util.Scanner;
class Machine {
    public String name;
    public int code;
    public Machine(String name, int code) {
        System.out.println("New machine made");
        this.name = name;
        this.code = code;
    }

};

public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = { "apple", "banana", "pear", "kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        Machine machine = new Machine("talos", 4);
        System.out.println(machine.name);
        String[] fruits = { "apple", "banana", "pear", "kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        Machine machine = new Machine("talos", 4);
        System.out.println(machine.name);
        
    }
}
