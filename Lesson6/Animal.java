package Lesson6;

import java.util.Calendar;

public abstract class Animal {
    int animal_id;
    String name;
    int birthday;

    public int getAnimal_id() {return animal_id;}
    public String getName() {return name;}
    public int getBirthday() {return birthday;}

    public Animal(int animal_id, String name, int birthday){
        this.animal_id=animal_id;
        this.name=name;
        this.birthday=birthday;

    }
    public abstract void displayInfo();
}

