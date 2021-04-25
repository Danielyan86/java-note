package basic.control;

class WaterSource {
    private String s;

    WaterSource() {
        System.out.println("basic.control.WaterSource()");
        s = "Constructed";
    }

    public String toString() {
        return s;
    }
}

public class SprinklerSystem {
    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString() {
        return
                "valve1 = " + value1 + " " +
                        "valve2 = " + value2 + " " +
                        "valve3 = " + value3 + " " +
                        "valve4 = " + value4 + "\n" +
                        "i = " + i + " " + "f = " + f + " " +
                        "source = " + source;
    }


    public static void main(String[] args) {

        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
    }
}
