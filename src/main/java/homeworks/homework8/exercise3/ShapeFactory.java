package homeworks.homework8.exercise3;

import homeworks.homework8.exercise1.Circle;
import homeworks.homework8.exercise1.Rectangle;
import homeworks.homework8.exercise1.Shape;

public class ShapeFactory {
    public static Shape fromString(String input) throws IllegalArgumentException {
        if (input == null || !input.contains(":")) {
            throw new IllegalArgumentException("Invalid format (missing ':')");
        }

        String[] parts = input.split(":", 2);
        String type = parts[0].trim();
        String params = parts[1].trim();

        try {
            switch (type) {
                case "Circle":
                    double radius = parseDouble(params, "radius");
                    return new Circle(radius);
                case "Rectangle":
                    double width = parseDouble(params, "width");
                    double length = parseDouble(params, "length");
                    return new Rectangle(width, length);
                default:
                    throw new IllegalArgumentException("Unknown shape type: " + type);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid number format in input: " + input);
        }
    }

    private static double parseDouble(String paramString, String key) {
        for (String param : paramString.split(",")) {
            String[] pair = param.trim().split("=");
            if (pair.length == 2 && pair[0].trim().equals(key)) {
                return Double.parseDouble(pair[1].trim());
            }
        }
        throw new IllegalArgumentException("Missing key: " + key);
    }
}
