package homeworks.homework8.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import homeworks.homework8.exercise1.Circle;
import homeworks.homework8.exercise1.Rectangle;
import homeworks.homework8.exercise1.Shape;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(2.0));
        shapes.add(new Rectangle(3.0, 4.0));
        shapes.add(new Circle(1.0));
        shapes.add(new Rectangle(5.0, 5.0));
        shapes.add(new Circle(3.5));
        System.out.println("All Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        // filter shapes with area >= 15
        System.out.println("\nShapes with area >= 15:");
        List<Shape> filtered = ShapeAnalyzer
                .filterByMinArea(shapes, 15);
        for (Shape shape : filtered) {
            System.out.println(shape);
        }
        // find shape with max area
        Shape maxShape = ShapeAnalyzer
                .findShapeWithMaxArea(shapes);
        System.out.println("\nShape with max area:");
        System.out.println(maxShape);
        // group by type
        Map<String, List<Shape>> grouped = ShapeAnalyzer
                .groupByType(shapes);
        // print
        System.out.println("\nGrouped by type:");
        for (Map.Entry<String, List<Shape>> entry : grouped.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Shape shape : entry.getValue()) {
                System.out.println(" " + shape);
            }
        }
    }

}
