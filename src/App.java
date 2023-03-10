import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        
        String info = "";
        info += "what's up";
        info += " dude";
        System.out.println(info);
        //this is actually memory effecient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name is jeff");
        sb.append(" i am cool");
        System.out.println(sb);

        StringBuilder sc = new StringBuilder();
        sc.append("name is jeff")
        .append(" sup");
    }
}
