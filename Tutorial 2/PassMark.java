import java.util.Scanner;
public class PassMark {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter ICT 1 marks:");
        double ictMark=scanner.nextDouble();
        System.out.println("Enter CW marks: ");
        double cwMark=scanner.nextDouble();

        double finalmark=(ictMark+cwMark)/2;

        if (ictMark >= 30 && cwMark >= 30) {
            
            double finalMark = (ictMark + cwMark) / 2;

            
            if (finalMark >= 40) {
                System.out.println("You passed the module!");
                System.out.println("Final mark: " + finalMark);
            } else {
                System.out.println("You did not pass the module.");
                System.out.println("Final mark: " + finalMark);
            }
        } else {
           
            System.out.println("You failed because one or both marks are below 30.");
        }

        scanner.close(); 
    }
}