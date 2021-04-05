package control;

public class WhileTest {
    static boolean condition() {
        double randomNumber = Math.random();
        System.out.println(randomNumber);
        boolean result = Math.random() < 0.99;
        System.out.println(result + ",");
        return result;
    }

    public static void main(String[] args) {
        while (condition()) {
            System.out.println("inside the while");
        }
        System.out.println("outside the while");
    }
}
