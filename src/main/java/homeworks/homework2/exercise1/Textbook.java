package homeworks.homework2.exercise1;

class Textbook extends Book {
    private String subject;

    public Textbook(String title, int year, String author, String subject) {
        super(title, year, author);
        this.subject = subject;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Subject: " + subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}