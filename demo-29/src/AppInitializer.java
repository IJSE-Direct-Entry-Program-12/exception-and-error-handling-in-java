import java.io.Closeable;
import java.io.IOException;

public class AppInitializer {

    public static void main(String[] args) throws Exception {
        System.out.println(myMethod2());
    }

    static int myMethod1() throws Exception {
        Resource1 res1 = new Resource1();
        Resource2 res2 = new Resource2();
        try {
            System.out.println(res1);
            System.out.println(res2);
            return 10;                  // R=10
        } finally {
            res1.close();
            res2.close();
        }
    }

    static int myMethod2() throws Exception {
        try (Resource1 res1 = new Resource1();
             Resource3 res3 = new Resource3();
             Resource2 res2 = new Resource2()) {
            System.out.println(res1);
            System.out.println(res2);
            return 10;
        }finally{
            System.out.println("This is try..with..resource statement");
        }
    }
}

class Resource1 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Resource1 is about to close");
    }
}

class Resource2 implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Resource2 is about to close");
    }
}

class Resource3 implements Closeable {
    public void close()throws IOException {
        System.out.println("Resource3 is about to close");
    }
}
