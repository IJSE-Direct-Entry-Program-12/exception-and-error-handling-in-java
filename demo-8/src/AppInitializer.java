public class AppInitializer {
    public static void main(String[] args) {
        System.out.println("Entering into the main method");
        myMethod();
        System.out.println("About to exit from the main method");
    }
    static void myMethod(){
        System.out.println("Entering into the myMethod");
        myMethod1();
        System.out.println("About to exit from the myMethod");
    }
    static void myMethod1(){
        System.out.println("Entering into the myMethod1");
        try {
            myMethod2();
            System.out.println("About to exit from the try block from method1");
        }catch (Exception e){
            System.out.println("All is well");
        }
        System.out.println("About to exit from the myMethod1");
    }
    static void myMethod2(){
        System.out.println("Entering into the myMethod2");
        try {
            System.out.println("Entering into the try block");
            System.out.println(5 / 0);
            System.out.println("About to exit from the try block from method2");
        }catch (final NullPointerException e){
            //
            System.out.println("Null Pointer Exception");
        }
        System.out.println("About to exit from the myMethod2");
    }
}
