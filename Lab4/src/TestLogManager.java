public class TestLogManager {
    public static void main(String[] args) {
        LogManager logManager = LogManager.getLogManager();
        logManager.print("New Log");
        System.out.println("logManager = " + logManager);
    }
}
