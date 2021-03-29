import java.util.LinkedList;

public class DataManager {
    private LinkedList availableData;

    public DataManager() {
        availableData = new LinkedList();

    }

    public void registerData(String IPAddress, int port, String name) {
        availableData.add(new Data(IPAddress, port, name));
    }

    public void registerData(Data data) {
        if (data != null) {
            System.out.println("Adding data " + data.getName());
            availableData.add(data);
        }
    }

    public Data findData(String name) {
        Data data = null;

        for (int i = 0; i < availableData.size(); i++) {
            data = (Data) availableData.get(i);
            if (data != null) {
                if (data.getName().equals(name)) {
                    return data;
                }
            }
        }

        return data;
    }
}
