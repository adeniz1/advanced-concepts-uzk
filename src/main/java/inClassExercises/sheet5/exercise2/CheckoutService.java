package inClassExercises.sheet5.exercise2;

public class CheckoutService {

    private PaymentProvider paymentProvider ;

    public CheckoutService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

    void processPayment(double amount){
        if(paymentProvider instanceof CreditCardPayment){
            CreditCardPayment cc = (CreditCardPayment) paymentProvider;
            cc.pay(amount);
        }
        if(paymentProvider instanceof PayPalPayment) {
            PayPalPayment pp = (PayPalPayment)paymentProvider;
            pp.pay(amount);
        }
        
    }

    public static void main (String [] args){
        PayPalPayment p = new PayPalPayment();
        CheckoutService checkoutService = new CheckoutService(p);
        checkoutService.processPayment(10);


        System.out.println();
    }

    
    
}
