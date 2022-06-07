package Lesson7.Dz6_7;

public abstract class TRANSPORT {

    int Power;
    int MaxSpeed;
    double Weight;
    String Brand;

    public TRANSPORT(int Power, int MaxSpeed,double Weight,  String Brand) {
        this.Power = Power;
        this.MaxSpeed = MaxSpeed;
        this.Weight = Weight;
        this.Brand = Brand;
    }
        public abstract void displayInfo();

}
