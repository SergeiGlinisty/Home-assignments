package Lesson8;

import java.util.Scanner;

public class Task8_2 {
          public static void main (String[]args){
              StringBuilder res = new StringBuilder("the row is larger than the average: ");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            String s = sc.nextLine();

            String[] mas = new String[size];
            for (int i = 0; i < size; i++) {
                mas[i] = sc.nextLine();
            }
            int lengthsum=0;
            double avarage;
              for (int i = 0; i < size; i++) {
                  lengthsum += mas[i].length();
              }

            avarage=(double) lengthsum/size;

            for (int i = 0; i < size; i++) {
                if(mas[i].length()>avarage){
                    res.append(mas[i]);
                    res.append(",");
                    res.append("length: ");
                    res.append(mas[i].length());
                    res.append("\n");

                }

            }
              System.out.print(res.toString());
        }
    }

