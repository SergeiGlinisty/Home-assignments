package Lesson7.Dz6_7;

public class FREIGHT_TRANSPORT extends GROUND_TRANSPORT  {

    int LoadCapacity;
    int СargoQuantity; // вводим поле количество груза
    public FREIGHT_TRANSPORT(int Power, int MaxSpeed, double Weight, String Brand, int NumberOfWheels, double FuelFlow,int LoadCapacity) {
        super(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow);
        this.LoadCapacity = LoadCapacity;

    }
    FREIGHT_TRANSPORT(int Power, int MaxSpeed, double Weight, String Brand, int NumberOfWheels, double FuelFlow,int LoadCapacity,int СargoQuantity) {
        super(Power, MaxSpeed, Weight, Brand, NumberOfWheels, FuelFlow);
        this.LoadCapacity = LoadCapacity;
        this.СargoQuantity = СargoQuantity;

    }
    double kw;
    public double convert(){
        kw = Power/0.74;
        return kw;
    }

       public void comparison(){ //метод проверки влезет груз в авто или нет
       if(СargoQuantity<=LoadCapacity){
           System.out.println("The truck is loaded");
       }else {
           System.out.println("You need another truck");
       }
    }
    public void displayInfo() {
        System.out.print(Brand+":"+"Power "+Power+" hp"+" or "+convert()+" kw"+","+"Maximum speed: "+MaxSpeed+" km/h"+","+Weight+" kg"+","+"Number of wheels: "+NumberOfWheels+","+"Fuel flow"+FuelFlow+" l/100km"+","+"Load capacity: "+LoadCapacity+" ton");

    }
    public void display() {//выводим количество загружаемого груза
        System.out.print("cargo quantity: "+СargoQuantity+" ton");

    }
}
