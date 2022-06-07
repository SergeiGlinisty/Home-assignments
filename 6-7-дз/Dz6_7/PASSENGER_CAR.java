package Lesson7.Dz6_7;

public class PASSENGER_CAR extends GROUND_TRANSPORT {

    String CarBodyType;
    int NumberOfPassengers;
    double time;//время
    double s;//путь

    public PASSENGER_CAR(int Power, int MaxSpeed, double Weight, String Brand, int NumberOfWheels, double FuelFlow,String CarBodyType,int NumberOfPassengers) {
        super(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow);
        this.CarBodyType = CarBodyType;
        this.NumberOfPassengers = NumberOfPassengers;
    }
   PASSENGER_CAR(int Power, int MaxSpeed, double Weight, String Brand, int NumberOfWheels, double FuelFlow, double time) {
        super(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow);
        this.time = time;
         }
    double kw;//киловатты
    public double convert(){
        kw = Power/0.74;
        return kw;
    }

       public double way(){
        s = MaxSpeed*time;
        return s;
    }
    double fuel;
    private double fuelQuantity(){
        fuel = s*FuelFlow/100;
        return fuel;
    }


    public void displayInfo() {
        System.out.print(Brand+": "+CarBodyType+","+"Power: "+Power+" hp"+" or "+convert()+" kw"+","+"Maximum speed:"+MaxSpeed+" km/h"+","+Weight+" kg"+","+"Number of wheels: "+NumberOfWheels+","+"Fuel flow: "+FuelFlow+" l/100km"+","+"Number Of Passengers: "+ NumberOfPassengers);

    }
    public void Info() {
        System.out.print("During the time "+time+" h"+","+"car "+Brand+" moving at maximum speed "+MaxSpeed+" km/h"+" will pass "+way()+" km"+" and use up "+fuelQuantity()+" liters of fuel.");

    }
}