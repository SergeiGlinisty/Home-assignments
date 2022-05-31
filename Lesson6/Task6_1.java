package Lesson6;

import java.util.GregorianCalendar;
import java.util.Calendar;

public class Task6_1 {
    public static void main(String[] args) {


        Cat sam = new Cat(8, "Sam",25,"green");
        sam.displayInfo();
        Dog jack = new Dog(4, "Jack",25,6.5);
        jack.displayInfo();
        Tiger Leha = new Tiger(4, "Leha",25,"blue",20);
        Leha.displayInfo();
    }
}

