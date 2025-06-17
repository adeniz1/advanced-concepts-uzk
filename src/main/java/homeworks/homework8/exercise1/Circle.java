package homeworks.homework8.exercise1;

public class Circle extends Shape {

    private int radius ;


    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius ;
    }

     @Override
    public String toString() {
        return "Circle" ;
    }


    
}
