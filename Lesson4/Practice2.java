package Lesson4;

import java.util.Random;

public class Practice2 {
        public static void main(String[] args) {
            int n = 4;
            int m = 4;
            int sum = 0;
            int[][] mas = new int[n][m];

            Random rnd = new Random();

            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    mas[i][j] = rnd.nextInt(22);
                    System.out.print(mas[i][j] + " ");
                }
                System.out.println();
            }


            for (int i = 0; i < mas.length; i++) {
                for (int j = 0; j < mas[i].length; j++) {
                    if(i==j){
                        sum+= mas[i][j];

                    }

                }

            }
            System.out.println(sum);
        }

        }

