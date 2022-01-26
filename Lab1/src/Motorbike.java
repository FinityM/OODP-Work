public class Motorbike extends Car{

    public boolean carrier;

    public Motorbike(String colour, String type, String engineSize, double netPrice, double vrt, int numDoors, boolean carrier) {
        super(colour, type, engineSize, netPrice, vrt, numDoors);
        this.carrier = carrier;
    }
}
