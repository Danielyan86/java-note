package basic.classconcept.inherit;

public class ShapeManager {
    private static final int MAX_NUM = 100;
    private Shape[] shapes = new Shape[MAX_NUM];
    private int shapeNum = 0;

    public void addShape(Shape shape) {
        if (shapeNum < MAX_NUM) {
            shapes[shapeNum++] = shape;
        }
    }

    public void draw() {
        for (int i = 0; i < shapeNum; i++) {
            shapes[i].draw();
        }
    }

    // addShape方法的参数类型是shape，但是传入的确实子类数据类型，circle，line，等等
/// 这就是java多态的实现
    public static void main(String[] args) {
        ShapeManager manager = new ShapeManager();
        manager.addShape(new Circle(new Point(0, 0), 1));
        manager.addShape(new Line(new Point(1, 2), new Point(3, 4), "black"));
        manager.addShape(new ArrowLine(new Point(0, 0), new Point(1, 2), "red", false, true));
        manager.draw();
    }
}
