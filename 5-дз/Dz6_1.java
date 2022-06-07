package Lesson6;

import Lesson5.Cat;

import java.util.Random;
import java.util.Scanner;

public class Dz6_1 {

    public static void main(String[] args){
        String CPU;
        String  RAM;
        String  hardDisk;
        int resource;
        int n;
        int m;

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name CPU");
            CPU = sc.nextLine();
        System.out.println("Enter name RAM");
            RAM = sc.nextLine();
        System.out.println("Enter name Hard disk");
            hardDisk = sc.nextLine();
            resource = r.nextInt(100);
            System.out.println();
        PC pc = new PC(CPU,RAM,hardDisk,resource);
            pc.displayInfo();
            System.out.println();
            pc.limit();

        System.out.println();

        System.out.println("Enter number");
            n = sc.nextInt();
            m = r.nextInt(2);
        PC button = new PC(n,m);
        button.displayInfoNew();
            button.Button();
            button.click();
    }
    }

