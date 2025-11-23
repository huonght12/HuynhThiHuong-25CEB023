package baitap6_1;

class Rectangle6 extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;

    public Rectangle6(){}
    public Rectangle6(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle6(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width=width;
        this.length=length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    public double getArea(){
        return width * length;
    }
    public double getPerimeter(){
        return 2 * (width + length);
    }
    public String toString(){
        return "Rectangle6[Shape[color=" + color + ",filled=" + filled + "], width=" + width + ", length=" + length + "]";
    }

}
