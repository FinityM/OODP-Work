public class Car extends Vehicle{

    private int numDoors;

    public Car(String colour, String type, String engineSize, double netPrice, double vrt, int numDoors) {
        super(colour, type, engineSize, netPrice, vrt);
        this.numDoors = numDoors;
    }


}
