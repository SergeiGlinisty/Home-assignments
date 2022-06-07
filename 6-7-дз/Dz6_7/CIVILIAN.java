package Lesson7.Dz6_7;

public class CIVILIAN extends AIR_TRANSPORT {//класс гражданских самолётов
    boolean BusinessClass;
    int NumberOfPassengers;//создаём поле вместимость пассажиров
    int NumberOfTickets;//количество проданных билетов на самолёт
    public CIVILIAN(int Power, int MaxSpeed, double Weight, String Brand, int Wingspan, int MinimumStripLength, boolean BusinessClass, int NumberOfPassengers) {
        super(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength);
        this.BusinessClass = BusinessClass;
        this.NumberOfPassengers = NumberOfPassengers;
    }
    CIVILIAN(int Power, int MaxSpeed, double Weight, String Brand, int Wingspan, int MinimumStripLength, boolean BusinessClass, int NumberOfPassengers,int NumberOfTickets) {
        super(Power, MaxSpeed, Weight, Brand, Wingspan, MinimumStripLength);
        this.BusinessClass = BusinessClass;
        this.NumberOfPassengers = NumberOfPassengers;
        this.NumberOfTickets = NumberOfTickets;
    }
    double kw;
    public double convert(){
        kw = Power/0.74;
        return kw;
    }
    public void comparison() { //метод проверки влезет груз в авто или нет
        if (NumberOfTickets <= NumberOfPassengers) {
            System.out.println("The airbus is loaded");
        } else {
            System.out.println("You need another airbus");
        }
    }
        public void displayInfo() {
            System.out.print(Brand + ":" +"Power "+Power+" hp"+" or "+convert()+" kw"+ "," + "Maximum speed: " + MaxSpeed + " km/h" + "," + Weight + " kg" + "," + "Wingspan: "+Wingspan+"m"+","+"Minimum strip length: "+MinimumStripLength+"m"+","+"Business class: " + BusinessClass + "," + "Number Of Passengers: " + NumberOfPassengers);

        }
    public void displayTickets() {//выводим количество загружаемого груза
        System.out.print("NumberOfTickets: "+NumberOfTickets);

    }
    }

