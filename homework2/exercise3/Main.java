package homework2.exercise3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Erstelle eine Inbox
        Inbox inbox = new Inbox();

        // Füge einige E-Mails hinzu
        inbox.addMail(new Mail("max@beispiel.com", "Meeting morgen", "Hallo, das Meeting morgen wurde auf 10:00 Uhr verschoben.", 
                               LocalDateTime.of(2025, 4, 22, 8, 0), false));
        inbox.addMail(new Mail("julia@beispiel.com", "Urlaubsantrag", "Ich habe meinen Urlaubsantrag für nächsten Monat eingereicht.", 
                               LocalDateTime.of(2025, 4, 21, 14, 0), false));
        inbox.addMail(new Mail("hr@unternehmen.com", "Bewerbung", "Vielen Dank für Ihre Bewerbung! Wir werden uns bald bei Ihnen melden.", 
                               LocalDateTime.of(2025, 4, 20, 9, 0), true));

        // Ausgabe der Anzahl ungelesener E-Mails
        System.out.println("Anzahl ungelesener E-Mails: " + inbox.countUnread());

        // Ausgabe der Mail-Header
        System.out.println("\nAlle Mail-Header:");
        inbox.printAllMailHeaders();

        // Öffne die erste E-Mail
        System.out.println("\nÖffne E-Mail 1:");
        inbox.open(0);  // Öffnet die erste E-Mail

        // Markiere E-Mails als gelesen
        inbox.getMail(0).markAsRead();
        inbox.getMail(1).markAsRead();

        // Ausgabe der Anzahl ungelesener E-Mails nach dem Markieren
        System.out.println("\nAnzahl ungelesener E-Mails nach dem Markieren als gelesen: " + inbox.countUnread());

        // Öffne die zweite E-Mail
        System.out.println("\nÖffne E-Mail 2:");
        inbox.open(1);  // Öffnet die zweite E-Mail
    }
}