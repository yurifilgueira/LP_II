package application;

import entities.Classroom;
import entities.Exam;
import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Classroom classroom = new Classroom();

        classroom.addStudent(new Student("Ronaldo", new Exam(2.5, 4.0), new Exam(3.0, 5.0)));
        classroom.addStudent(new Student("Jubileu", new Exam(6.2, 3.2), new Exam(1.5, 1.5)));
        classroom.addStudent(new Student("Bernadette", new Exam(3.3, 4.2), new Exam(1.0, 8.0)));

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