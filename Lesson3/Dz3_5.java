package Lesson3;

import java.util.Random;

public class Dz3_5 {
    public static void main(String[] args) {
        int[] mas1 = new int[5];
        int[] mas2 = new int[5];
        Random rnd = new Random();
float avg1 = 0;
float avg2 = 0;
float sum1 = 0;
float sum2 = 0;
int n1 = mas1.length;
int n2 = mas2.length;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rnd.nextInt(15) + 1;
            System.out.print(mas1[i] + " ");

                sum1+=mas1[i];

            }
        System.out.println();
        System.out.println("The amount1:"+" "+sum1);
            avg1 = sum1/n1;
            System.out.println("Arithmetic mean of the array 1:"+" "+avg1);

        System.out.println();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rnd.nextInt(15) + 1;
            System.out.print(mas2[i] + " ");
            sum2+=mas2[i];
        }
        System.out.println();
        System.out.println("The amount2:"+" "+sum2);
        avg2 = sum2/n1;
        System.out.println("Arithmetic mean of the array2:"+" "+avg2);
if (avg1>avg2){
    System.out.println("Arithmetic mean of the array1 is bigger");
    }else if(avg1<avg2){
    System.out.println("Arithmetic mean of the array2 is bigger");
}else{
    System.out.println("Arithmetic mean of arrays are equal");
}
    }
}
