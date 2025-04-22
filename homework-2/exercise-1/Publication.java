public class Publicaton {
    String title;
    int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    getInfo() {
        return "Title: " + title + ", published in " + year;
    }

}