package inClassExercises.sheet2.exercise2;


public class PhDStudent extends Student {

    private String dissTopic;


    public PhDStudent(String firstName, String lastName, int age, int matNumber, int semester) {
        super(firstName, lastName, age, matNumber, semester);  
    }

    public String getInfo() {
        return "Phd Student: " + super.getInfo() + " Dissertation Topic: " + this.dissTopic;

    }

    public String getDissTopic() {
        return dissTopic;
    }

    public void setDissTopic(String dissTopic) {
        this.dissTopic = dissTopic;
    }
    
    
}
