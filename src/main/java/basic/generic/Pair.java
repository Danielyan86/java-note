package basic.generic;

public class Pair<U, V> {
    U first;
    V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }

    public U getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("old horse", 100);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
    }
}
