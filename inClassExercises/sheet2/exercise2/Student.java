package inClassExercises.sheet2.exercise2;

import java.util.ArrayList;

public class Student extends Person{

    private int matNumber ;
    private int semester ;

    private ArrayList<String> courses ;

    

    public Student(String firstName, String lastName, int matNumber, int semester, ArrayList<String> courses) {
        super(firstName, lastName, semester);
        this.matNumber = matNumber;
        this.semester = semester;
        this.courses = courses;
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void printCourseList() {
        int init = 0 ;
        for( String c : courses) {
            init+=1;
            System.out.println("Course " + init + " " + c);
        }
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " Matriculation Number: " + this.matNumber + " Semester: " + this.semester + " Courses: " + this.courses ;
    }

    public int getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(int matNumber) {
        this.matNumber = matNumber;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<String> courses) {
        this.courses = courses;
    }
    
    
    
    
}
