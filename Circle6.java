package baitap6_1;

class Circle6 extends Shape{
    protected double radius = 1.0;

    public Circle6(){}
    public Circle6(double radius){
        this.radius=radius;
    }
    public Circle6(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle6[Shape[color=" + color + ",filled=" + filled + "],radius=" + radius + "]";
    }

}
