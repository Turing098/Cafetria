package cafeteria;

public class Main {

    public static void main(String[] args) {

        String databaseURL = "jdbc:mysql://localhost/store_db?user=root&password=password123";
        Database storeDatabase = new Database("com.mysql.jdbc.Driver",databaseURL);

        storeDatabase.connect();
    }




}
