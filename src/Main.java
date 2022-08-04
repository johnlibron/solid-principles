import java.util.List;

public class Main {
    public static void main(String[] args) {
        // For Dependency Inversion:
        // Change AreaCalculator to IAreaCalculator
        // If you add version 2, it will not break
        // AreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        // For Liskov Substitution:
        // You can substitute the other shapes into Shape class
        Shape circle = new Circle(10);
        Shape square = new Square(10);
        // For Interface Segregation:
        // Don't add volume in the Shape class
        // other shapes cannot calculate volume
        // You just need to create another interface to put the volume
        // and just implements it like the Cube
        Shape cube = new Cube();
        Shape rectangle = new Rectangle();
        NoShape noShape = new NoShape();
        ShapesPrinter shapesPrinter = new ShapesPrinter(areaCalculator);
        shapesPrinter = new ShapesPrinter(areaCalculatorV2);
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        // int sum = areaCalculator.sum(shapes);
        // For Single Responsibility:
        // Don't add the json and csv methods in AreaCalculator class
        // Transfer these methods to ShapesPrinter
        System.out.println(shapesPrinter.json(shapes));
        System.out.println(shapesPrinter.csv(shapes));
    }
}
