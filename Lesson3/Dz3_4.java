package Lesson3;

import java.util.Random;

public class Dz3_4 {
    public static void main(String[] args) {
        int[] mas = new int[20];

        Random rnd = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(20)+1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int a = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i]%2==1){
                mas[i]=a;

            }
            System.out.print(mas[i] + " ");
        }
    }
}
