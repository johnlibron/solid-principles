import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator {

    @Override
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            // For Open Closed:
            // Don't modify the class especially adding the condition for Cube class
            // Add Shape interface and implements to get the area of all the shapes
            sum += shapes.get(i).area();
            // Object shape = shapes.get(i);
            // if (shape instanceof Square) {
            //     sum += Math.pow(((Square) shape).getLength(), 2);
            // }
            // if (shape instanceof Circle) {
            //     sum += Math.PI * Math.pow(((Circle) shape).getRadius(), 2);
            // }
            // if (shape instanceof Cube) {
            // }
        }
        return sum;
    }
}
