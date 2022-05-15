package Lesson2;

public class Dz1 {
    public static void main(String[] args){
        double sum=0;
        double sum1=0;
        for (int i=1;i<8;i++){
            if(i==1){
                sum1=10;
            } if(i>1){
                sum1=sum1+(sum1*0.1);
            }
            sum+=sum1;
        }
        System.out.println(sum);
    }
}
