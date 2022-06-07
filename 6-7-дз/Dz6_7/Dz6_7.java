package Lesson7.Dz6_7;

import java.util.Random;
import java.util.Scanner;

public class Dz6_7 {

    public static void main(String[] args) {
        int Power;//мощность
        int MaxSpeed;//максимальная скорость
        double Weight;//вес
        String Brand;//бренд
        int NumberOfWheels;//количество колес
        double FuelFlow;//расход топлива
        String CarBodyType;//тип кузова
        int NumberOfPassengers;//вместимость
        int LoadCapacity;//грузоподъёмность
        int Wingspan; //размах крыльев
        int MinimumStripLength;//минимальная длина взлётной полосы
        boolean BusinessClass;//есть ли бизнес класс
        boolean Ejection; //механизм выбрасывания
        int NumberOfMissiles;//количество ракет
        double time;//время в пути легкового авто
        int СargoQuantity;// количество загружаемого груза, будем использовать Random
        int NumberOfTickets;//количество проданных билетов на самолёт

        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter passenger car's brand");  //вводим данные легкового авто
        Brand = sc.nextLine();
        System.out.println("Enter Car Body Type");
        CarBodyType = sc.nextLine();
        Power = r.nextInt(400);
        System.out.println("Enter Maximum Speed");
        MaxSpeed = sc.nextInt();
        System.out.println("Enter Weight");
        Weight = sc.nextInt();
        System.out.println("Enter Number Of Wheels");
        NumberOfWheels = sc.nextInt();
        System.out.println("Enter Fuel Flow");
        FuelFlow = sc.nextInt();
        System.out.println("Enter Time");
        time = sc.nextDouble();
        NumberOfPassengers = r.nextInt(6);
        PASSENGER_CAR car = new PASSENGER_CAR(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow, CarBodyType, NumberOfPassengers);
        car.displayInfo(); // выводим танные о авто
        System.out.println();
        System.out.println("====================");
        PASSENGER_CAR CAR = new PASSENGER_CAR(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow, time);
        CAR.Info();//ввыводим строку с рассчитанным путём и расходом топлива
        System.out.println();
        System.out.println("====================");

        String s = sc.nextLine();

        System.out.println("Enter lorry's brand"); //вводим данные грузовика
        Brand = sc.nextLine();
        Power = r.nextInt(400);
        System.out.println("Enter Maximum Speed");
        MaxSpeed = sc.nextInt();
        System.out.println("Enter Weight");
        Weight = sc.nextInt();
        System.out.println("Enter Number Of Wheels");
        NumberOfWheels = sc.nextInt();
        FuelFlow = r.nextInt(20);
        LoadCapacity = r.nextInt(20);  //рандомим грузоподьёмность
        СargoQuantity = r.nextInt(20);  //рандомим количество загружаемого груза
        FREIGHT_TRANSPORT lorry = new FREIGHT_TRANSPORT(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow, LoadCapacity);
        lorry.displayInfo();
        System.out.println();
        System.out.println("====================");
        FREIGHT_TRANSPORT LORRY = new FREIGHT_TRANSPORT(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow, LoadCapacity,СargoQuantity);
        LORRY.display();//выводим количество груза в консоль
        System.out.println();
        System.out.println("====================");
        LORRY.comparison();//сравниваем количество груза и грузоподъемность и выводим соответствующее сообщение
        System.out.println();
        System.out.println("====================");


        String t = sc.nextLine();

        System.out.println("Enter airbus's brand"); //вводим данные пассажирского самолёта
        Brand = sc.nextLine();
        Power = r.nextInt(5000);
        System.out.println("Enter Maximum Speed");
        MaxSpeed = sc.nextInt();
        System.out.println("Enter Weight");
        Weight = sc.nextInt();
        System.out.println("Enter Wingspan");
        Wingspan = sc.nextInt();
        System.out.println("Enter Minimum Strip Length");
        MinimumStripLength = sc.nextInt();
        System.out.println("Enter BusinessClass");
        BusinessClass = sc.nextBoolean();
        NumberOfPassengers = r.nextInt(256);
        NumberOfTickets = r.nextInt(256);
        CIVILIAN plane = new CIVILIAN(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength, BusinessClass, NumberOfPassengers);
        plane.displayInfo();
        System.out.println();
        System.out.println("====================");
        CIVILIAN airbus = new CIVILIAN(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength, BusinessClass, NumberOfPassengers, NumberOfTickets);
        airbus.displayTickets();//рандомим количество билетов
        System.out.println();
        System.out.println("====================");
        airbus.comparison();//сравниваем количество проданных билетов с вместимость и выводим соответствующее сообщение
        System.out.println();
        System.out.println("====================");


        String q = sc.nextLine();

        System.out.println("Enter military aircraft's brand"); //вводим данные военного самолёта
        Brand = sc.nextLine();
        Power = r.nextInt(5000);
        System.out.println("Enter Maximum Speed");
        MaxSpeed = sc.nextInt();
        System.out.println("Enter Weight");
        Weight = sc.nextInt();
        System.out.println("Enter Wingspan");
        Wingspan = sc.nextInt();
        System.out.println("Enter Minimum Strip Length");
        MinimumStripLength = sc.nextInt();
        System.out.println("Enter Ejection");
        Ejection= sc.nextBoolean();
        NumberOfMissiles = r.nextInt(10);
        MILITARY aircraft = new MILITARY(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength, Ejection, NumberOfMissiles);
        aircraft.displayInfo();
        System.out.println();
        System.out.println("====================");
        aircraft.shot();
        System.out.println("====================");
        aircraft.catapult();
    }
}

