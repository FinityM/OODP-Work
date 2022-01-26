public class Car extends Vehicle{

    private int numDoors;

    public Car(String colour, String type, String engineSize, double netPrice, int numDoors) {
        super(colour, type, engineSize, netPrice);
        this.numDoors = numDoors;
    }


}
