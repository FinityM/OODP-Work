public class TestVehicles {
    public static void main(String[] args) {
        Car teslaModelS = new Car("Red", "Electric", "960 lb-ft", 99899, 4);
        Motorbike hondaCB500F = new Motorbike("Black", "Gas", "67mm x 66.8mm", 6855, .13, true);

        System.out.println("Tesla Model S VRT: " + teslaModelS.vehicleRegTax());
        System.out.println("Honda CB500F – 22YM VRT: " + hondaCB500F.vehicleRegTax());
    }
}
