package homeworks.homework2.exercise1;

public class Publication {
    private String title;
    private int year;

    public Publication(String title, int year) {
        this.title = title;
        this.year = year;
    }

    String getInfo() {
        return "Title: " + title + ", published in " + year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    

}