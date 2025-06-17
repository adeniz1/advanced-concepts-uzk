package homeworks.homework8.exercise2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import homeworks.homework8.exercise1.Shape;

public class ShapeAnalyzer {

    static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea){
        ArrayList<Shape> list = new ArrayList<>();

        for (Shape s : shapes){
            if(s.getArea() >= minArea) {
                list.add(s);
            }
        }
        return list;
        
    }

    static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes){
        double max = Double.MAX_VALUE;
        Shape maxShape = null ;
        for(Shape s : shapes){
            if(s.getArea()>max){
                max = s.getArea();
                maxShape = s ;
            }

        }
        return maxShape ;
    }
    
    public static <T extends Shape> Map<String, List<T>> groupByType(Collection<T> shapes) {
        Map<String, List<T>> grouped = new HashMap<>();
        
        for (T shape : shapes) {
            String type = shape.getClass().getSimpleName();
            grouped.computeIfAbsent(type, k -> new ArrayList<>()).add(shape);
            /*computeIfAbsent(type,k -> ... ) bedeutet schaue ob in der Hashmap der Schlüssel type
             existiert. Wenn ja füge dort hin (...) hinzu, sonst erstelle ein type key und 
             füge ... hinzu
            */
        }
        
        return grouped;
    }

}
