public class Person {
    // instance variables 
    String name = "John";
    String gender = "Male";
    int age = 20;

    // static variables are constant on all instances of this class
    static String color = "black";

    // a constructor
    public Person(String name, String gender, int age, String color){
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.color = color;
    }

    // method to wake up
    public void sleepingStatus(){
        // local varable
        int time = 10;
        if (time > 9){
            System.out.println("Wake up" + name);
        }
        else
        {
            System.out.println("go to bed" + name);
        }
    }

    // method that assigns education status
    public void educationStatus(){
        if (age > 20){
            System.out.println("graduated");
        }
        else{
            System.out.println("go back to school");
        }
    }
    public static void main(String[] args){
        // object which is the instance of the class
        Person joan = new Person ("Joan", "female", 26, "black");

        joan.sleepingStatus();


        System.out.println(joan.gender);
        System.out.println(joan.name);
        System.out.println(joan.age);
        System.out.println(joan.color);
    }
}


