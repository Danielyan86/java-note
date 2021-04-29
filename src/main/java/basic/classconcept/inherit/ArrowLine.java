package basic.classconcept.inherit;

public class ArrowLine extends Line {
    private boolean startArrow;
    private boolean endArrow;

    public ArrowLine(Point start, Point end, String color, boolean startArrow, boolean endArrow) {
        super(start, end, color);
        this.startArrow = startArrow;
        this.endArrow = endArrow;
    }

    @Override
    public void draw() {
        super.draw();
        if (startArrow) {
            System.out.println("draw start arrow");
        }
        if (endArrow) {
            System.out.println("draw end arrow");
        }
    }

    public static void main(String[] args) {
        // if the parameter is a user-defined object, the new keyword need to added
        ArrowLine line = new ArrowLine(new Point(0, 0), new Point(1, 1), "yellow", true, true);
        line.draw();
    }
}
