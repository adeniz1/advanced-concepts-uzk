class Textbook extends Book {
    private String subject;

    public Textbook(String title, String author, String subject, int edition) {
        super(title, author);
        this.subject = subject;
        this.edition = edition;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Subject: " + subject;
    }
}