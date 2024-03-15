public class AppInitializer {

    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Got it");
            }
        });
        myMethod(); // Abrupt execution of the myMethod
        System.out.println("About to exit from the main");
    }
    static void myMethod(){
        System.out.println("Entering into the myMethod");
        try{
            System.out.println("Entering into the try block of myMethod");
            System.out.println(5 / 0);
            System.out.println("About to exit from the try block of myMethod");
        }catch (NullPointerException e){
            System.out.println("NullPointer Exception");
        }
        System.out.println("About to exit from the myMethod");
    }
}
