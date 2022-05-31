package Lesson3;

public class practica1 {
    public static void main(String[] args){
        int[] mas={25,47,34,18,96,33,28,55,87,13};
                int min=mas[0];
                int max=mas[0];
                for (int i=1;i< mas.length;i++){
                    if (mas[i]>max) {
                        max=mas[i];
                    }if(mas[i]<min) {
                        min = mas[i];
                    }

                }
        System.out.println(max+ "   "+min);
    }
}
