package homework3.exercise2;

public class Main {
    public static void main(String[] args) {
        Message m1 = new Email();
        Message m2 = new SMS();

        System.out.println(m1.getType());
        System.out.println(m2.getType());
        //m1.send(); // Uncomment this line and explain what happens
        //m1.send() kann nicht aufgerufen werden, da der statische Typ "Message" ist, und Message keine Methode namens send hat.
        // Wenn wir m1 in senen dynamischen Typ umwandeln, können wir m1.send() aufrufen.


    }
    
}
