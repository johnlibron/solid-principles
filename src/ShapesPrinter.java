import java.util.List;

public class ShapesPrinter {
    // For
    // Instead of depending on the concrete AreaCalculator areaCalculator = new AreaCalculator()
    // We should depend on the abstraction IAreaCalculator
    private final IAreaCalculator areaCalculator;

    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        return String.format("{shapesSum: %s}", areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes) {
        return String.format("shapes_sum,%s}", areaCalculator.sum(shapes));
    }
}
