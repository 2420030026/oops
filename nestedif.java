public class GradeCalculator {

    public static void main(String[] args) {
        double score = 85.5;

        printGrade(score);
    }

    public static void printGrade(double score) {
        if (score < 0.0 || score > 100.0) {
            System.out.println("Invalid score. Please enter a value between 0 and 100.");
        } else if (score >= 90.0) {
            System.out.println("Grade: A");
        } else if (score >= 80.0) {
            System.out.println("Grade: B");
        } else if (score >= 70.0) {
            System.out.println("Grade: C");
        } else if (score >= 60.0) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}