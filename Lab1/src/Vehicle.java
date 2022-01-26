public class Vehicle {
    private String colour;
    private String type;
    private String engineSize;
    private double netPrice;
    private double vrt;

    public Vehicle(String colour, String type, String engineSize, double netPrice, double vrt) {
        this.colour = colour;
        this.type = type;
        this.engineSize = engineSize;
        this.netPrice = netPrice;
        this.vrt = vrt;
    }

    public double vehicleRegTax(){
        netPrice = this.netPrice;
        vrt = this.vrt;

        return netPrice * vrt;
    }

    public double getNetPrice() {
        return netPrice;
    }

    public double getVrt() {
        return vrt;
    }
}
