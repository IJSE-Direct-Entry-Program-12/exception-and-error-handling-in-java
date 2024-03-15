public class AppInitializer {

    public static void main(String[] args) {
        Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("Wadea Kachal");
            }
        });
//        System.out.println(Thread.getDefaultUncaughtExceptionHandler());
//        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
//            @Override
//            public void uncaughtException(Thread t, Throwable e) {
//                System.out.println(t.getName());
//            }
//        });

        System.out.println(divide(10,2));
        System.out.println(generateNewId("C005"));
        System.out.println(generateNewId("C015"));
        System.out.println(getMax(new int[]{5,3,0,10,-2,15}));

//        System.out.println(divide(5, 0));
        //System.out.println(generateNewId(null));
        System.out.println(generateNewId("CABC5"));
        //System.out.println(getMax(null));
        //System.out.println(getMax(new int[]{}));

        System.out.println("App is about to exit");
    }

    static int divide(int num1, int num2){
        return num1 / num2;
    }

    static String generateNewId(String id){
        int newId = Integer.parseInt(id.replace("C", "")) + 1;
        return "C%03d".formatted(newId);
    }

    static int getMax(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
        }
        return max;
    }
}
