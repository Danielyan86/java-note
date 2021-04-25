package basic.classconcept;

public class Incrementable {
    static int i = 47;//when use static keyword, the var i is like class var in python
    int j = 99;
}

class incrementableTest {
    public static void main(String[] args) {
        Incrementable increTest = new Incrementable();
        System.out.println(increTest.i);
        increTest.i = increTest.i + 1;
        increTest.j = increTest.j + 1;
        Incrementable increTest2 = new Incrementable();
        System.out.print("var i is " + increTest2.i + "\n");
        System.out.print("var j is " + increTest2.j);
    }

}