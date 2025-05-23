package inClassExercises.sheet2.exercise2;

import java.util.ArrayList;

public class Student extends Person {

    private int matNumber ;
    private int age;
    private int semester ;

    private ArrayList<String> courses ;

    

    public Student(String firstName, String lastName, int age ,int matNumber, int semester) {
        super(firstName, lastName, semester);
        this.matNumber = matNumber;
        this.age=age;
        this.semester = semester;
        this.courses = new ArrayList<>();
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
        return "Student : " + super.getInfo() + " Matriculation Number: " + this.matNumber + " Semester: " + this.semester + " Courses: " + this.courses ;
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
