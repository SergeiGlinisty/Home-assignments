package Lesson7.Dz6_7;

public class MILITARY extends AIR_TRANSPORT {
    boolean Ejection;
    int NumberOfMissiles;

    public MILITARY(int Power, int MaxSpeed, double Weight, String Brand, int Wingspan, int MinimumStripLength, boolean Ejection, int NumberOfMissiles) {
        super(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength);
        this.Ejection = Ejection;
        this.NumberOfMissiles = NumberOfMissiles;
    }
    double kw;
    public double convert(){
        kw = Power/0.74;
        return kw;
    }
    public void shot(){ //метод выстрел
        if(NumberOfMissiles!=0){
            System.out.println("The rocket went...");
        }else {
            System.out.println("Ammunition is missing");
        }
    }
    public boolean catapult(){ //метод выстрел
        if(Ejection == true){
            System.out.println("The ejection was successful");
        }else {
            System.out.println("You don't have such a system");
        }
        return true;
    }
    public void displayInfo() {
        System.out.print(Brand + ":" +"Power "+Power+" hp"+" or "+convert()+" kw" + "," + "Maximum speed: " + MaxSpeed + " km/h" + "," + Weight + " kg" + "," + "Ejection: " + Ejection + "," + "Number of missiles: " + NumberOfMissiles);

    }
}
