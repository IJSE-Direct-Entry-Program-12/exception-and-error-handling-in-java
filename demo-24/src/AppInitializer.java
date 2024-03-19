public class AppInitializer {
    public static void main(String[] args) {
        try {
            myMethod1();
        }catch (Exception e){
            System.out.println("No worries, I got you");
            e.printStackTrace();
        }
    }
    static void myMethod1(){
        try {
            myMethod2();
        } catch (Exception e) {
            System.out.println("myMethod1: Don't worry ma bro, I am going to fix you");
            throw new RuntimeException(e);
        }
    }
    static void myMethod2()throws Exception{
        try {
            myMethod3();
        } catch (Exception e) {
            System.out.println("myMethod2: I got you bro");
            throw e;
        }
    }
    static void myMethod3() throws Exception {
        throw new Exception("I am the reason for all these problems");
    }
}
