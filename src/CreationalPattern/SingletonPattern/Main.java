package CreationalPattern.SingletonPattern;

public class Main {

    public static void main(String[] args) {
        DataBaseConnection connection1 = DataBaseConnection.getInstance();
        connection1.connect();

        DataBaseConnection connection2 = DataBaseConnection.getInstance();
        connection2.disconnect();
    }
}
