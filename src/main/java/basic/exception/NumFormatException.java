package basic.exception;

public class NumFormatException {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("please input number");
            return;
        }
        try {
            int num = Integer.parseInt(args[0]);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("parameter" + args[0] + "not a valid number");
        }

    }
}
