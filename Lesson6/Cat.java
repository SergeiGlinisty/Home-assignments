package Lesson6;

import java.util.Calendar;

 class Cat extends Animal {
        String eyesColor;
     public String getEyesColor() {return eyesColor;}
        public Cat(int animal_id, String name, int birthday, String eyesColor) {
            super(animal_id, name, birthday);
            this.eyesColor = eyesColor;
        }
@Override
        public void displayInfo(){
            System.out.println("Identification number:"+super.getAnimal_id()+" ,"+"Name:"+super.getName()+" ,"+"Date:"+super.getBirthday()+" ,"+"Eyes color:"+getEyesColor());
        }
    }
    class Tiger extends Cat {
        int countEatenExployees;
        public int getCountEatenExployees() {return countEatenExployees;}
        public Tiger(int animal_id, String name, int birthday, String eyesColor, int countEatenExployees) {
            super(animal_id, name, birthday,eyesColor);
            this.countEatenExployees = countEatenExployees;
        }
@Override
        public void displayInfo(){
            System.out.println("Identification number:"+super.getAnimal_id()+" ,"+"Name:"+super.getName()+" ,"+"Date:"+super.getBirthday()+" ,"+"Eyes color:"+getEyesColor()+" ,"+"cout eaten emplotees:"+getCountEatenExployees());
        }
    }

