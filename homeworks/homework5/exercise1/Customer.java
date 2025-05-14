package homework5.exercise1;

public class Customer {
    
    //Dependency Injection
    // braucht ein Profile
    // erstellt es aber nicht selbst
    // wird von außen übergeben
    private Profile profile ;
    private int id ;

    //Constructor
    public Customer(Profile profile, int id) {
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
