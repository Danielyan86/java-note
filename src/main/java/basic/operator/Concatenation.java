// operator + is reload when adding non-string object
package basic.operator;

public class Concatenation {
    public static void main(String[] args) {
        String mango = "mango";
        String s = "abc" + mango + 47;
        System.out.println(s);
    }
}
