public class AppInitializer {

    public static void main(String[] args) {
        try {
            System.out.println("About to enter into the my method");
            myMethod();
            System.out.println("About to finish this whole shit now!".split(",")[0].toCharArray().length);
        }catch (Exception ex){
            System.out.println("I am about to catch everything, you know...!");
        }
        System.out.println("I am about to exit from the main method");
    }

    static void myMethod(){
        try{
            System.out.println("Entering into the try block1");
            new Customer().doSomething();
        }catch (Exception ex){
            if (ex instanceof RuntimeException){
                System.out.println("Got it?");
                Thread.currentThread().setUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler());
            }else if (ex instanceof ArrayIndexOutOfBoundsException){
                System.out.println("Not sure?");
                Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("I am going crazy now...!");
                    }
                });
            }
        }
        System.out.println("Exit from the myMethod");
    }
}

class Customer{
    void doSomething() throws Exception {
        try{
            System.out.println("Entering into the try block in doSomething");
            System.out.println(new String[]{"ijse", "null"}[1].toUpperCase());
            System.out.println("About to exit from the try block in doSomething");
        }catch (NullPointerException exp){
            System.out.println("Got it");
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("I got it here");
                }
            });
        }catch (ArrayIndexOutOfBoundsException exp){
            System.out.println("Caught it");
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("Got it got it");
                }
            });
        }
        System.out.println("About to enter into the myMethod");
        myMethod();
        System.out.println("About to exit from the doSomething()");
    }

    void myMethod()throws Exception{
        try{
        System.out.println("Entering into the main method's try block");
        System.out.println(Thread.getDefaultUncaughtExceptionHandler().toString());
        System.out.println("About to exit from the try block");
        }catch (RuntimeException exp){
            try {
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                    @Override
                    public void uncaughtException(Thread t, Throwable e) {
                        System.out.println("C'mon");
                        String str;
                        (str = null).toUpperCase();
                        System.out.println("What the heck?");
                    }
                });
            }catch (NullPointerException abc){
                System.out.println("Got the null pointer exception");
            }
            System.out.println("About to exit from the catch clause");
        }
        System.out.println("About to exit from the myMethod");
        Customer c = null;
        String s = c + "".toUpperCase();
        System.out.println(s.toCharArray()[4]);
    }
}
