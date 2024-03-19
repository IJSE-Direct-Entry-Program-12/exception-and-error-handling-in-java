import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {

    }

    static void myMethod1(){
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
            Integer.parseInt("abc");
        } catch (ClassNotFoundException | SQLException | NumberFormatException e) {

        }
    }

    static void myMethod2(){
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
            Integer.parseInt("abc");
        } catch (ClassNotFoundException | SQLException e) {
        //} catch (NumberFormatException | ArrayIndexOutOfBoundsException | RuntimeException ex){
            // Union Types can't have is-a relationships
        //}
    }
}
