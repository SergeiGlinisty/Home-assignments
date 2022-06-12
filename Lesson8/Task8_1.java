package Lesson8;

import java.util.Scanner;

public class Task8_1 {
    public static void main(String[] args){
        StringBuilder res = new StringBuilder("Res: ");
       Scanner sc=new Scanner(System.in);
       int size = sc.nextInt();
        String s = sc.nextLine();

       String[] mas = new String[size];
       for(int i=0;i<size;i++){
           mas[i]=sc.nextLine();
        }

        for(int i=0;i<size;i++){
            System.out.println(mas[i]);
        }
        System.out.println();

       String max = mas[0];
        for(int i=0;i<size;i++){
           if(mas[i].length()>max.length()){
               max=mas[i];
           }
        }

        String min = mas[0];
        for(int i=0;i<size;i++){
            if(mas[i].length()<min.length()){
                min=mas[i];
            }
        }

        res.append("The longest line: ");
        res.append(max);
        res.append(",");
        res.append("length: ");
        res.append(max.length());
        res.append("\n");
        res.append("The shortest line: ");
        res.append(min);
        res.append(",");
        res.append("length: ");
        res.append(min.length());
        res.append("\n");
        System.out.print(res.toString());

    }
}
