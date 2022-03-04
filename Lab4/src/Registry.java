public class Registry {
    private static Registry registry;

    private Registry(){

    }

    public static synchronized Registry getRegistry(){
        if (registry == null)
            registry = new Registry();
            return registry;
    }

    public void print(String message){
        System.out.println(message);
    }

    public static Object singletonObjects(String s){
        if (s == "Message Manager"){
            System.out.println("This is the Message Manager Singleton: ");
            return MessageManager.getManager();
        } else if (s == "Log Manager"){
            System.out.println("This is the Log Manager Singleton: ");
            return LogManager.getLogManager();
        } else if (s == "Window Manager"){
            System.out.println("This is the Window Manager Singleton: ");
            return WindowManager.getManager();
        } else if (s == "Print Manager"){
            System.out.println("This is the Print Manager: ");
            return PrintManager.getPrintManager();
        } else {
            return "That Singleton does not exist";
        }

    }
}
