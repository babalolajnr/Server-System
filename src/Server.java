public class Server {
    public static void main(String[] args) {
        // run the derver on port 4000
        ServerSystem server = new ServerSystem(4000);
        server.runSystem();
    }
}
