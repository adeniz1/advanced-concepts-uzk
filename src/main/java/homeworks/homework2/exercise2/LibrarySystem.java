package homeworks.homework2.exercise2;

public class LibrarySystem {

    public static void main(String[] args) {
        User u1 = new User();
        Librarian l1 = new Librarian();
        User u2 = l1;

        System.out.println(u1.getRole());
        System.out.println(l1.getRole());
        System.out.println(u2.getRole());

        System.out.println(l1.getName());
        System.out.println(u1.getName());

        l1.work();
        //u2.work(); // ❌ Das geht nicht direkt, da User die Methode nicht kennt.
        //Java schaut beim Übersetzen (Kompilieren) nur auf den Variablentyp, nicht auf das tatsächliche (gezeigte) Objekt.
        // Methoden, die nur in der Unterklasse stehen, können nicht über eine Oberklassen-Variable aufgerufen werden.


        u2.getRole(); 
        
    }
}