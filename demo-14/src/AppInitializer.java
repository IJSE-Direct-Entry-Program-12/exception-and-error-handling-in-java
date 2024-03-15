public class AppInitializer {
    public static void main(String[] args) {
        try {
            A a = new C();
            a.myMethod();
        }catch (Throwable t){
            if (t instanceof RuntimeException){
                System.out.println("This exceptions are terrible");
            }else{
                System.out.println("Damn! I can't handle this anymore");
            }
        }
    }
}

class A{
    void myMethod(){
        System.out.println("A: myMethod");
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Got it");
            }
        });
        System.out.println(5/2);
        System.out.println("About to exit from the A:myMethod");
    }
}
class B extends A{
    void myMethod(){
        try {
            System.out.println(Integer.parseInt("ABC10"));
        }catch (RuntimeException ex){
            super.myMethod();
            System.out.println("Got a runtime exception".toCharArray()[-5]);
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("I can catch this");
                }
            });
        }
    }
}
class C extends A{
    void myMethod(){
        try {
            System.out.println("C: myMethod");
            try {
                System.out.println("About to create a new B object");
                A a = new B();
                System.out.println("Let's execute the b Object");
                a.myMethod();
            } catch (RuntimeException exp) {
                System.out.println("MyRuntime exception");
                try {
                    Class.forName("abc");
                }catch (ClassNotFoundException exp1){
                    System.out.println("I got this");
                    Class.forName("B");
                }
            }
        }catch (ClassNotFoundException exp){
            System.out.println("I got it here?");
            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("What the heck?");
                }
            });
            System.out.println("I finally have peace");
        }
    }
}