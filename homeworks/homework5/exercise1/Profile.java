package homework5.exercise1;

import homework5.exercise2.MissingShippingInfoException;

public class Profile {
    
    //Dependency Injection
    
    private ShippingInfo info ;

    //Lösung um Law of Demeter nicht zu brechen
    public String getShippingCity(){
        return info.getCity() ;
    }
    
    public Profile(ShippingInfo info) throws MissingShippingInfoException {
        if(info == null) {
            throw new MissingShippingInfoException("Shippinginfo is missing");
        }
        this.info = info;
    }

    public ShippingInfo getInfo() {
        return info;
    }

    public void setInfo(ShippingInfo info) {
        this.info = info;
    }

    
}
