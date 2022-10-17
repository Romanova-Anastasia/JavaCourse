package TasksFromTheInternet.StudentsInTheCollection;

import TasksFromTheInternet.HeavyBox;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//Создать коллекцию, содержащую объекты класса Student.
//Написать метод, который удаляет студентов со средним баллом <3.
//Если средний балл>=3, студент переводится на следующий курс.

public class RunnerStudent {
    public static void main(String[] args) {
        printStudentsPerCourses(new Deanery().getStudentList());
    }

    public static void printStudentsPerCourses(List<Student> students) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Список студентов " + i + " курса:");
            printStudents(students, i);
            System.out.println();
        }
    }

    public static void deleteStudentLessThree (List<Student> students){
        Iterator<Student> iterator = students.listIterator();
        while ((iterator.hasNext())){
            Student element = iterator.next();
            if (element.getGrade() < 3) {
                iterator.remove();
            }
        }
    }

    public static void printStudents(List<Student> students, int course) {
        deleteStudentLessThree(students);
        Iterator<Student> iterator = students.listIterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getCourse() == course) {
                System.out.println(student.getNameStudent() + ", группа - " + student.getGroup() + ", средний балл - " + student.getGrade());
            }
        }
    }
}
