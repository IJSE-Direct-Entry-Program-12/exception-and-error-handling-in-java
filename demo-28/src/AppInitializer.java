public class AppInitializer {

    static void myMethod1() {
        try {
            System.out.println("Entering into try block");
            System.out.println(5 / 2);
            System.out.println("About to exit from try block");
        } finally {
            System.out.println("Finally block is executed");
        }
        System.out.println("About to exit from the myMethod1");
    }

    static void myMethod2() {
        try {
            System.out.println("Entering into try block");
            System.out.println(5 / 2);
            System.out.println("About to exit from try block");
        } finally {
            System.out.println("Finally block is executed");
            System.out.println(5 / 0);
        }
        System.out.println("About to exit from the myMethod2");
    }

     static int myMethod3() {
        try {
            System.out.println("Entering into try block");
            if (true) return 10;        // Reason R = 10
        } finally {
            System.out.println("Finally block is executed");
        }
         System.out.println("About to exit from myMethod3");
        return 20;
    }

    static int myMethod4() {
        try {
            System.out.println("Entering into try block");
            if (true) return 10;        // Reason R = 10
        } finally {
            System.out.println("Finally block is executed");
            //System.out.println(5/0);    // Reason S = Arithmetic Exception
            if (true) return 30;            // Reason S = 30
            System.out.println("About to exit from the finally block");
        }
        System.out.println("About to exit from myMethod4");
        return 20;
    }

    static void myMethod5(){
        try {
            System.out.println("Entering into try block");
            System.out.println(5 / 0);  // V = Arithmetic Exception
            System.out.println("About to exit from the try block");
        } finally {
            System.out.println("Finally block is executed");
            System.out.println((new int[0])[0]);    // S=ArrayIndexOutOfBoundException
            System.out.println("About to exit from the finally block");
        }
        System.out.println("About to exit from myMethod5");
    }

    static void myMethod6(){
        try {
            System.out.println("Entering into try block");
            System.out.println(5 / 0);  // V = Arithmetic Exception
            System.out.println("About to exit from the try block");
        }catch (ArithmeticException e){
            System.out.println("Solved it".split(",")[5]);  // R = ArrayIndexOutOfBoundException
            System.out.println("About to exit from the catch block");
        } finally {
            System.out.println("Finally block is executed");
            String a = null;
            System.out.println(a.length()); // S = NullPointerException
            System.out.println("About to exit from the finally block");
        }
        System.out.println("About to exit from myMethod6");
    }

    static int myMethod7(){
        try {
            System.out.println("Entering into try block" + 5 / 0);  // V=Arithmetic Exception
            if (true) return 50;
            System.out.println("About to exit from the try block");
        }finally {
            System.out.println("Entering into the finally block");
            if (true) return 20;            // S = 20
            System.out.println("About to exit from the finally block");
        }
        System.out.println("About to exit from myMethod7");
        return 15;
    }

    public static void main(String[] args) {
        System.out.println(myMethod7());
    }
}
