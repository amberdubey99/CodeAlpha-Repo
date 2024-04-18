import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter the grades for students (Enter -1 to finish):");

        
        while (true) {
            System.out.print("Enter grade (or -1 to finish): ");
            double grade = scanner.nextDouble();
            if (grade == -1)
                break;
            grades.add(grade);
        }

        
        double total = 0;
        for (double grade : grades) {
            total += grade;
        }
        double average = total / grades.size();

        
        double highest = Collections.max(grades);
        double lowest = Collections.min(grades);

       
        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        scanner.close();
    }
}
