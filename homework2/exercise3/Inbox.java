package homework2.exercise3;

import java.util.ArrayList;

public class Inbox {
    private ArrayList<Mail> mails ;

    public Inbox() {
        mails = new ArrayList<Mail>();
    }

    public void outputMailHeaders() {
        for (Mail mail : mails) {
            System.out.println(mail.getMailHeader());
        }
    }


    
}
