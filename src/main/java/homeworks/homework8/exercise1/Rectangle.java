package homeworks.homework8.exercise1;

public class Rectangle extends Shape {

    private int width ;
    private int length;


    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public double getArea(){
        return width * length ;
    }

    @Override
    public String toString() {
        return "Rectangle" ;
    }
    
    
}
