public class Publication {
    String title;
    int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    String getInfo() {
        return "Title: " + title + ", published in " + year;
    }

}