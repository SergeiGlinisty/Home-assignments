package Lesson5;

import java.util.Random;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {

        Students[] mas = new Students[5];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        String name;
        int mark;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name#" + i);
            name = sc.nextLine();
            mark = r.nextInt(10)+1;
            mas[i] = new Students(name, 19, mark);

        }

        for (int i = 0; i < 5; i++) {
            System.out.println("====");
            mas[i].showInfo();
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (mas[i].isGoodBoy() == true)
                mas[i].showInfo();
        }


           }
}
