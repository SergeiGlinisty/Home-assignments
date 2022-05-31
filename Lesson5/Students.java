package Lesson5;

public class Students {
    String name;
    int numberGroup;
    int mark;


    public Boolean isGoodBoy() {
        if (mark > 8) {
            return true;
        }   else {
            return false;
        }
    }

    public void showInfo() {
        System.out.println("Name" + " " + name);
        System.out.println("NumberGroup" + " " + numberGroup);
        System.out.println("Mark" + " " + mark);
    }

    public Students(String name,int group,int age){
        this.name = name;
        this.numberGroup = group;
        this.mark = age;
    }

    }

