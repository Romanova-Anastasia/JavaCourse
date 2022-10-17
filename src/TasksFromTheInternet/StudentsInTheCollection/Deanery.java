package TasksFromTheInternet.StudentsInTheCollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Deanery {
    private List<Student> studentList;

    public Deanery() {
        studentList = new LinkedList<>();
        fillStudentsList();
    }

    public Deanery(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void fillStudentsList() {
        studentList.add(new Student("Alise", "A1", 1, 9));
        studentList.add(new Student("Peter", "B2", 5, 5));
        studentList.add(new Student("Jack", "C1", 3, 2));
        studentList.add(new Student("Helen", "C1", 3, 3));
        studentList.add(new Student("Bob", "C1", 3, 4));
    }


}
