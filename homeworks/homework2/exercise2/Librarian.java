package homework2.exercise2;

class Librarian extends User {
    String department = "Reference";

    @Override
    public String getRole() {
        return this.name + " Librarian";
    }

    public void work() {
        System.out.println("Librarian is working...");
    }
}