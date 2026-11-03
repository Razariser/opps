abstract class Figure {
    abstract double area();
}
class AbsCircle extends Figure {
    double area() { return 3.14 * 5 * 5; }
}
class AbsRect extends Figure {
    double area() { return 4 * 6; }
}
public class AbstractClassDemo {
    public static void main(String[] args) {
        Figure f1 = new AbsCircle();
        Figure f2 = new AbsRect();
        System.out.println("Circle = " + f1.area());
        System.out.println("Rectangle = " + f2.area());
    }
}
