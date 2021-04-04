public class DataOnly {
    int i;
    double d;
    boolean b;

    // If the var is not initialized, it still has some initial value
    public static void main(String[] args) {
        DataOnly data = new DataOnly();
        System.out.println(data.i);
        System.out.println(data.b);
        System.out.println(data.d);
        data.i = 1;
        data.d = 2;
        data.b = true;
        System.out.println(data.i);
        System.out.println(data.b);
        System.out.println(data.d);
    }
}
