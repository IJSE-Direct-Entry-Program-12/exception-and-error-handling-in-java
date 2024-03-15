public class AppInitializer {
    static String something;
    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("What the heck?");
            }
        });
        System.out.println("About to enter into the myMethod1");
        myMethod1();
        System.out.println("About to exit from the main");
    }
    static void myMethod1(){
        System.out.println("Entering into the myMethod1");
        try{
            myMethod2();
        }catch (Exception e){
            System.out.println("Got it");
            System.out.println(something.toUpperCase());
        }
        System.out.println("About to exit from the myMethod1");
    }
    static void myMethod2(){
        System.out.println("Entering into the myMethod2");
        System.out.println(5 / 0);
        System.out.println("About to exit from the myMethod2");
    }
}
