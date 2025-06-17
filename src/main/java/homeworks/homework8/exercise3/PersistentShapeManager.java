package homeworks.homework8.exercise3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import homeworks.homework8.exercise1.Shape;

public class PersistentShapeManager {
 public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                System.out.println("Wird gespeichert: " + shape.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                try {
                    Shape shape = ShapeFactory.fromString(line);
                    shapes.add(shape);
                } catch (IllegalArgumentException e) {
                    System.err.println("Invalid line skipped: " + line);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return shapes;
    }

    public static void clearFile(String filename) {
        try (PrintWriter writer = new PrintWriter(filename)) {
            // Öffnet und überschreibt mit nichts → Datei wird geleert
        } catch (IOException e) {
            System.err.println("Error clearing file: " + e.getMessage());
        }
    }
}
