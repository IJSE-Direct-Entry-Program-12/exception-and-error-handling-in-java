public class AppInitializer {
    public static void main(String[] args) throws Exception {
        myMethod2();
    }

    static void myMethod2()throws Exception{
        try{
            System.out.println("Entering into outermost try block");
            try{
                System.out.println("Entering into innermost try block");
                System.out.println(5 / 0);
            }catch (Exception e){
                System.out.println("Caught it");
                throw new Exception(e);
            }finally{
                System.out.println("Innermost try block");
            }
            System.out.println("Let's try to execute this code");
        }finally {
            System.out.println("Outermost try block");
        }
        System.out.println("About to exit myMethod2");
    }

    static void myMethod() {
        try {
            try {
                System.out.println("Entering into the try block");
                System.out.println(5 / 0);
                System.out.println("About to exit from the try block");
            } finally {
                System.out.println("Nawa gilunath ban choon");
            }
        }finally{
            System.out.println("Apith ban choon thamai");
        }
        System.out.println("About to exit from myMethod");
    }
}
