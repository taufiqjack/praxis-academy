package kasusuji;

public abstract class Bicycle {

    public int cadence = 0;
    public int speed = 0;
    public int gear = 1;

    public Bicycle(int cadence, int speed, int gear) {
        this.cadence = cadence;
        this.speed = speed;
        this.gear = gear;
    }
    

    // public static void main(String[] args) {
    // BicycleUpgrade bike1 = new BicycleUpgrade();
    // BicycleUpgrade bike2 = new BicycleUpgrade();

    // bike1.changeCadence(50);
    // bike1.speedUp(10);
    // bike1.changeGear(2);
    // bike1.printStates();

    // bike2.changeCadence(50);
    // bike2.speedUp(10);
    // bike2.changeGear(2);
    // bike2.changeCadence(40);
    // bike2.speedUp(10);
    // bike2.changeGear(3);
    // bike2.printStates();
    // ;

    // }

}