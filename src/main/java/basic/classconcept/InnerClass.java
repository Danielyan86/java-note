package basic.classconcept;

public class InnerClass {
    private static int shared = 100;

    public static class StaticInner {
        public void innerMethod() {
            System.out.println("Inner " + shared);
        }
    }

    public void test() {
        StaticInner si = new StaticInner();
        si.innerMethod();
    }

    public static void main(String[] args) {
        InnerClass ic = new InnerClass();
        ic.test();
    }
}