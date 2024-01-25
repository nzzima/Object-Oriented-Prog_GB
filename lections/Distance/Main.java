package lections.Distance;

public class Main {
    public static void main(String[] args) {
        Point20 a = new Point20(0, 2);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point20 b = new Point20(0);
        System.out.println(b.getX());
        System.out.println(b.getY());

        var dis = Point20.distance(a, b);
        System.out.println(dis);
    }
}
