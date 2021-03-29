import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ServerSystem {

    private DataManager manager = new DataManager();
    private int serverPort;

    public ServerSystem(int port) {
        serverPort = port;

    }

    public void runSystem() {
        System.out.println("Runnning system ...");
        DatagramSocket socket = null;

        try {
            socket = new DatagramSocket(serverPort);
            socket.setSoTimeout(0);

            // loop forever

            while (true) {
                byte[] buffer = new byte[1024];

                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String message = new String(buffer);
                System.out.println("Got: " + message);

                String[] elements = message.trim().split(",");

                switch (elements[0]) {
                case "REGISTER":
                    System.out.println("I've got a register message");
                    String IPAddress = elements[1];
                    int port = Integer.parseInt(elements[2].trim());
                    String name = elements[3];
                    Data newData = new Data(IPAddress, port, name);
                    manager.registerData(newData);
                    break;
                case "STOP":
                    System.out.println("I've been told to stop");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Don't understand this message: " + message);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
