package entities;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    List<Student> students;

    public Classroom() {
        students = new ArrayList<>();
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public void showStudents(){
        int idx = 1;
        for (Student student : students) {
            System.out.println(idx + " - " + student.getName());
            idx++;
        }
    }

    public void showStudentsAverageGrade(){
        int idx = 1;
        for (Student student : students) {
            System.out.println(idx + " - " + student.getName());
            System.out.println("    Average grade: " + String.format("%.2f", student.calulateAverage()));
            idx++;
        }
    }

    public double calculateAverage(){
        return students.stream().mapToDouble(Student::calulateAverage).sum() / students.size();
    }
}