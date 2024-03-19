public class AppInitializer {
    public static void main(String[] args) {
    }
    static int complexAlgo(int x, int y)throws Exception{
        return x + y;
    }
}

class SuperClass{
    int result = AppInitializer.complexAlgo(10,15);

    public SuperClass()throws Exception {
        super();
        // result = AppInitializer.complexAlgo(10,15);
        System.out.println("SuperClass");
    }
}

//class SubClass extends SuperClass{}

