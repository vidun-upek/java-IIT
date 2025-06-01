import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=scanner.nextInt();

        if (age>=18){
            System.out.println("Over 18");
        }
        else if(age>0 && age<18){
            System.out.println("Below 18");
        }
        else{
            System.out.println("Entered age is incorrect");

        }
    }
    
}
