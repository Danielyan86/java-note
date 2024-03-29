package basic.classconcept;

import java.util.*;

abstract class Shape {
    void draw() {
        System.out.println(this + ".draw()");
    }

    abstract public String toString();
}

class Circle extends Shape {
    public String toString() {
        return "basic.classconcept.Circle";
    }
}

class Square extends Shape {
    public String toString() {
        return "basic.classconcept.Square";
    }
}

class Triangle extends Shape {
    public String toString() {
        return "basic.classconcept.Triangle";
    }
}

public class Shapes {
    public static void main(String[] args) {
        List<Shape> shapeList = Arrays.asList(new Circle(), new Square(), new Triangle());
        for (Shape shape : shapeList)
            shape.draw();
    }
}
