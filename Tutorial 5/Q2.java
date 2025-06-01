import java.util.Scanner;

public class Q2{

    public static double Addition(double a,double b){
        double result = a+b;
        return result;
    }

    public static double Substraction(double a,double b){
        double result =a-b;
        return result;
    }

    public static void main(String[] args){

        Scanner scanner= new Scanner(System.in);

        while(true){
        System.out.println("********");
        System.out.println("**MENU**");
        System.out.println("********");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Substraction");
        System.out.println(" 3. Quit ");

        int operation = scanner.nextInt();

        if(operation == 1 || operation == 2){
        

        System.out.println("Enter first number: ");
        double user1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        double user2 = scanner.nextDouble();
            if(operation ==1){       
                System.out.println("Result is: "+Addition(user1,user2));
                continue;
            }else{
                System.out.println("Result is: "+Substraction(user1,user2));
                continue;
            }

        }else{
            System.out.println("Program Ended");
            break;
        }

        }

    }
}