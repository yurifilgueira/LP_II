package entities;

public class Exam {

    private Double gradePart1;
    private Double gradePart2;

    public Exam() {
    }

    public Exam(Double gradePart1, Double gradePart2) {
        this.gradePart1 = gradePart1;
        this.gradePart2 = gradePart2;
    }

    public Double getGradePart1() {
        return gradePart1;
    }

    public void setGradePart1(Double gradePart1) {
        this.gradePart1 = gradePart1;
    }

    public Double getGradePart2() {
        return gradePart2;
    }

    public void setGradePart2(Double gradePart2) {
        this.gradePart2 = gradePart2;
    }

    public double calculateTotalGrade(){

        double totalGrade = gradePart1 + gradePart1;

        if(totalGrade >= 10){
            return 10;
        }

        return (gradePart1 + gradePart2);

    }

    @Override
    public String toString() {
        return "Exam{" +
                "gradePart1=" + gradePart1 +
                ", gradePart2=" + gradePart2 +
                '}';
    }
}
