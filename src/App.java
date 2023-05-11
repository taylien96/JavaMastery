import java.util.Scanner;
class Frog {
    private int id;
    private String name;
    public Frog(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString(){
        StringBuilder idName = new StringBuilder();
        return idName.append(id).append(":     ").append(name).toString();
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        
        // String info = "";
        // info += "what's up";
        // info += " dude";
        // System.out.println(info);
        // //this is actually memory effecient
        // StringBuilder sb = new StringBuilder("");
        // sb.append("My name is jeff");
        // sb.append(" i am cool");
        // System.out.println(sb);

        // StringBuilder sc = new StringBuilder();
        // sc.append("name is jeff")
        // .append(" sup");
        // System.out.printf("Total cost %d; number %d\n", 50, 300);
        // for(int i = 0; i<20; i++){
        //     System.out.printf("%2d: some text here\n", i);
        // }
        Frog frog1 = new Frog(1, "roger");
        System.out.println(frog1);
    }
}
