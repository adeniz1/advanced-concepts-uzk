package homeworks.homework8.exercise1;

public class Circle extends Shape {

    private double radius ;


    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius ;
    }

    @Override
        public String toString() {
            return "Circle: radius=" + radius;
        }



    
}
