package Lesson3;

import java.util.Scanner;

public class Dz1 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        int a = 2;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = a;
            a += 2;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }
    }
}