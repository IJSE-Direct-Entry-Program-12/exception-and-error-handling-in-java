import java.sql.DriverManager;
import java.sql.SQLException;

public class AppInitializer {
    public static void main(String[] args) {

    }
    static void myMethod1()  {
        try{
            //DriverManager.getConnection("");
            throw new RuntimeException("Something went wrong");
        }catch (Exception e){
            throw e;        // Why don't we need to apply catch or specify rule here?
        }
    }
    static void myMethod2(){
        try{
        }catch (Exception e){
            throw e;        // Why don't we need to apply catch or specify rule here?
        }
    }
    static void myMethod3() throws Exception{
        try{
            throw new Exception("I mean trouble");
        }catch (Exception e){
            throw e;    // Why do we need to apply catch or specify rule here?
        }
    }
    static void myMethod4() throws ClassNotFoundException{
        try{
            throw new ClassNotFoundException("No Class Found");
        }catch (Exception e){
            throw e;    // Why do we need to apply catch or specify rule here?
            // How is it possible to mention ClassNotFoundException instead of Exception in the method header?
        }
    }
}
