package basic.classconcept;

class Letter {
    char c;
}

public class PassObject {
// basic.classconcept.Letter address 传入的是一个引用，和python可变对象类似的，里面的对象改变对造成外面对象的值变化Equ
    static void f(Letter address) {

        address.c = 'n';
    }

    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println(x.c);
        f(x);
        System.out.println(x.c);
    }
}
