public class ExceptionTest {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("please input the number");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.err.println("parameter" + args[0] + "is not a valid number , please input a valid number");

        }
    }
}
