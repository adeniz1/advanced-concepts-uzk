package homework2.exercise3;

import java.time.LocalDateTime;

public class Mail {
    private String senderAdress;
    private String subject;
    private String message;
    private LocalDateTime datetime;
    private boolean isRead;

    public Mail(String senderAdress, String subject, String message, LocalDateTime dateTime, boolean isRead) {
        this.senderAdress = senderAdress;
        this.subject = subject;
        this.message = message;
        this.datetime = dateTime;
        this.isRead = isRead;
    }
    public void markAsRead() {
        this.isRead = true;
    }

    public String getMailHeader() {
        return this.isRead ? "[READ]" : "[UNREAD]" + this.subject + " from" + this.senderAdress + " on " + this.datetime + ": " + this.message ;
    }
    public String getSenderAdress() {
        return senderAdress;
    }
    public void setSenderAdress(String senderAdress) {
        this.senderAdress = senderAdress;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public LocalDateTime getDatetime() {
        return datetime;
    }
    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }
    public boolean isRead() {
        return isRead;
    }
    public void setRead(boolean isRead) {
        this.isRead = isRead;
    }
    

    
}
