public class AppInitializer {

    public static void main(String[] args) {
        Resource1 res1 = new Resource1();
        Resource2 res2 = new Resource2();
        try(res1; res2){
            System.out.println(res1);
            System.out.println(res2);
        } catch (Exception e) {
            System.out.println("Something went wrong while closing");
        } finally{
            System.out.println("Try..with..resource statement");
        }
    }

}
class Resource1 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Resource1 is being closed");
    }
}
class Resource2 implements AutoCloseable{
    @Override
    public void close() throws Exception {
        System.out.println("Resource2 is being closed");
    }
}
