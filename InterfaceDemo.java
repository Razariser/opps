interface Shape {
    double area();
}
class Circle implements Shape {
    public double area() { return 3.14 * 5 * 5; }
}
class Rect implements Shape {
    public double area() { return 4 * 6; }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        Shape s1 = new Circle();
        Shape s2 = new Rect();
        System.out.println("Circle area = " + s1.area());
        System.out.println("Rectangle area = " + s2.area());
    }
}
