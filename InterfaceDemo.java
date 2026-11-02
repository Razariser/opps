interface Shape {
    double PI = 3.14159;
    double area();
    double perimeter();
}

class Circle implements Shape {
    double r;
    Circle(double r) { this.r = r; }
    public double area() { return PI * r * r; }
    public double perimeter() { return 2 * PI * r; }
}

class Rectangle implements Shape {
    double l, b;
    Rectangle(double l, double b) { this.l = l; this.b = b; }
    public double area() { return l * b; }
    public double perimeter() { return 2 * (l + b); }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        System.out.println("Circle (r=5)");
        System.out.println("Area      : " + c.area());
        System.out.println("Perimeter : " + c.perimeter());

        System.out.println("\nRectangle (4 x 6)");
        System.out.println("Area      : " + r.area());
        System.out.println("Perimeter : " + r.perimeter());
    }
}
