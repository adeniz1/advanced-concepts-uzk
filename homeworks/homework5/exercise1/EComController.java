package homework5.exercise1;

public class EComController {
    public static void main(String[] args) {
        ShippingInfo info = new ShippingInfo("Munich", 80331, "Germany");
        Profile profile = new Profile(info);
        Customer customer = new Customer(profile, 123);

        // Entwurfsprinzip LoD wird gebrochen
        System.out.println("Shipping to: " +
            customer.getProfile().getInfo().getCity());

    }
}
