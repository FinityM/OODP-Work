public class LogManager {
    private static LogManager lm;

    private LogManager(){

    }

    public static synchronized LogManager getLogManager(){
        if (lm == null)
            lm = new LogManager();
            return lm;
    }

    public void print(String message){
        System.out.println(message);
    }
}
