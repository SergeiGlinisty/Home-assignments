package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[][] mas = new int[n][m];

        Random rnd = new Random();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(9);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        int max = mas[0][0];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] > max) {
                    max = mas[i][j];

                }
            }
        }

        System.out.println(max);

    }
}
