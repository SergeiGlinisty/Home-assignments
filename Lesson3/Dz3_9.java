package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Dz3_9 {
    public static void main(String[] args) {
        int sumLeft=0;
        int sumRight=0;
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int size;
        do {
            System.out.println("Enter the number");
            size = sc.nextInt();
            if (size < 0) {
                System.out.println("Wrong number! Try again");
            }
        }while (size < 0) ;

        int[] array = new int[size];

            for (int i = 0; i < array.length; i++) {
                array[i] = rnd.nextInt(15) + 1;
                System.out.print(array[i] + " ");
            }
        for (int i = 0; i < array.length; i++){
                if(i<= array.length/2-1){
                    sumLeft+=array[i];

                }else {
                    sumRight+=array[i];

                }

            }
        System.out.println();
        System.out.println("the sum of the left half of the array-"+sumLeft);
        System.out.println("the sum of the right half of the array-"+sumRight);

        if(sumLeft>sumRight){
            System.out.println("the sum of the left half of the array is bigger");
        }else if(sumLeft<sumRight){
            System.out.println("the sum of the right half of the array is bigger");
        } else{
            System.out.println("the sums are the same");
        }
            }

        }



