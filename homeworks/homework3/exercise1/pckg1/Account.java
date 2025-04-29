package homework3.exercise1.pckg1;

import java.util.Scanner;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public Account(String owner, double balance, int pin) {
        this.owner = owner;
        this.balance = balance;
        this.pin = pin;
    }


    public double getBalance() {
        return balance;
    }

    public void changePin() {
        Scanner s = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre alte Pin ein");
        int oldPin = s.nextInt();
        System.out.println("Bitte geben Sie jetzt ihre neue Pin ein!");
        int newPin = s.nextInt();
        if(oldPin == this.pin) {
            this.setPin(newPin);
            System.out.println("Pin erfolgreich geändert");
        } else {
            System.out.println("Sie haben Ihre bestehende Pin falsch eingegeben.");
            System.out.println("Änderung nicht möglich.");
        }
        s.close();
    }


    public int getPin() {
        return pin;
    }


    public void setPin(int pin) {
        this.pin = pin;
    }

    

    
}
