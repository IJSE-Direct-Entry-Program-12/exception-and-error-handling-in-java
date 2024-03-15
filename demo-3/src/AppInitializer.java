import java.sql.SQLDataException;
import java.sql.SQLException;

public class AppInitializer {

    public static void main(String[] args) {
        // throws clause (method header)
        // throw statement

        try {
            myMethod1();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }

        // We have to apply catch or specify rule here, otherwise
        // compiler will not compile the code
        //myMethod2();

        //myMethod3();
    }

    // Not risky
    public static void myMethod1() throws NullPointerException, ArithmeticException {
    }

    // Risky
    public static void myMethod2() throws ClassNotFoundException, RuntimeException, Error {
    }

    // Risky
    public static void myMethod3() throws Exception, Throwable, Throwable, ClassNotFoundException, Error, Error {

    }
}

class Super {
    public static void myStaticMethod() throws NumberFormatException {}
    public void myMethod() throws ClassNotFoundException, SQLException {}
    public void myMethod2() throws ClassNotFoundException, SQLException {}
    public void myMethod3() throws ClassNotFoundException, SQLException {}
    public void myMethod4() throws ClassNotFoundException, Exception {}
}

class Sub extends Super {
    public static void myStaticMethod() throws RuntimeException {}
    public void myMethod() {}
    public void myMethod2() throws Error {}
    public void myMethod3() throws ClassNotFoundException, SQLException {}
    //public void myMethod4() throws ClassNotFoundException, Throwable {}
}

class Parent{
    public void myMethod() throws ClassNotFoundException, Exception{}
}

class Child extends Parent{
    public void myMethod() throws ClassNotFoundException, SQLException{}
}
