package homeworks.homework5.exercise1;

import homeworks.homework5.exercise2.InvalidShippingInfoException;

public class ShippingInfo {

    private String city ;
    private int zip ;
    private String country ;

    //Constructor

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if(city == "" || zip < 0 ) {
            throw new InvalidShippingInfoException("invalid zip or city") ;
        }
        if(city == "") { throw new InvalidShippingInfoException("city is empty!");}
        if(zip <0) { throw new InvalidShippingInfoException("zip cant be negative.");}
        this.city = city;
        this.zip = zip;
        this.country = country;
    }
    
    // Getters and Setters
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }


    
    
}
