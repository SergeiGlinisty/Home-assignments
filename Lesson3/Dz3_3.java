package Lesson3;

import java.util.Random;

public class Dz3_3 {
    public static void main(String[] args) {
        int[] mas = new int[15];

        Random rnd = new Random();

        for (int i = 0; i < mas.length; i++) {
                mas[i] = rnd.nextInt(99);
                System.out.print(mas[i] + " ");
        }
        System.out.println();
        int b = 0;
        for (int i = 0; i < mas.length; i++){
                if(mas[i]%2==0) {
                    b++;
                    System.out.print(mas[i] + " ");
                }
        }
        System.out.println();
        System.out.print("Number of even numbers:"+b);
    }
}
