import java.sql.DriverManager;
import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {
        myMethod1();
    }

    static void myMethod1() {
        try {
            Class.forName("abc");
            DriverManager.getConnection("");
        } catch (ClassNotFoundException e) {

        } catch (SQLException e) {

        } catch (Exception e) {

        }
    }

    static void myMethod2() {
        /* Generalized exceptions handlers should follow specialized exception handlers */
        /* This rule applies to both checked and unchecked exceptions */

//        try {
//            Class.forName("abc");
//            DriverManager.getConnection("");
//        } catch (Exception e) {
//
//        } catch (ClassNotFoundException e) {
//
//        } catch (SQLException e) {
//
//        }
    }

    static void myMethod3() {
//        try {
//            try {
//                Class.forName("abc");
//                DriverManager.getConnection("");
//            } catch (Exception e) {
//            }
//        } catch (ClassNotFoundException ex) { // There is nothing to catch here
//        } catch (SQLException ex) {
//        }
    }
    static void myMethod4(){
        try {
            try {
                Class.forName("abc");
                DriverManager.getConnection("");
            } catch (ClassNotFoundException e) {
            }catch (SQLException e){}
        }catch (Exception ex){
        }
    }
}
