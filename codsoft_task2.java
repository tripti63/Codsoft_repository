import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

    
        for (int i = 1; i <= numSubjects; i++) {
            double marks;
            do {
                System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
                marks = scanner.nextDouble();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            
            totalMarks += marks;
        }

        
        double average = totalMarks / numSubjects;

        
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("\n==========  RESULT ==========");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("===============================");

        scanner.close();
    }
}
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

    
        for (int i = 1; i <= numSubjects; i++) {
            double marks;
            do {
                System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
                marks = scanner.nextDouble();
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid input! Marks should be between 0 and 100.");
                }
            } while (marks < 0 || marks > 100);
            
            totalMarks += marks;
        }

        
        double average = totalMarks / numSubjects;

        
        String grade;
        if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        System.out.println("\n==========  RESULT ==========");
        System.out.println("Total Marks: " + totalMarks + " / " + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", average) + "%");
        System.out.println("Grade: " + grade);
        System.out.println("===============================");

        scanner.close();
    }
}
