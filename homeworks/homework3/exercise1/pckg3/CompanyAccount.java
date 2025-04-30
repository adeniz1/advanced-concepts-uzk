package homework3.exercise1.pckg3;

import homework3.exercise1.pckg1.Account;

public class CompanyAccount extends Account {

    public CompanyAccount(String owner, double balance, int pin) {
        super(owner, balance, pin);
    }
    
    public static void main(String[] args) {
        CompanyAccount acc = new CompanyAccount("Company", 1000.0, 1234);
        System.out.println(acc.getBalance()); // 1000.0
        System.out.println(acc.pin); // 1234

        System.out.println(acc.getBalance()); // 1000.0
        System.out.println(acc.pin); // 1234

        Account acc2 = new Account("Company", 100, 100);
        //System.out.println(acc2.pin); // darauf kann nicht zugegriffen werden, da nicht vom Typ Account
        System.out.println(acc2.owner);
        //System.out.println(acc.internalNote);
        
    }

    
}
