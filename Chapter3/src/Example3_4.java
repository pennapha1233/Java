import java.util.Scanner;

public class Example3_4 {
    public static void main(String[] args) {
        double score;
        Scanner scanner = new Scanner(System.in);
        String grade;

        System.out.println("Program Calculate grade.");
        System.out.print("Enter student score : ");
        score = scanner.nextDouble();
        if (score >= 80.0)
            grade = "A";
        else if (score >= 75.0)
            grade = "B+";
        else if (score >= 70.0)
            grade = "B";
        else if (score >= 65.0)
            grade = "C+";
        else if (score >= 60.0)
            grade = "C";
        else if (score >= 55.0)
            grade = "D+";
        else if (score >= 50.0)
            grade = "D";
        else 
            grade = "F";
        System.out.println("Student grade is " + grade);
        System.out.println("End Program.");
        scanner.close();
    }
    
}

