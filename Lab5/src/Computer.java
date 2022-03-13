/**
 * The concrete builder
 * */
public class Computer {
    private final String RAM;
    private final String HDD;
    private final String CPU;

    // Optional parameters
    private boolean isGraphicsCardEnabled = false;
    private boolean isBluetoothEnabled = false;

    public Computer(Builder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.CPU = builder.CPU;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
    }

    public void display() {
        System.out.println("Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", CPU='" + CPU + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}');
    }

    /**
     * The Builder class
     * */
    public static class Builder {
        private String RAM;
        private String HDD;
        private String CPU;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        public Builder(String RAM, String HDD, String CPU) {
            this.RAM = RAM;
            this.HDD = HDD;
            this.CPU = CPU;
        }

        public Builder getRAM() {
            this.RAM = RAM;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder getHDD() {
            this.HDD = HDD;
            return this;
        }

        public Builder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public Builder getCPU() {
            this.CPU = CPU;
            return this;
        }

        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
