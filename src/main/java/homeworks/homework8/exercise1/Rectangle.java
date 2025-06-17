package homeworks.homework8.exercise1;

public class Rectangle extends Shape {

    private double width ;
    private double length;


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length ;
    }

    @Override
    public String toString() {
        return "Rectangle: width=" + width + ", length=" + length;
    }

    
    
}
