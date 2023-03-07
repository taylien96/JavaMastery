import java.util.Scanner;
class Person {
    String name;
    int age;
    void speak(){
        System.out.println("Hello! I'm " + name);
    }
};

public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits = { "apple", "banana", "pear", "kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        Person person1 = new Person();
        person1.name = "joey";
        person1.age = 5;
        person1.speak();
    }
}
