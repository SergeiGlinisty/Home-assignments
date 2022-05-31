package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Dz4_1 {
    public static void main(String[] args) {
        System.out.println("Enter the dimension of the array nxm");
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int sumEven = 0;
        int s1 = 1;
        int s2 = 1;
        int sum = 0;
        int m = 0;
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }

        int[][] mas = new int[n][m];

        int a = mas.length;

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rnd.nextInt(8) + 1;
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    if(mas[i][j]%2==0){
                        sum += mas[i][j];
                    }
                }
            }

        }
        System.out.print("The sum of even  elements of array diagonal-" + sum);
        System.out.println();

        for (int i = 1; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (j == i - 1) {
                    if (mas[i][j] % 2 == 1) {
                        System.out.println("The odd elemet under the main diagonal inclusive:");
                        System.out.println(mas[i][j]+" ");

                    }
                }

            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                if (i == j) {

                        s1 *= mas[i][j];

                }
            }

        }
        System.out.print("The product of main diagonal numbers s1:"+s1);
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {

                if (j==a-1-i) {

                    s2 *= mas[i][j];

                }
            }

        }
        System.out.print("The product of secondary diagonal numbers s2:"+s2);
        System.out.println();
        if (s1>s2) {
            System.out.print("The product of main diagonal numbers is bigger");
        }else if(s1<s2){
            System.out.print("The product of secondary diagonal numbers is bigger");
        }else{
            System.out.print("The products are the same");
        }
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length-1-i; j++) {
                    if (mas[i][j] % 2 == 0) {
                        sumEven += mas[i][j];
                         }
                    }
                }

        System.out.println("The sum of the even elements over the secondary diagonal:"+sumEven);
        System.out.println();
        for (int i = 0; i < mas.length; i++) {
            for (int j = i+1; j < mas[i].length; j++) {
              int temp = mas[i][j];
              mas[i][j] = mas[j][i];
              mas[j][i] = temp;
                              }

            }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.print(mas[i][j]+" ");
                }
            System.out.println();
            }
        }
}




