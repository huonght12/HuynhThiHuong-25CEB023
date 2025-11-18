package baitap4_5;

public class TestShape {
    public static void main(String[] args) {
        System.out.println("=== TEST SHAPE CLASS ===");
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("blue", false);
        System.out.println(s2);
        System.out.println("Color: " + s2.getColor());
        System.out.println("Filled: " + s2.isFilled());

        System.out.println("\n=== TEST CIRCLE CLASS ===");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Circle c2 = new Circle(2.5);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        Circle c3 = new Circle(3.0, "green", true);
        System.out.println(c3);
        System.out.println("Area: " + c3.getArea());
        System.out.println("Perimeter: " + c3.getPerimeter());

        System.out.println("\n=== TEST RECTANGLE CLASS ===");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(3.0, 5.0);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        Rectangle r3 = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(r3);
        System.out.println("Area: " + r3.getArea());
        System.out.println("Perimeter: " + r3.getPerimeter());

        System.out.println("\n=== TEST SQUARE CLASS ===");
        Square sq1 = new Square();
        System.out.println(sq1);
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());

        Square sq2 = new Square(5.0);
        System.out.println(sq2);
        System.out.println("Side: " + sq2.getSide());
        System.out.println("Area: " + sq2.getArea());
        System.out.println("Perimeter: " + sq2.getPerimeter());

        Square sq3 = new Square(4.0, "purple", true);
        System.out.println(sq3);
        System.out.println("Area: " + sq3.getArea());
        System.out.println("Perimeter: " + sq3.getPerimeter());

        // Test setSide - đảm bảo width và length bằng nhau
        System.out.println("\nTest setSide:");
        sq3.setSide(6.0);
        System.out.println("Sau khi setSide(6.0): " + sq3);
        System.out.println("Width: " + sq3.getWidth() + ", Length: " + sq3.getLength());

        // Test setWidth - đảm bảo cả width và length đều thay đổi
        System.out.println("\nTest setWidth:");
        sq3.setWidth(7.0);
        System.out.println("Sau khi setWidth(7.0): " + sq3);
        System.out.println("Width: " + sq3.getWidth() + ", Length: " + sq3.getLength());

        // Test polymorphism
        System.out.println("\n=== TEST POLYMORPHISM ===");
        Shape[] shapes = new Shape[4];
        shapes[0] = new Shape("orange", true);
        shapes[1] = new Circle(2.0, "red", false);
        shapes[2] = new Rectangle(3.0, 4.0, "blue", true);
        shapes[3] = new Square(5.0, "green", false);

        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Circle) {
                Circle c = (Circle) shape;
                System.out.println("  Area: " + c.getArea());
                System.out.println("  Perimeter: " + c.getPerimeter());
            } else if (shape instanceof Rectangle) {
                Rectangle r = (Rectangle) shape;
                System.out.println("  Area: " + r.getArea());
                System.out.println("  Perimeter: " + r.getPerimeter());
            }
        }
    }
}
