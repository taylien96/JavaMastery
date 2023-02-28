public class App {
    public static void main(String[] args) throws Exception {
    int myNumber;
    //double allows for percise int decimal, floats are small versions that are automatically doubles unless f at the end
    float mydub = 5.24f;
    myNumber = 12;
    char mychar = 'y';
    //booleans are true or false as per usual


    System.out.println(mychar);

    System.out.println(myNumber);
    System.out.println(mydub);
    class Bicycle {

        int cadence = 0;
        int speed = 0;
        int gear = 1;
    
        void changeCadence(int newValue) {
             cadence = newValue;
        }
    
        void changeGear(int newValue) {
             gear = newValue;
        }
    
        void speedUp(int increment) {
             speed = speed + increment;   
        }
    
        void applyBrakes(int decrement) {
             speed = speed - decrement;
        }
    
        void printStates() {
             System.out.println("cadence:" +
                 cadence + " speed:" + 
                 speed + " gear:" + gear);
        }
    }
     // Create two different 
        // Bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}
