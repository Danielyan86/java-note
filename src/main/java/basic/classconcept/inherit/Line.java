package basic.classconcept.inherit;

public class Line extends Shape {
    private Point start, end;

    public Line(Point start, Point end, String color) {
        super(color);
        this.start = start;
        this.end = end;
    }


    public double length() {
        return start.distance();
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    @Override
    public void draw() {
        System.out.println("draw line from" + start.toString() + "to" + end.toString() +
                "using color " + super.getColor());
    }

    public static void main(String[] args) {
        Line line = new Line(new Point(1, 1), new Point(2, 3), "red");
        line.draw();

    }
}
