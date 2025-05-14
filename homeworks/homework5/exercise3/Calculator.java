package homework5.exercise3;

public class Calculator {
    //Variante 1
    public static double divide(double a, double b){
        try {
            return  (a / b );
        } catch (ArithmeticException e) {
            System.out.println("You can not divide by zero!");
            System.out.println(e);
            return Double.NaN ;
        }

    }
 //...
public static void main(String[] args){
    // Variante 1
    System.out.println(Calculator.divide(3, 0));

    //Variante 2
    try {
        System.out.println(Calculator.divide(3, 0));
    }
    catch(ArithmeticException e) {
        System.out.println("You can not divide by zero!");
    }
 }
    
}
