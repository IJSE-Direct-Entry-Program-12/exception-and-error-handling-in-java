import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {
        try {
            myMethod1();
        } catch (SQLException e) {
            // Handle SQLException here
        } catch (NoSuchMethodException e) {
            // Handle NoSuchMethodException here
        }
    }

    static void myMethod1() throws SQLException, NoSuchMethodException{
        try {
            myMethod2();
        } catch (ClassNotFoundException e) {
            // Handle ClassNotFoundException here
        }
    }

    static void myMethod2() throws ClassNotFoundException, SQLException, NoSuchMethodException {

    }
}
