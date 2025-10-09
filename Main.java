 /*class Animal{
        void makeSound(){
            System.out.println("Animal makes sound");
        }
    }
    class Dog extends Animal{
        void makeSound(){
            System.out.println("Dog barks");
        }
    }
    public class Main{
        public static void main(String[]args){
            Animal a = new Dog();
            a.makeSound();
        }
    }
        */


/*abstract class parent
{
    abstract void show();
}
class Child extends parent
{
    void show(){
        System.out.println("Child class method");
    }
}
public class Main{
    public static void main(String args[]){
        parent p =new Child();
        p.show();
    }
}*/

/*import static java.lang.System.*;
class main{
    public static void main(String args[])
    {
        out.println("Hello static");
    }
}*/

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*public class Main{
public static void main(String args[]){
    double value = 12345.90;
    DecimalFormat df =new DecimalFormat("#,###.00");
    String formatted =df.format(value);
    System.out.println("Fromatted number :"+formatted);
}
}*/

/*public class Main{
    public static void main(String []args){
        Date now = new Date();
        SimpleDateFormat sdf= new SimpleDateFormat("dd MM yyyy,hh:mm a");
        
        System.out.println(sdf.format(now));

         
    }
}*/
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int birthDay = 21, birthMonth = 5, birthYear = 2005;

        Calendar c = Calendar.getInstance();
        int currDay = c.get(Calendar.DAY_OF_MONTH);
        int currMonth = c.get(Calendar.MONTH) + 1; // months are 0-based
        int currYear = c.get(Calendar.YEAR);

        int years = currYear - birthYear;
        int months = currMonth - birthMonth;
        int days = currDay - birthDay;

        if (days < 0) {
            months--;
            int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
            days += daysInMonth[(currMonth - 2 + 12) % 12];
        }

        if (months < 0) {
            months += 12;
            years--;
        }

        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days.");
    }
}// Base class (Superclass)
class Animal {
    String species;

    public Animal(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }
}

// First level of inheritance (Subclass of Animal)
class Mammal extends Animal {
    String furColor;

    public Mammal(String species, String furColor) {
        super(species); // Call the constructor of the parent class (Animal)
        this.furColor = furColor;
    }

    public void giveBirth() {
        System.out.println(species + " is giving birth to live young.");
    }
}

// Second level of inheritance (Subclass of Mammal)
class Dog extends Mammal {
    String breed;

    public Dog(String species, String furColor, String breed) {
        super(species, furColor); // Call the constructor of the parent class (Mammal)
        this.breed = breed;
    }

    public void bark() {
        System.out.println(breed + " the " + species + " is barking loudly!");
    }

    // Method overriding: changing the behavior of an inherited method
    @Override
    public void eat() {
        System.out.println(breed + " the " + species + " is eating dog food.");
    }
}

// Another subclass of Mammal (demonstrating hierarchical inheritance)
class Cat extends Mammal {
    boolean likesToClimb;

    public Cat(String species, String furColor, boolean likesToClimb) {
        super(species, furColor);
        this.likesToClimb = likesToClimb;
    }

    public void meow() {
        System.out.println(species + " is meowing softly.");
    }
}

// Main class to demonstrate inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog myDog = new Dog("Canine", "Brown", "Golden Retriever");
        System.out.println("My dog is a " + myDog.breed + " with " + myDog.furColor + " fur.");
        myDog.eat();      // Overridden method from Dog
        myDog.bark();     // Method specific to Dog
        myDog.giveBirth(); // Inherited from Mammal
        myDog.sleep();    // Inherited from Animal
        System.out.println();

        // Create an object of the Cat class
        Cat myCat = new Cat("Feline", "Black", true);
        System.out.println("My cat is a " + myCat.species + " with " + myCat.furColor + " fur.");
        myCat.eat();      // Inherited from Animal
        myCat.meow();     // Method specific to Cat
        myCat.giveBirth(); // Inherited from Mammal
        System.out.println();

        // Demonstrate polymorphism with a base class reference
        Animal genericAnimal = new Dog("Canine", "White", "Poodle");
        genericAnimal.eat(); // Calls the overridden eat() method of Dog
    }
}


