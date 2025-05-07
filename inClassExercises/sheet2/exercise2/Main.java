package inClassExercises.sheet2.exercise2;

import java.util.ArrayList;

public class Main {

    public static void printInfoForAll(ArrayList<Person> people) {
        for(Person ppl : people) {
            if(ppl instanceof PhDStudent){
                ppl = (PhDStudent)ppl ;
            }
            if(ppl instanceof Student) {
                ppl = (Student)ppl;
            }
            System.out.println(ppl.getInfo());
        } 
    }

    public static void main (String[] args){
        Person p1 = new Person("Alice","Anders",34);
        System.out.println(p1.getInfo());

        Student s = new Student("Bob","Bücher",22,456789,3);
        s.addCourse("Advanced Programming Concepts");
        s.addCourse("Mathematik für Studierende der Informatik");
        s.printCourseList();

        Person p2 = new Student("Bob", "Anders",23,34556,8);
        PhDStudent phd1 = new PhDStudent("A", "D",20, 78990, 10);

        ArrayList<Person> ppls = new ArrayList<>();
        ppls.add(p1);
        ppls.add(p2);
        ppls.add(phd1);

        printInfoForAll(ppls);

    }
    
}
