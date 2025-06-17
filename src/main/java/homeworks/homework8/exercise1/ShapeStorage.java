package homeworks.homework8.exercise1 ;
import java.util.ArrayList;

//Generic immer nach class/interface deklarieren
// um Generic Klasse zu erstellen
public class ShapeStorage<T extends Shape> extends ArrayList<T> {
 // ShapeStorage Generic Klasse mit Typparameter T
 // kann Objekte vom Typ Shape oder Subklassen von Shape speichern
 // Zugriff durch T

    public double getTotalArea(){
        double totalArea = 0.0 ;
        for (T shape : this) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    public void displayAllShapes(){
        for (T shape : this){
            System.out.print(shape.toString());
            System.out.print(" ");
        }
    }

    // U erbt von T => T ist Subtyp von Shape also U auch
    // <U extends T> sagt: T extends Shape => U extends T d.h: U extends Shape
    // Generics stehen immer vor dem Rückgabetyp Modifikator in Methodendeklaration
    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea){
        for (U shape : other){
            if (shape.getArea() >= minArea) {
                this.add(shape); // this = ShapeStorage
            }
        }

    }
    
}