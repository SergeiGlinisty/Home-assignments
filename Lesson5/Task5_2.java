package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task5_2 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    String name;
    int age;
    int feedQuantity;

        System.out.println("Enter name");
            name = sc.nextLine();

            age = r.nextInt(10) + 1;
            feedQuantity = r.nextInt(100) + 1;
            Cat Cat = new Cat(name, age, feedQuantity);
            Cat.showInfo();



       if (Cat.isGoodCat()==true){
           Cat.print1();
       }else
           Cat.print2();

}
}

