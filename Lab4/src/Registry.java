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
}
