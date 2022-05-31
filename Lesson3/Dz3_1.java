package Lesson3;

public class Dz3_1 {
    public static void main(String[] args){
        int[] mas = new int[50];
        int a = 1;
        for (int i=0;i<mas.length;i++){
            mas[i]=a;
            a+=2;
                System.out.print(mas[i] + " ");
            }
        System.out.println();
    int b = 99;
        for (int i=0;i<mas.length;i++) {
            mas[i] = b;
            b -= 2;
            System.out.print(mas[i] + " ");
        }
    }

}
