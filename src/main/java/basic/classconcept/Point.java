package basic.classconcept;

public class Point {
    private int x, y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);

    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point();
        p.setX(3);
        p.setY(4);
        double result = p.distance();
        System.out.println(result);
        System.out.println(p.toString());
    }
}
