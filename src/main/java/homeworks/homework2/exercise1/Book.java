package homeworks.homework2.exercise1;

class Book extends Publication {
    private String author ;

    public Book(String title, int year,  String author) {
        super(title, year); // Assuming year is not relevant for this class
        this.author = author;
    }
    @Override
    public String getInfo() {
        return super.getInfo() + ", by " + author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
}