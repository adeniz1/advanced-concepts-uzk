package homework5.exercise1;

import homework5.exercise2.InvalidCustomerException;
import homework5.exercise2.InvalidShippingInfoException;
import homework5.exercise2.MissingShippingInfoException;

public class EComController {
    public static void main(String[] args) {

        try {
             ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

             // Entwurfsprinzip LoD wird gebrochen
        System.out.println("Shipping to: " +
            customer.getProfile().getInfo().getCity());

        //Lösung um Law of Demeter nicht zu brechen
        System.out.println(customer.getShippingCity());
        }
        catch(InvalidCustomerException invalidCustomer){
            invalidCustomer.getMessage();
        }
        catch(MissingShippingInfoException missingShippingInfo){
            missingShippingInfo.getMessage();
        }
        catch(InvalidShippingInfoException invalidShippingInfo){
            invalidShippingInfo.getMessage();
        }

    }
}
