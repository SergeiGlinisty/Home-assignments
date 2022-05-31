package Lesson3;

import java.util.Random;

public class Dz3_6 {
    public static void main(String[] args) {
        int[] mas = new int[4];

        Random rnd = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rnd.nextInt(10) + 1;
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < mas.length; i++) {
            if (i > 0) {
            }if (mas[i - 1] >= mas[i]) {
                    System.out.println("the array is not a strictly increasing sequence");
                    break;
                }if(i== mas.length-1){
                System.out.println("the array is a strictly increasing sequence");
            }

            }

        }
    }



