package Lesson3;

import java.util.Random;

public class Dz3_8 {
    public static void main(String[] args) {
        float[] mas1 = new float[10];
        float[] mas2 = new float[10];
        float[] mas3 = new float[10];
        Random rnd = new Random();

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rnd.nextInt(9) + 1;
            System.out.print(mas1[i] + " ");

                    }
        System.out.println();

        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rnd.nextInt(9) + 1;
            System.out.print(mas2[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++) {
            mas3[i] = mas1[i]/mas2[i];
            System.out.print(mas3[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < mas3.length; i++){
            if(mas3[i]%2==0) {
                System.out.print(mas3[i] + " ");
            }else if(mas3[i]%2==1)
                System.out.print(mas3[i] + " ");
        }

    }
    }

