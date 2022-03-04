public class RegistryTest {
    public static void main(String[] args) {
    /* Singleton object only ever has a single address type
    *  Object can be changed with a method within the registry
    * */

    LogManager lm = (LogManager) Registry.singletonObjects("Log Manager");

    System.out.println("lm = " + lm);

    PrintManager pm = (PrintManager) Registry.singletonObjects("Print Manager");

    System.out.println("pm = " + pm);

    WindowManager wm = (WindowManager) Registry.singletonObjects("Window Manager");

    System.out.println("wm = " + wm);

    MessageManager mm = (MessageManager) Registry.singletonObjects("Message Manager");

    System.out.println("mm = " + mm);

    }
}
