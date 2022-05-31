package Lesson3;

import java.util.Scanner;

public class practica2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter count");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter element");
            array[i] = sc.nextInt();
            System.out.println("We enter"+" "+array[i]);
        }

    }
}
