package CreationalPattern.SingletonPattern;

public class DataBaseConnection {
    private static DataBaseConnection instance = null;
    private String url;
    private String username;
    private String password;

    private DataBaseConnection(){
        url = "jdbc:mysql://localhost:3306/mydatabase";
        username = "myuser";
        password = "mypassword";
    }

    public static DataBaseConnection getInstance()
    {
        if(instance==null)
        {
            instance = new DataBaseConnection();
        }
        return instance;
    }

    public void connect() {
        // Code to connect to the database
        System.out.println("Connecting to database...");
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public void disconnect() {
        // Code to disconnect from the database
        System.out.println("Disconnecting from database...");
    }

}
