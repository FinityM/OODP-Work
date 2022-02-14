public abstract class NumberList {

    protected int[] int_list;
    protected double[] double_list;
    protected int[] hex_list;

    NumberList()
    {
        int_list = null;
        double_list = null;
        hex_list = null;
    }

    public int[] getInt_list() {return int_list;}
    public double[] getDouble_list() {return double_list;}
    public int[] getHex_list() {return hex_list;}
    public void display(){}
    public Number sum(){return null;}
}
