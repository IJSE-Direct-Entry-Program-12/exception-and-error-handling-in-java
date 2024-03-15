import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {
        try {
            invoker();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

//    static void invoker() throws ClassNotFoundException, SQLException, NoSuchFieldException{
    static void invoker() throws Exception{
        myMethod();
        myMethod2();
    }

    static void myMethod() throws ClassNotFoundException, SQLException {

    }

    static void myMethod2()throws NoSuchFieldException{

    }
}
