package Lesson3;

import java.util.Random;

public class Dz3_7 {
    public static void main(String[] args) {
        int[] mas = new int[12];

        Random rnd = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(15) + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        int max = mas[0];

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            }
        }
        System.out.println(max);
        for (int i = mas.length-1;i>=0; i--){
            if(max==mas[i]) {
                System.out.println(i);
                break;
            }
        }
    }
    }
