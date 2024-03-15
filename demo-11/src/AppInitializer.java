public class AppInitializer {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("I got it");
            }
        });
        try {
            System.out.println("Entering into the first try block");
            try {
                System.out.println("About to enter into the myMethod1");
                myMethod1("C10");
                System.out.println("myMethod1 completed normally");
            } catch (Throwable t) {
                Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("I caught it");
                    }
                });
                System.out.println("What the heck");
                System.out.println((new int[0])[0]);
            }
            System.out.println("About to exit from the first try block");
        }catch (NumberFormatException e){
            System.out.println("Got it finally");
        }
        System.out.println("About to exit from the main");
    }

    static void myMethod1(String str){
        System.out.println("Entering into the myMethod1");
        try{
            System.out.println("Entering to the try block");
            System.out.println(Integer.parseInt(str));
            System.out.println("About to exit from the try block");
        }catch (ArithmeticException e){
            System.out.println("Something went wrong");
        }
        System.out.println("About to exit from the myMethod1");
    }
}
