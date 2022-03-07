public class ComputerClient {
    public static void main(String[] args) {


        Computer basic = ComputerBuilderDirector.getBasicComputer();
        Computer graphics = ComputerBuilderDirector.getGraphicsCardEnabledComputer();

        /**
         * The product class
         *
         * */
        Computer newComputer = new Computer.Builder("64GB", "1PB", "AMD Threadripper")
                .setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true)
                .build();

        basic.display();
        graphics.display();
        newComputer.display();
    }
}
