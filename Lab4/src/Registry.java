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
            return MessageManager.getManager();
        } else if (s == "Log Manager"){
            return LogManager.getLogManager();
        } else if (s == "Window Manager"){
            return WindowManager.getManager();
        } else if (s == "Print Manager"){
            return PrintManager.getPrintManager();
        } else {
            return null;
        }

    }
}
