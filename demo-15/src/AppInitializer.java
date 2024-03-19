import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {
        myMethod();
    }

    static void myMethod() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("myMethod");
            }
        //} catch (ClassNotFoundException ex){
            // You can't use checked exceptions like this
        } catch (RuntimeException ex){
            // But you can use un-checked exceptions like this
        }
    }
}
