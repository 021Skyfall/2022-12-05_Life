public class Life_Casting {
    public static void main(String[] args) {
        double a = 1.1;
        double b = 1;	// = (double) 1
        System.out.println(b);

//		int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1;
        System.out.println(e);

        int x = (int)1412.3242;
        System.out.println(x);

        // 1 to String
        String f = Integer.toString(3);
        System.out.println(f.getClass());
    }
}
