
package inClassExercises.sheet5.exercise2 ;
public class CreditCardPayment implements PaymentProvider {

    @Override
    public void pay(double amount) {
        System.out.println("Es wurden " + amount + " Geld gezahlt.");
        System.out.println("von Kreditkarte xy");
       
    }

}