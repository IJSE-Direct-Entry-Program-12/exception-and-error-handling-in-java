public class AppInitializer {

    public static void main(String[] args) {
        // Catch
        try {
            loadMyClass();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    // Specify
    public static void loadMyClass() throws ClassNotFoundException {
        Class.forName("MyClass");
    }
}

class MyClass{
  static{
      System.out.println("I am being initialized");
  }
}
