public class Vehicle {
    private String colour;
    private String type;
    private String engineSize;
    private double netPrice;

    public Vehicle(String colour, String type, String engineSize, double netPrice) {
        this.colour = colour;
        this.type = type;
        this.engineSize = engineSize;
        this.netPrice = netPrice;
    }

    public double vehicleRegTax(){
        this.netPrice = netPrice;

        return netPrice * .21;
    }

    public double getNetPrice() {
        return netPrice;
    }

}
