package Lesson8;

import java.util.Scanner;

public class Task8_3 {
    public static void main(String[] args){
        StringBuilder res = new StringBuilder("Result: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first row:");
        String row1 = sc.nextLine();
        System.out.println("Enter the second row:");
        String row2 = sc.nextLine();
        System.out.println("Enter the third row:");
        String row3 = sc.nextLine();

        res.append("The third row: "+row3);
        res.append(",length: "+row3.length());
        res.append("\n");
        res.append(row2.toUpperCase());
        res.append(",length: "+row2.length());
        res.append("\n");
        res.append(row1.toLowerCase());
        res.append(",length: "+row1.length());
        System.out.println(res.toString());
    }

}
