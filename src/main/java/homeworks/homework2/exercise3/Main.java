package homeworks.homework2.exercise3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Inbox inbox = new Inbox();

        inbox.addMail(new Mail("max@beispiel.com", "Meeting morgen",
                "Hallo, das Meeting morgen wurde auf 10:00 Uhr verschoben.",
                LocalDateTime.now(), false));

        inbox.addMail(new Mail("julia@beispiel.com", "Urlaubsantrag",
                "Ich habe meinen Urlaubsantrag für nächsten Monat eingereicht.",
                LocalDateTime.now(), false));

        inbox.addMail(new Mail("hr@unternehmen.com", "Bewerbung",
                "Vielen Dank für Ihre Bewerbung! Wir werden uns bald bei Ihnen melden.",
                LocalDateTime.now(), false));

        // Ausgabe der Header
        System.out.println("Alle Mail-Header:");
        inbox.printAllMailHeaders();

        // Öffne die zweite Mail (Index 1) und markiere sie als gelesen
        System.out.println("\nÖffne Mail 2:");
        inbox.open(1);

        // Zähle ungelesene Mails
        System.out.println("\nUngelesene Mails: " + inbox.countUnread());
    }
}