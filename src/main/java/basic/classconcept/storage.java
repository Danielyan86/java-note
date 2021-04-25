package basic.classconcept;

public class storage {
    static String storageMethod(String s) {
        return s;
    }

    public static void main(String[] args) {
        String a = "this is a string";
        String b = storageMethod(a);
        System.out.println(b);
    }
}
