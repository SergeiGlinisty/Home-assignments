package Lesson2;

public class task2 {
    public static void main(String[] args){
        int sum=0;
        int i=10;
        while (i<=55){
            if(i%2==0){
                sum+=i;
            }
            i++;

        }
        System.out.println(sum);
    }
}
