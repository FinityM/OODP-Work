public class TestPrintManager {
    public static void main(String[] args) {
        PrintManager pm = PrintManager.getPrintManager();

        pm.print("New print singleton");

        System.out.println("pm = " + pm);


    }
}
