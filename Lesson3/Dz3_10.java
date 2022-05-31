package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Dz3_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int n;
        do {
            System.out.println("Enter the number");
            n = sc.nextInt();
            if (n <= 3) {
                System.out.println("Wrong number! Try again");
            }
        } while (n <= 3);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(n) + 1;
                System.out.print(array[i] + " ");
        }
        System.out.print(":Array");
        System.out.println();
        for (int i = 0; i < array.length; i++) {
           if(array[i]%2==0)
            System.out.print(array[i] + " ");
        }
        System.out.print(":Array of even elements");
    }
}
