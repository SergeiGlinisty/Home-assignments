package Lesson2;

public class Dz2 {
    public static void main(String[] args){
        int Amebs=0;
     for (int i=0;i<=24;i=i+3){
         if(i<3){
             Amebs=Amebs+1;
            System.out.println("Amebs="+Amebs);

         } if(i>=3){
             Amebs=Amebs*2;
             System.out.println("Amebs="+Amebs);
         }
     }

    }

}
