//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


public class Main {
    public static void main(String[] args) {
        GeometricObject c = new Circle(5);
        GeometricObject r = new Rectangle(4, 7);

        System.out.println(c.toString());
        System.out.println("Area Circle =" + c.getArea());
        System.out.println("Perimeter Circle =" + c.getPerimeter());
        System.out.println();
        System.out.println(r.toString());
        System.out.println("Area Rectangle =" + r.getArea());
        System.out.println("Perimeter Rectangle =" + r.getPerimeter());
    }
}
