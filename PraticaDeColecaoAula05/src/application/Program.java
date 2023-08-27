package application;

import model.entities.Classroom;
import model.entities.Exam;
import model.entities.Student;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Classroom classroom = new Classroom();

        classroom.addStudent(new Student("Ronaldo", new Exam(2.5, 4.0), new Exam(3.0, 5.0)));
        classroom.addStudent(new Student("Jubileu", new Exam(4.7, 4.8), new Exam(1.5, 1.5)));
        classroom.addStudent(new Student("Bernadette", new Exam(3.3, 4.2), new Exam(4.0, 5.0)));

        System.out.println("Students: ");
        classroom.showStudents();

        System.out.println();

        System.out.println("Students average grade: ");
        classroom.showStudentsAverageGrade();

        System.out.println();

        System.out.println("Classroom average grade: ");
        System.out.println(String.format("%.2f", classroom.calculateAverage()));
    }
}