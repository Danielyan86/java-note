package basic.classconcept.inherit.ProtectedKeyword;

public class Child extends Base {
    protected void step1() {
        System.out.println("child step: " + this.currentStep);
    }

    protected void step2() {
        System.out.println("child step: " + this.currentStep);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.action();
    }
}
