public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle (5,5, 2, 4);
        System.out.println (rectangle.getX());
        System.out.println (rectangle.getY());
        System.out.println (rectangle.areaOfShape());
        System.out.println (rectangle.perimeterOfShape());

        Triangle triangle = new Triangle (5,5, 3, 4, 5, 1.5708);
        System.out.println (triangle.getX());
        System.out.println (triangle.getY());
        System.out.println (triangle.areaOfShape());
        System.out.println (triangle.perimeterOfShape());

        Circle circle = new Circle (5,5, 2);
        System.out.println (circle.getX());
        System.out.println (circle.getY());
        System.out.println (circle.areaOfShape());
        System.out.println (circle.perimeterOfShape());
    }
}
