import java.util.Scanner;
public class ExamEligible {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of classes held: ");
        int ClassHeld=scanner.nextInt();

        System.out.println("Enter number of classes attended: ");
        int ClassAttend=scanner.nextInt();

        System.out.println("Did you had a Medical Emergency(Y/N): ");
        char Medical=scanner.next().charAt(0);

        double Percentage=((double)ClassAttend/ClassHeld)*100;

        if(Percentage<75){
            if(Medical == 'Y'|| Medical == 'y'){
                System.out.println("Able to sit to Exam ");
            }
            else{
            System.out.println("Not able to sit to Exam"+ "Your Attendance is: "+Percentage);
            }
        }
        else{
            System.out.println("Able to sit to Exam");
        }
        scanner.close();

    }
    
}
