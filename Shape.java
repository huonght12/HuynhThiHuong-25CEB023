package baitap4_5;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    // Constructor mặc định
    public Shape() {
        this.color = "red";
        this.filled = true;
    }

    // Constructor có tham số
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // Getter và Setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
