public class Motorbike extends Car{

    public boolean carrier;

    public Motorbike(String colour, String type, String engineSize, double netPrice, double vrt, int numDoors, boolean carrier) {
        super(colour, type, engineSize, netPrice, numDoors);
        this.carrier = carrier;
    }

    public double vehicleRegTax(){
        return getNetPrice() * 0.13;
    }
}
