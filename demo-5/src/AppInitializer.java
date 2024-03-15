public class AppInitializer {

    public static void main(String[] args) {
    }

//    static void invoker() throws SuperException1, SuperException2{
//    static void invoker() throws Exception{
//    static void invoker() throws Throwable{
//    static void invoker() throws Object{    // Object does not maintain an is-a relationship with Throwable
    static void invoker() throws Throwable{
        myMethod1();
        myMethod2();
    }

    static void myMethod1() throws SubException1, SubException2{}
    static void myMethod2() throws SubException3{}
}

class SuperException1 extends Exception{}
class SuperException2 extends Exception{}
class SubException1 extends SuperException1{}
class SubException2 extends SuperException2{}
class SubException3 extends SuperException2{}
