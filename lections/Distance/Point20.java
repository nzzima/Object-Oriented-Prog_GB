package lections.Distance;

/**
 * It's point 20
 */
public class Point20 {
    private int x, y; //Coordinates

    /**
     * Constructor
     * @param valueX coordinate X
     * @param valueY coordinate Y
     */
    public Point20(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point20(int value) {
        this(value, value); //x = value; y = value;
    }

    public Point20() {
        this(0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    private String getInfo() {
        return String.format("x: %d; y: %d",x, y);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public static double distance(Point20 a, Point20 b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
