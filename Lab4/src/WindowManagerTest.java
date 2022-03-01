public class WindowManagerTest {
    public static void main(String[] args) {
        // Window manager is private so compilation will fail
        WindowManager wm1 = WindowManager.getManager();
        wm1.print("Hello im a new Singleton");
        System.out.println("wm1 = " + wm1);

        WindowManager wm2 = WindowManager.getManager();
        wm2.print("Hello im a new Singleton");
        System.out.println("wm2 = " + wm2);

        WindowManager wm3 = WindowManager.getManager();

    }
}
