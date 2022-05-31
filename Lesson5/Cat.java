package Lesson5;

public class Cat {
    String name;
    int age;
    int feedQuantity;

public boolean isGoodCat(){
    if(feedQuantity>=88)
        return true;
           return false;
       }

    public void showInfo() {
        System.out.println("Name" + " " + name);
        System.out.println("Age" + " " + age);
        System.out.println("feedQuantity % =" + " " + feedQuantity);
            }
    public void print1() {
        System.out.println("The cat ate" );
    }
    public void print2() {
        System.out.println("The cat didn't eat" );
    }

      public Cat(String name, int age, int feedQuantity) {
                this.feedQuantity = feedQuantity;
                this.name = name;
                this.age = age;
    }
}
