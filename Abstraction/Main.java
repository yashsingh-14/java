public class Main {

    public static void main(String[] args) {
        
        Shape Circle = new Circle(5.5, "Blue");
        Shape Rectangle = new Rectangle(4.0, 6.0, "Blue");

        System.out.println("Circle");
        Circle.describe();
        System.out.println("Area:"+Circle.area());
        System.out.println("Perimeter:"+Circle.perimeter());
        System.out.println();

        System.out.println("Rectangle");
        Rectangle.describe();
        System.out.println("area:"+Rectangle.area());
        System.out.println("perimeter:"+Rectangle.perimeter());
    }
}
