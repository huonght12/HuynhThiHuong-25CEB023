package baitap4_5;

class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    // Constructor mặc định
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor với width và length
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor đầy đủ
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter và Setter
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Tính diện tích
    public double getArea() {
        return width * length;
    }

    // Tính chu vi
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle[Shape[color=" + getColor() + ",filled=" + isFilled() + "],width=" + width + ",length=" + length + "]";
    }
}

// Class Square kế thừa Rectangle
class Square extends Rectangle {

    // Constructor mặc định
    public Square() {
        super();
    }

    // Constructor với side
    public Square(double side) {
        super(side, side);
    }

    // Constructor đầy đủ
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter cho side
    public double getSide() {
        return getWidth();
    }

    // Setter cho side - set cả width và length cùng giá trị
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth để đảm bảo width = length
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength để đảm bảo width = length
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[Rectangle[Shape[color=" + getColor() + ",filled=" + isFilled() + "],width=" + getWidth() + ",length=" + getLength() + "]]";
    }
}
