package homeworks.homework5.exercise1;

import homeworks.homework5.exercise2.InvalidCustomerException;

public class Customer {
    
    //Dependency Injection
    // braucht ein Profile
    // erstellt es aber nicht selbst
    // wird von außen übergeben
    private Profile profile ;
    private int id ;

    //Constructor
    public Customer(Profile profile, int id) throws InvalidCustomerException {
        if(profile== null){ throw new InvalidCustomerException("Profile is Null.");}
        this.profile = profile;
        this.id = id;
        
    }

    //Lösung um Law of Demeter nicht zu brechen
    public String getShippingCity() {
        return profile.getShippingCity() ;
    }

    // Getters and Setters
    public Profile getProfile() {
        return profile;
    }
    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    
    
}
