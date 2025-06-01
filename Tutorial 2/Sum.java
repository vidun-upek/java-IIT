import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter num 1: ");
        double num1=scanner.nextDouble();
        System.out.println("Enter num 2: ");
        double num2=scanner.nextDouble();

        double total=num1+num2;
        System.out.println("Total is: "+total);

    }
}