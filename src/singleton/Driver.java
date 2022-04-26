package singleton;

public class Driver {
    String name;
    private static Driver driver;//driver object declared

    private Driver(){

    }

    public static Driver getDriver() {
        if (driver == null) driver = new Driver();
        return driver;
    }
}
