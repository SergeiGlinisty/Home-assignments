package Lesson7.Dz6_7;

public abstract class AIR_TRANSPORT extends TRANSPORT {
    int Wingspan;
    int MinimumStripLength;

    public AIR_TRANSPORT(int Power, int MaxSpeed, double Weight, String Brand, int Wingspan, int MinimumStripLength) {
        super(Power,MaxSpeed,Weight,Brand);
        this.Wingspan = Wingspan;
        this.MinimumStripLength = MinimumStripLength;
    }

    public abstract void displayInfo();

}
