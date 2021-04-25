package basic.control;

public class Ternary {
    static int ternary(int i) {
        return i < 10 ? i * 1000 : i * 10;
    }

    public static void main(String[] args) {
        System.out.println(ternary(10));
        System.out.println(ternary(9));
    }
}
