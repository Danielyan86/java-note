class Soap {
    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "constructed";
    }

    public String toString() {
        return s;
    }
}

public class Bath {
    private String s1 = "happy", s2 = "Happy", s3, s4;
    private Soap castile;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("inside bath()");
        s3 = "Joy";
        castile = new Soap();
    }

    {
        i = 47;
    }

    public String toString() {
        if (s4 == null) // Delayed initialization
            s4 = "Joy";
        return
                s1 + s2 + s3 + s4 + i + toy + castile;
    }

    public static void main(String[] args) {
        Bath b = new Bath();
        System.out.println(b);

    }
}
