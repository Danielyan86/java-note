package basic.control;

public class IfElse {
    static int result = 0;

    static void test(int testval, int target) {
        if (testval > target)
            result = result + 1;
        else if (testval < target)
            result = -1;
        else result = 0;
    }

    public static void main(String[] args) {
        test(1, 2);
        System.out.println(result);
        test(2, 1);
        System.out.println(result);
        test(1, 1);
        System.out.println(result);
    }
}
