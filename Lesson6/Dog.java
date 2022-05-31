package Lesson6;

import java.util.Calendar;

class Dog extends Animal{
    double weight;
    public double getWeight() {return weight;}
    public Dog(int animal_id, String name, int birthday, double weight) {
        super(animal_id, name, birthday);
        this.weight = weight;
    }
@Override
    public void displayInfo(){
        System.out.println("Identification number:"+super.getAnimal_id()+" ,"+"Name:"+super.getName()+" ,"+"Date:"+super.getBirthday()+"Weight:"+getWeight());
    }
}

