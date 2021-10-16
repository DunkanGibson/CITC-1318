public class TestAll {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 7);
        Square s1 = new Square(p1);
        Rectangle r1 = new Rectangle(p2);

        System.out.println(c1.getRadius());
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(s1.getSideLength());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(r1.getWidth());
        System.out.println(r1.getHeight());
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
    }
}
