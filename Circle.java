package baitap4_5;

class Circle extends Shape {
    private double radius = 1.0;

    // Constructor mặc định
    public Circle() {
        super();
        this.radius = 1.0;
    }

    // Constructor với radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor đầy đủ
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter và Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle[Shape[color=" + getColor() + ",filled=" + isFilled() + "],radius=" + radius + "]";
    }
}