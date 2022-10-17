package TasksFromTheInternet.StudentsInTheCollection;
//Создать класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.

public class Student {
    String nameStudent;
    String group;
    int course;
    int grade;

    public Student(String nameStudent, String group, int course, int grade) {
        this.nameStudent = nameStudent;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameStudent='" + nameStudent + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", grade=" + grade +
                '}';
    }
}
