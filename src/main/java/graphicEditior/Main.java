package graphicEditior;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape parallelogram = new Parallelogram();
        Shape quad = new Quad();
        Shape rectangle = new Rectangle();
        Shape trapeze = new Trapeze();
        Shape triangle = new Triangle();

        new PrintShapeName(circle);
        circle.printName();
    }
}