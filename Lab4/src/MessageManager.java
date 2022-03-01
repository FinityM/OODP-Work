import java.io.*;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class MessageManager
{
    // This will be the one and only WindowManager instance
    private static MessageManager mmanager;
    private static DatagramSocket dsock;

    private MessageManager(){
        // Private constructor that does nothing
        try {
            dsock = new DatagramSocket();
        } catch (IOException e){
            System.out.println(e.toString());
        }
    }
    // Public synchronized method which will return a
    // WindowManager
    public static synchronized MessageManager getManager(){
        // If true then we need to create an instance of
        // WindowManager
        if (mmanager == null)
            mmanager = new MessageManager();
        return mmanager;
    }
    // Test method so we can ensure that our
    // object works
    public void print(String s){
        System.out.println("I'm a Message Manager.");
    }

    public void send(String hostname, int port, String message){
        try {
            InetAddress address = InetAddress.getByName(hostname);

            byte[] sendBuf = message.getBytes();

            DatagramPacket packet = new DatagramPacket(sendBuf, sendBuf.length, address, port);

            dsock.send(packet);

        }catch (Exception e){
            System.out.println(e.toString());
        }
    }
}

