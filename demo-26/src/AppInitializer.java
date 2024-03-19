import java.sql.DriverManager;
import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {

    }

    static void myMethod1() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

//    static void myMethod2() throws ClassNotFoundException, SQLException {
    static void myMethod2() throws Exception {
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
        } catch (Exception e){
            if (false) e = null;
            //e = new ClassNotFoundException("New Class Not Found Exception");
            throw e;
        }
    }
}
