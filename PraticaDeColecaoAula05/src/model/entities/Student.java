package model.entities;

public class Student {

    private String name;
    private Exam exam1;
    private Exam exam2;

    public Student() {
    }

    public Student(String name, Exam exam1, Exam exam2) {
        this.name = name;
        this.exam1 = exam1;
        this.exam2 = exam2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Exam getExam1() {
        return exam1;
    }

    public void setExam1(Exam exam1) {
        this.exam1 = exam1;
    }

    public Exam getExam2() {
        return exam2;
    }

    public void setExam2(Exam exam2) {
        this.exam2 = exam2;
    }

    public double calulateAverage(){
        return (exam1.calculateTotalGrade() + exam2.calculateTotalGrade()) / 2;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", exam1=" + exam1 +
                ", exam2=" + exam2 +
                '}';
    }
}
