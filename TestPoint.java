package baitap4_4;

public class TestPoint {
    public static void main(String[] args) {
        System.out.println("=== TEST POINT CLASS ===");

        // Test constructor mặc định
        Point p1 = new Point();
        System.out.println("Point với constructor mặc định: " + p1);

        // Test constructor có tham số
        Point p2 = new Point(3.5f, 4.2f);
        System.out.println("Point(3.5, 4.2): " + p2);

        // Test getter
        System.out.println("p2.getX() = " + p2.getX());
        System.out.println("p2.getY() = " + p2.getY());

        // Test setter
        p2.setX(5.0f);
        p2.setY(6.0f);
        System.out.println("Sau khi setX(5.0) và setY(6.0): " + p2);

        // Test setXY và getXY
        p2.setXY(7.5f, 8.5f);
        System.out.println("Sau khi setXY(7.5, 8.5): " + p2);
        float[] coords = p2.getXY();
        System.out.println("getXY(): [" + coords[0] + ", " + coords[1] + "]");

        System.out.println("\n=== TEST MOVABLEPOINT CLASS ===");

        // Test constructor mặc định
        MovablePoint mp1 = new MovablePoint();
        System.out.println("MovablePoint mặc định: " + mp1);

        // Test constructor với x, y
        MovablePoint mp2 = new MovablePoint(2.0f, 3.0f);
        System.out.println("MovablePoint(2.0, 3.0): " + mp2);

        // Test constructor đầy đủ
        MovablePoint mp3 = new MovablePoint(1.0f, 2.0f, 0.5f, 1.0f);
        System.out.println("MovablePoint(1.0, 2.0, 0.5, 1.0): " + mp3);

        // Test getter speed
        System.out.println("mp3.getXSpeed() = " + mp3.getxSpeed());
        System.out.println("mp3.getYSpeed() = " + mp3.getySpeed());

        // Test setter speed
        mp3.setxSpeed(2.0f);
        mp3.setySpeed(3.0f);
        System.out.println("Sau khi setXSpeed(2.0) và setYSpeed(3.0): " + mp3);

        // Test setSpeed và getSpeed
        mp3.setSpeed(1.5f, 2.5f);
        System.out.println("Sau khi setSpeed(1.5, 2.5): " + mp3);
        float[] speeds = mp3.getSpeed();
        System.out.println("getSpeed(): [" + speeds[0] + ", " + speeds[1] + "]");

        // Test move
        System.out.println("\nTest phương thức move():");
        System.out.println("Trước khi move: " + mp3);
        mp3.move();
        System.out.println("Sau move lần 1: " + mp3);
        mp3.move();
        System.out.println("Sau move lần 2: " + mp3);
        mp3.move();
        System.out.println("Sau move lần 3: " + mp3);

        // Test move liên tiếp (method chaining)
        System.out.println("\nTest move liên tiếp:");
        MovablePoint mp4 = new MovablePoint(0.0f, 0.0f, 1.0f, 1.0f);
        System.out.println("Điểm ban đầu: " + mp4);
        mp4.move().move().move();
        System.out.println("Sau 3 lần move: " + mp4);
    }
}
