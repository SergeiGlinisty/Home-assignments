package Lesson6;

import java.util.Scanner;

public  class PC {

    String CPU;
    String RAM;
    String hardDisk;
    int resource;
    int n;
    int m;

    public PC(String CPU, String RAM, String hardDisk, int resource) {
        this.CPU = CPU;
        this.RAM = RAM;
        this.hardDisk = hardDisk;
        this.resource = resource;
    }

    PC(int n, int m) {//конструктор для игры в "Угадайку"
        this.n = n;
        this.m = m;
    }

    public void displayInfo() {
        System.out.println("CPU name: " + " " + CPU);
        System.out.println("RAM name: " + " " + RAM);
        System.out.println("Hard Disk name: " + " " + hardDisk);
        System.out.println("Resource of work cycles: " + " " + resource);
    }
    public void displayInfoNew() {
        System.out.println("m: " + " " + m);

    }
    boolean a;

    public boolean Button() {

        if (n != m) {
            System.out.println("The computer was fried!");
            a=true;
        } else {
            System.out.println("The computer turn off!");

        }
            return true;
    }

        public void click(){

        if(a==true)
            System.out.print(" When you turn it on again, it ends");

          }
          public void limit(){
        if(resource>60)
            System.out.println("Resource overrun! The computer was fried!");

          }
    }


