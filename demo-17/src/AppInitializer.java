import java.sql.DriverManager;
import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {

    }

    static void myMethod1(){
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
        } catch (ClassNotFoundException e) {
            e = null;
        } catch (SQLException e) {

        }
    }

    static void myMethod2(){
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {

        }
    }
}
