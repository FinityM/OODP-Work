public class MessageManagerTest {
    public static void main(String[] args) {
        MessageManager m = MessageManager.getManager();

        m.print("Message");
        System.out.println("m = " + m);

        for (int i = 0; i < 10; i++){
            m.send("localhost", 5001, "Hello");
        }
        m.send("localhost", 5001, "STOP");
    }
}
