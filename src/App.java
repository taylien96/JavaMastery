import java.util.Scanner;
class Machine {
    public String name;
    public static String description = "I am computer";
    public Machine(String name) {
        System.out.println("New machine made");
        this.name = name;
        
    }
    public void showName(){
        System.out.println(name);
    }
    public static void showInfor(){
        System.out.println(description);
    }

};

public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = { "apple", "banana", "pear", "kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        };
        Machine machine = new Machine("talos");
        Machine machine2 = new Machine("talos");
        System.out.println(Machine.description);
        
        
    }
}
