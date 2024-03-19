public class AppInitializer {

    public static void main(String[] args) {
        myMethod();
        System.out.println("About to exit");
    }

    static void myMethod(){
        RuntimeException exp = new RuntimeException("Something went wrong");
        AppInitializer app = new AppInitializer();
        //throw app;
        if (true) throw exp;
        System.out.println("Unreachable Statement");
    }

//    static void myMethod1(){
//        while (true) System.out.println("IJSE");
//        System.out.println("Unreachable Statement");
//    }
}
