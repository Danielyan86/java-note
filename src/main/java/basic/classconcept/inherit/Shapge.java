package basic.classconcept.inherit;

public class Shape {
    private static final String DEFAULT_COLOR = "black";
    private String color;

    public Shape() {
        this(DEFAULT_COLOR);
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
