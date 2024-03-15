public class AppInitializer {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("I caught it finally");
            }
        });
        try{
            System.out.println("About to enter into the myMethod1");
            myMethod1();
            System.out.println("myMethod1 completed normally");
        }catch (ClassNotFoundException exp){
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                        @Override
                        public void uncaughtException(Thread t, Throwable e) {
                            System.out.println("You know I am the one who caught it");
                        }
                    });
                }
            });
            System.out.println("Here we go...!, I finally caught it");
        }
        System.out.println("About to exit from the main");
    }

    private static void myMethod1() throws ClassNotFoundException{
        try{
            System.out.println("Entering into the first try block");
            try{
                System.out.println("Entering into the second try block");
                try{
                    System.out.println("Entering into the third try block");
                    System.out.println(new String[]{"ijse", null}[2]);
                    System.out.println("About to exit from the third try block");
                }catch (RuntimeException exception){
                    System.out.println("Got it");
                    System.out.println(Integer.parseInt("C50"));
                }
                System.out.println("About to exit from the second try block");
                System.out.println(5/0);
            }catch (ArithmeticException exp){
                System.out.println("Caught the arithmetic issue");
            }
            System.out.println("About to exit from the third try block");
        }catch (IllegalArgumentException exp){
            System.out.println("I got it");
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("No no I am the one who is going to handle this");
                }
            });
            exp = (NumberFormatException)(Object)((ClassNotFoundException)(Throwable)exp);
            System.out.println("Are you sure?");
        }
    }
}
