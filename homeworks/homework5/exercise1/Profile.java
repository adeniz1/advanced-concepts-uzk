package homework5.exercise1;

public class Profile {
    
    //Dependency Injection
    
    private ShippingInfo info ;

    //Lösung um Law of Demeter nicht zu brechen
    public String getShippingCity(){
        return info.getCity() ;
    }
    
    public Profile(ShippingInfo info) {
        this.info = info;
    }

    public ShippingInfo getInfo() {
        return info;
    }

    public void setInfo(ShippingInfo info) {
        this.info = info;
    }

    
}
