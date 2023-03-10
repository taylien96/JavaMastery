import java.util.Scanner;
class Machine {
    public String name;
    public final static String description = "I am computer";
    public static int count = 0;
    public int id;
    public Machine(String name) {
        System.out.println("New machine made");
        this.name = name;
        count++;
        this.id = count;
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
        System.out.println(Machine.count);
        Machine machine2 = new Machine("brat");
        
        System.out.println(Machine.count);
        System.out.println(machine.id);
        System.out.println(machine2.id);
        System.out.println(Math.PI);
        System.out.println(Machine.count);
        System.out.println(machine.id);
        System.out.println(machine2.id);
        System.out.println(Math.PI);
        System.out.println(Machine.count);
        System.out.println(machine.id);
        System.out.println(machine2.id);
        System.out.println(Math.PI);
        
    }
}
