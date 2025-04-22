package homework2.exercise3;

import java.util.ArrayList;

public class Inbox {
    private ArrayList<Mail> mails ;

    public Inbox() {
        mails = new ArrayList<Mail>();
    }

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public Mail getMail(int index) {
        if (index < 0 || index >= mails.size()) {
            System.out.println("Invalid index");
            return null ;
        }
        Mail mail = mails.get(index);
        return mail ;
    }

    public void printAllMailHeaders() {
        int i = 0 ;
        for (Mail mail : mails) {
            System.out.println("Mail Number " + i);
            System.out.println("isRead? " + mail.isRead() + " " + "Subject: " 
            + mail.getSubject() + " " + "Sender: " + mail.getSenderAdress() 
            + " " + "Datetime: " + mail.getDatetime() + " " + "Message: " + mail.getMessage());
            i+=1;
        }
    }

    public Mail open(int index) {
        if (index < 0 || index >= mails.size()) {
            return null; // Invalid index
        }
        Mail mail = mails.get(index);
        mail.markAsRead(); // Mark the mail as read
        System.out.println("Mail opened: " + mail.getMailHeader());
        return mail;
    }

    public int countUnread() {
        int count = 0 ;
        for (Mail mail : mails) {
            if(!mail.isRead()) {
                count+=1 ;
            }
        }
        return count;
    }
}
