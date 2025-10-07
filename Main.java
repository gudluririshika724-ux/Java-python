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
            if ((currYear % 4 == 0 && currYear % 100 != 0) || (currYear % 400 == 0))
                daysInMonth[1] = 29;
            days += daysInMonth[(currMonth - 2 + 12) % 12];
        }

        if (months < 0) {
            months += 12;
            years--;
        }

        System.out.println("Age: " + years + " years, " + months + " months, " + days + " days.");
    }
}


