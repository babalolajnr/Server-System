public class Data {
    private String IPAddress;
    private int port;
    private String name;

    public Data(String IPAddress, int Port, String name) {
        this.IPAddress = IPAddress;
        port = Port;
        this.name = name;
    }

    public Data() {

    }

    public void setPort(int Port) {
        port = Port;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public int getPort() {
        return port;
    }

    public String getName() {
        return name;
    }

    public String getIPAddress() {
        return IPAddress;
    }
}