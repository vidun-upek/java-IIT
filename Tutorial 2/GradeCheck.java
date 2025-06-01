import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter your grade: ");
        int grade = scanner.nextInt();

        
        if (grade > 100 || grade < 40) {
            System.out.println("Invalid value");
        } else if (grade >= 70) {
            System.out.println("1st Class Honours (1)");
        } else if (grade >= 60) {
            System.out.println("2nd Class Honours Upper Division (2:i)");
        } else if (grade >= 50) {
            System.out.println("2nd Class Honours Lower Division (2:ii)");
        } else { 
            System.out.println("3rd Class Honours (3)");
        }

        scanner.close();
    }
}
