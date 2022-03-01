public class PrintManager {
    private static PrintManager printManager;

    private PrintManager(){

    }

    public static synchronized PrintManager getPrintManager(){
        if (printManager == null)
            printManager = new PrintManager();
            return printManager;

    }

    public void print(String message){
        System.out.println(message);
    }
}
