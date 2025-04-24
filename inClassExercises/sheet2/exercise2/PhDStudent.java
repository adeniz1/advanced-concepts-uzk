package inClassExercises.sheet2.exercise2;

import java.util.ArrayList;

public class PhDStudent extends Student {

    private String dissTopic;

    


    public PhDStudent(String firstName, String lastName, int matNumber, int semester, ArrayList<String> courses) {
        super(firstName, lastName, matNumber, semester, courses);
        
    }

    public String getInfo() {
        return super.getInfo() + " Dissertation Topic: " + this.dissTopic;

    }

    public String getDissTopic() {
        return dissTopic;
    }

    public void setDissTopic(String dissTopic) {
        this.dissTopic = dissTopic;
    }
    
    
}
