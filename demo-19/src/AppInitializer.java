public class AppInitializer {

    static int total;
    static{
        try {
            total = add(10,20);
        } catch (Exception e) {
        }
    }
    int myTotal;
    {
        try {
            myTotal = add(20,15);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    static int add(int num1, int num2) throws Exception{
        return num1 + num2;
    }

    public static void main(String[] args) {
        new AppInitializer();
    }
}
