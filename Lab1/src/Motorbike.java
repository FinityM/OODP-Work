public class Motorbike extends Vehicle{

    public boolean carrier;

    public Motorbike(String colour, String type, String engineSize, double netPrice, double vrt, boolean carrier) {
        super(colour, type, engineSize, netPrice);
        this.carrier = carrier;
    }

    public double vehicleRegTax(){
        return getNetPrice() * 0.13;
    }
}
