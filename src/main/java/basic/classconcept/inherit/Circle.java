package basic.classconcept.inherit;

public class Circle extends Shape {
    private Point center;
    private double r;

    //父类构造方法默认会优先于子类之前执行，这个和py不太一样，py里面只会执行一个构造方法
    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override //override the father method in father class
    public void draw() {
        System.out.println("draw circle at" + center.toString() + " with r" + r + ",using color:" + getColor());
    }

    public double area() {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        Point center = new Point(2, 3);
        Circle circle = new Circle(center, 2);
        circle.draw();
        System.out.println(circle.area());
    }
}
