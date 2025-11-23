package baitap4_3;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D p2d1 = new Point2D(1.5f, 2.5f);
        System.out.println("Point2D: " + p2d1);
        System.out.println("X: " + p2d1.getX() + ", Y: " + p2d1.getY());

        float[] xy = p2d1.getXY();
        System.out.println("Array XY: [" + xy[0] + ", " + xy[1] + "]");

        p2d1.setXY(3.0f, 4.0f);
        System.out.println("After setXY: " + p2d1);

        System.out.println();

        // Test Point3D
        Point3D p3d1 = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d1);
        System.out.println("X: " + p3d1.getX() + ", Y: " + p3d1.getY() + ", Z: " + p3d1.getZ());

        float[] xyz = p3d1.getXYZ();
        System.out.println("Array XYZ: [" + xyz[0] + ", " + xyz[1] + ", " + xyz[2] + "]");

        p3d1.setXYZ(5.0f, 6.0f, 7.0f);
        System.out.println("After setXYZ: " + p3d1);

        System.out.println();

        // Test default constructors
        Point2D p2d2 = new Point2D();
        Point3D p3d2 = new Point3D();
        System.out.println("Default Point2D: " + p2d2);
        System.out.println("Default Point3D: " + p3d2);
    }
}


