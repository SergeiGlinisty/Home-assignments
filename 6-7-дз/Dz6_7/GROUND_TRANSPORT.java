package Lesson7.Dz6_7;

public abstract class GROUND_TRANSPORT extends TRANSPORT {
    int NumberOfWheels;
    double FuelFlow;

    public GROUND_TRANSPORT(int Power, int MaxSpeed, double Weight, String Brand, int NumberOfWheels, double FuelFlow) {
        super(Power,MaxSpeed,Weight,Brand);
        this.NumberOfWheels = NumberOfWheels;
        this.FuelFlow = FuelFlow;
    }

    public abstract void displayInfo();
}
