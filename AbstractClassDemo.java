abstract class Figure {
    String name;

    Figure(String name) { this.name = name; }

    abstract double area();   // abstract method

    void display() {          // concrete method
        System.out.println(name + " -> Area = " + area());
    }
}

class CircleFigure extends Figure {
    double r;
    CircleFigure(double r) { super("Circle"); this.r = r; }
    double area() { return 3.14159 * r * r; }
}

class RectangleFigure extends Figure {
    double l, b;
    RectangleFigure(double l, double b) { super("Rectangle"); this.l = l; this.b = b; }
    double area() { return l * b; }
}

class TriangleFigure extends Figure {
    double base, height;
    TriangleFigure(double base, double height) { super("Triangle"); this.base = base; this.height = height; }
    double area() { return 0.5 * base * height; }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Figure[] shapes = { new CircleFigure(5), new RectangleFigure(4, 6), new TriangleFigure(3, 8) };
        for (Figure s : shapes) s.display();
    }
}
